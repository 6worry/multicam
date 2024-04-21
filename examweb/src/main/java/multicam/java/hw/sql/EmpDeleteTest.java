package multicam.java.hw.sql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class EmpDeleteTest {
	public static void main(String[] args) {
		EmpDeleteTest obj = new EmpDeleteTest();
		Scanner key = new Scanner(System.in);
		System.out.println("사번: ");
		String EmpNo = key.next();
		
		obj.EmpDeleteTest2(EmpNo);
	}
	
	public void EmpDeleteTest2(String EmpNo) {
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
}