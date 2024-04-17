package multicam.java.hw.sql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class PreparedSelectTest {
	public static void main(String[] args) {
		PreparedSelectTest obj = new PreparedSelectTest();
		Scanner key = new Scanner(System.in);
		System.out.println("찾는 아이디: ");
		String id = key.next();
		obj.select(id);
	}
	
	public void select(String id) {
		String url = "jdbc:oracle:thin:@127.0.0.1:1521:xe";
		String user = "scott";
		String password = "1111";
		String sql = "SELECT * FROM member WHERE id = ?";
		
		Connection con = null;
		PreparedStatement ptmt = null;
		ResultSet result = null;
		
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			con = DriverManager.getConnection(url, user, password);
			ptmt = con.prepareStatement(sql);
			
			ptmt.setString(1, id);
			
			result = ptmt.executeQuery();
			
			while(result.next()) {
				System.out.println(result.getString("id") + " " + result.getString("addr"));
			}
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				if(result != null) result.close();
				if(ptmt != null) ptmt.close();
				if(con != null) con.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}		
	}
}