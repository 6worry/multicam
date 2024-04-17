package multicam.java.hw.sql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class PreparedDeleteTest {
	public static void main(String[] args) {
		PreparedDeleteTest obj = new PreparedDeleteTest();
		Scanner key = new Scanner(System.in);
		System.out.println("삭제할 아이디: ");
		String id = key.next();
		obj.delete(id);
	}
	
	public void delete(String id) {
		String url = "jdbc:oracle:thin:@127.0.0.1:1521:xe";
		String user = "scott";
		String password = "1111";
		String sql = "DELETE FROM member WHERE id = ?";
		String sql2 = "SELECT * FROM member";
		
		Connection con = null;
		Statement state = null;
		PreparedStatement ptmt = null;
		ResultSet result = null;
		
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			con = DriverManager.getConnection(url, user, password);
			state = con.createStatement();
			ptmt = con.prepareStatement(sql);
			
			ptmt.setString(1, id);
			ptmt.executeUpdate();
			
			result = state.executeQuery(sql2);
			
			while(result.next()) {
				System.out.println(result.getString("id") + "\t" + result.getString("addr"));
			}
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				if(result != null) result.close();
				if(ptmt != null) ptmt.close();
				if(state != null) state.close();
				if(con != null) con.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}
}