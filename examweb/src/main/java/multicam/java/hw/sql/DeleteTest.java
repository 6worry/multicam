package multicam.java.hw.sql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DeleteTest {
	public static void main(String[] args) {
		String url = "jdbc:oracle:thin:@127.0.0.1:1521:xe";
		String user = "scott";
		String password = "1111";
		String sql = "UPDATE member SET id = 'test' WHERE id = 'bts1'";
		String sql2 = "DELETE FROM member WHERE id = 'test'";
		String sql3 = "SELECT * FROM member";
		
		Connection con = null;
		Statement state = null;
		ResultSet result = null;
		
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			con = DriverManager.getConnection(url, user, password);
			state = con.createStatement();
			state.executeUpdate(sql);
			state.executeUpdate(sql2);
			result = state.executeQuery(sql3);
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
				if(state != null) state.close();
				if(con != null) con.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}
}