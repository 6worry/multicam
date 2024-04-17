package multicam.java.hw.sql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class PreparedLoginTest {
	public static void main(String[] args) {
		PreparedLoginTest obj = new PreparedLoginTest();
		Scanner key = new Scanner(System.in);
		System.out.println("아이디: ");
		String id = key.nextLine();
		System.out.println("비밀번호: ");
		String pw = key.nextLine();
		obj.login(id, pw);
	}
	
	public void login(String id, String pw) {
		String url = "jdbc:oracle:thin:@127.0.0.1:1521:xe";
		String user = "scott";
		String password = "1111";
		String sql = "SELECT * FROM member WHERE id = ? and pass = ?";
//		String sql2 = "SELECT * FROM member WHERE id = '" + id + "' and pass = '" + pw + "'";
		Connection con = null;
		Statement state = null;
		ResultSet result = null;
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			con = DriverManager.getConnection(url, user, password);
			PreparedStatement ptmt = con.prepareStatement(sql);
			ptmt.setString(1, id);
			ptmt.setString(2, pw);
			result = ptmt.executeQuery();
//			state = con.createStatement();
//			state.executeUpdate(sql2);
//			result = state.executeQuery(sql2);
			
			if(result.next()) {
				System.out.println(result.getString("name") + "님 로그인 성공");
			} else {
				System.out.println("로그인 실패");
			}
			
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				if(result != null) {
					result.close();
				}
				
				if(state != null) {
					state.close();
				}
				
				if(con != null) {
					con.close();
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
			
		}
	}
}