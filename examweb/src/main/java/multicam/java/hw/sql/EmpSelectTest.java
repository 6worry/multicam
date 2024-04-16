package multicam.java.hw.sql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class EmpSelectTest {
	public static void main(String[] args) {
		EmpSelectTest obj = new EmpSelectTest();
		Scanner key = new Scanner(System.in);
		System.out.println("사번: ");
		String Table = key.next();
		
		obj.EmpSelectTest2(Table);
	}
	
	public void EmpSelectTest2(String Table) {
		String url = "jdbc:oracle:thin:@127.0.0.1:1521:xe";
		String user = "scott";
		String password = "1111";
		String sql = "SELECT * FROM EMP";
		
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
}