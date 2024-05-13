package multicam.java.hw.sql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class LoginTest {
	public static void main(String[] args) {
		String url = "jdbc:oracle:thin:@127.0.0.1:1521:xe";
		String user = "scott";
		String password = "1111";
		String sql = "SELECT * FROM member WHERE id = ? and pass = ?";
		String sql2 = "SELECT * FROM member WHERE id = 'bts1' and pass = '1234'";
		Connection con = null;
		Statement state = null;
		ResultSet result = null;
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			con = DriverManager.getConnection(url, user, password);
//			PreparedStatement state = con.prepareStatement(sql);
//			state.setString(1, "bts1");
//			state.setString(2, "1234");
//			ResultSet result = state.executeQuery();
			state = con.createStatement();
			state.executeUpdate(sql2);
			result = state.executeQuery(sql2);
			
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