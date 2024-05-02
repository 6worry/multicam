package multicam.java.hw.sql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class EmpReadTest {
	public static void main(String[] args) {
		EmpReadTest obj = new EmpReadTest();
		Scanner key = new Scanner(System.in);
		System.out.println("사번: ");
		String EmpNo = key.next();
		
		obj.EmpReadTest2(EmpNo);
	}
	
	public void EmpReadTest2(String EmpNo) {
		String url = "jdbc:oracle:thin:@127.0.0.1:1521:xe";
		String user = "scott";
		String password = "1111";
		String sql = "SELECT * FROM Emp WHERE EMPNo = '" + EmpNo + "'";
		
		Connection con = null;
		Statement state = null;
		ResultSet result = null;
		
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			con = DriverManager.getConnection(url, user, password);
			state = con.createStatement();
			System.out.println(state);
			result = state.executeQuery(sql);
			
			while(result.next()) {
				System.out.println(result.getString("EmpNo") + "\t" + result.getString("Ename") + "\t" + result.getString("Job") + "\t" + result.getString("Sal") + "\t" + result.getString("HireDate") + "\t" + result.getString("DeptNo") + "\t" + result.getString("Comm"));
			}
		} catch (ClassNotFoundException | SQLException e) {
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