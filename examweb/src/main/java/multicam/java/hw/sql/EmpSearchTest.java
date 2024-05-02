package multicam.java.hw.sql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class EmpSearchTest {
	public static void main(String[] args) {
		EmpSearchTest obj = new EmpSearchTest();
		Scanner key = new Scanner(System.in);
		System.out.println("사번: ");
		String EmpNo = key.next();
		System.out.println("성명: ");
		String Ename = key.next();
		System.out.println("JOB: ");
		String Job = key.next();
		System.out.println("급여: ");
		String Sal = key.next();
		System.out.println("이름철자: ");
		String SearchName = key.next();
		
		obj.EmpInsertTest(EmpNo, Ename, Job);
		obj.EmpUpdateTest(EmpNo, Sal);
		obj.EmpSelectTest();
		obj.EmpDeleteTest(EmpNo);
		obj.EmpReadTest(EmpNo);
		obj.EmpSearchTest(SearchName);
	}
	
	public void EmpInsertTest(String EmpNo, String Ename, String Job) {
		String url = "jdbc:oracle:thin:@127.0.0.1:1521:xe";
		String user = "scott";
		String password = "1111";
		String sql = "INSERT INTO Emp (EmpNo, Ename, Job, Sal, Comm, DeptNo, Mgr, HireDate) VALUES ('" + EmpNo + "', '" + Ename + "', '" + Job + "', 3000, 0, null, null, sysdate)";
		
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection con = DriverManager.getConnection(url, user, password);
			Statement state = con.createStatement();
			System.out.println(state);
			
			int result = state.executeUpdate(sql);
			System.out.println(result);
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
	}
	public void EmpUpdateTest(String EmpNo, String Sal) {
		String url = "jdbc:oracle:thin:@127.0.0.1:1521:xe";
		String user = "scott";
		String password = "1111";
		String sql = "UPDATE Emp SET Sal = ('" + Sal + "') WHERE EmpNo = ('" +EmpNo+"')";
		
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection con = DriverManager.getConnection(url, user, password);
			Statement state = con.createStatement();
			System.out.println(state);
			
			int result = state.executeUpdate(sql);
			System.out.println(result);
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
	}
	
	public void EmpSelectTest() {
		String url = "jdbc:oracle:thin:@127.0.0.1:1521:xe";
		String user = "scott";
		String password = "1111";
		String sql = "SELECT * FROM Emp";
		
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection con = DriverManager.getConnection(url, user, password);
			Statement state = con.createStatement();
			System.out.println(state);
			ResultSet result = state.executeQuery(sql);
			
			while(result.next()) {
				System.out.println(result.getString("EmpNo") + "\t" + result.getString("Ename") + "\t" + result.getString("Job") + "\t" + result.getString("Sal") + "\t" + result.getString("HireDate") + "\t" + result.getString("DeptNo") + "\t" + result.getString("Comm"));
			}
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
	}
	
	public void EmpDeleteTest(String EmpNo) {
		String url = "jdbc:oracle:thin:@127.0.0.1:1521:xe";
		String user = "scott";
		String password = "1111";
		String sql = "DELETE FROM Emp WHERE EmpNo = ('" + EmpNo + "')";
		
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection con = DriverManager.getConnection(url, user, password);
			Statement state = con.createStatement();
			System.out.println(state);
			
			int result = state.executeUpdate(sql);
			System.out.println(result);
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
	}
	
	public void EmpReadTest(String EmpNo) {
		String url = "jdbc:oracle:thin:@127.0.0.1:xe";
		String user = "scott";
		String password = "1111";
		String sql = "SELECT * FROM Emp WHERE EMPNo = '" + EmpNo + "'";
		
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection con = DriverManager.getConnection(url, user, password);
			Statement state = con.createStatement();
			System.out.println(state);
			ResultSet result = state.executeQuery(sql);
			
			while(result.next()) {
				System.out.println(result.getString("EmpNo") + "\t" + result.getString("Ename") + "\t" + result.getString("Job") + "\t" + result.getString("Sal") + "\t" + result.getString("HireDate") + "\t" + result.getString("DeptNo") + "\t" + result.getString("Comm"));
			}
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
	}
	
	public void EmpSearchTest(String SearchName) {
		String url = "jdbc:oracle:thin:@127.0.0.1:1521:xe";
		String user = "scott";
		String password = "1111";
		String sql = "SELECT * FROM Emp WHERE Ename LIKE %('" + SearchName + "')%";
		
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
				System.out.println(result.getString("id") + "\t" + result.getString("addr"));
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