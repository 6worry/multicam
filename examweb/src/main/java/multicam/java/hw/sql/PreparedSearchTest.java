package multicam.java.hw.sql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class PreparedSearchTest {
	public static void main(String[] args) {
		PreparedSearchTest obj = new PreparedSearchTest();
		Scanner key = new Scanner(System.in);
		System.out.println("찾을 주소: ");
		String SearchAddr = key.next();
		obj.search(SearchAddr);
	}
	
	public void search(String SearchAddr) {
		String url = "jdbc:oracle:thin:@127.0.0.1:1521:xe";
		String user = "scott";
		String password = "1111";
		String sql = "SELECT * FROM member WHERE addr LIKE ?";
		
		Connection con = null;
		PreparedStatement ptmt = null;
		ResultSet result = null;
		
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			con = DriverManager.getConnection(url, user, password);
			ptmt = con.prepareStatement(sql);
			
			ptmt.setString(1, "%" + SearchAddr + "%");
			ptmt.executeUpdate();
			
			result = ptmt.executeQuery();
			while(result.next()) {
				System.out.println(result.getString("id") + "\t" + result.getString("addr"));
			}
		} catch (ClassNotFoundException | SQLException e) {
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