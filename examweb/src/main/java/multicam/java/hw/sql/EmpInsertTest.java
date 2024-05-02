package multicam.java.hw.sql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class EmpInsertTest {
	public static void main(String[] args) {
		EmpInsertTest obj = new EmpInsertTest();
		Scanner key = new Scanner(System.in);
		System.out.println("사번: ");
		String EmpNo = key.next();
		System.out.println("성명: ");
		String Ename = key.next();
		System.out.println("JOB: ");
		String Job = key.next();
		
		obj.EmpInsertTest2(EmpNo, Ename, Job);
	}
	
	public void EmpInsertTest2(String EmpNo, String Ename, String Job) {
		String url = "jdbc:oracle:thin:@127.0.0.1:1521:xe";
		String user = "scott";
		String password = "1111";
		String sql = "INSERT INTO Emp (EmpNo, Ename, Job, Sal, Comm, DeptNo, Mgr, HireDate) VALUES ('" + EmpNo + "', '" + Ename + "', '" + Job + "', 3000, 0, null, null, sysdate)";
		
		Connection con = null;
		Statement state = null;
		
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			con = DriverManager.getConnection(url, user, password);
			state = con.createStatement();
			System.out.println(state);
			
			int result = state.executeUpdate(sql);
			System.out.println(result);
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				if(state != null) state.close();
				if(con != null) con.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}
}