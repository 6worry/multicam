package multicam.java.hw.sql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class EmpMainTest {

    private static final String URL = "jdbc:oracle:thin:@127.0.0.1:1521:xe";
    private static final String USER = "scott";
    private static final String PASSWORD = "1111";

    public static void main(String[] args) {
        EmpMainTest obj = new EmpMainTest();
        try (Scanner key = new Scanner(System.in)) {
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

            obj.empInsertTest(EmpNo, Ename, Job);
            obj.empUpdateTest(EmpNo, Sal);
            obj.empSelectTest();
            obj.empDeleteTest(EmpNo);
            obj.empReadTest(EmpNo);
            obj.empSearchTest(SearchName);
        }
    }

    private void executeSQL(String sql) {
        try (Connection con = DriverManager.getConnection(URL, USER, PASSWORD);
             Statement state = con.createStatement()) {
            System.out.println(state);
            state.executeUpdate(sql);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void empInsertTest(String EmpNo, String Ename, String Job) {
        String sql = "INSERT INTO Emp (EmpNo, Ename, Job, Sal, Comm, DeptNo, Mgr, HireDate) VALUES ('" + EmpNo + "', '" + Ename + "', '" + Job + "', 3000, 0, null, null, sysdate)";
        executeSQL(sql);
    }

    public void empUpdateTest(String EmpNo, String Sal) {
        String sql = "UPDATE Emp SET Sal = ('" + Sal + "') WHERE EmpNo = ('" +EmpNo+"')";
        executeSQL(sql);
    }

    public void empSelectTest() {
        String sql = "SELECT * FROM Emp";
        
        Connection con = null;
		Statement state = null;
		ResultSet result = null;
        
        try {
        	con = DriverManager.getConnection(URL, USER, PASSWORD);
            state = con.createStatement();
            result = state.executeQuery(sql);
            System.out.println(state);
            while (result.next()) {
                System.out.println(result.getString("EmpNo") + "\t" + result.getString("Ename") + "\t" + result.getString("Job") + "\t" + result.getString("Sal") + "\t" + result.getString("HireDate") + "\t" + result.getString("DeptNo") + "\t" + result.getString("Comm"));
            }
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

    public void empDeleteTest(String EmpNo) {
        String sql = "DELETE FROM Emp WHERE EmpNo = ('" + EmpNo + "')";
        executeSQL(sql);
    }

    public void empReadTest(String EmpNo) {
        String sql = "SELECT * FROM Emp WHERE EMPNo = '" + EmpNo + "'";
        
        Connection con = null;
		Statement state = null;
		ResultSet result = null;
        
		try {
        	con = DriverManager.getConnection(URL, USER, PASSWORD);
            state = con.createStatement();
            result = state.executeQuery(sql);
            System.out.println(state);
            while (result.next()) {
            	System.out.println(result.getString("EmpNo") + "\t" + result.getString("Ename") + "\t" + result.getString("Job") + "\t" + result.getString("Sal") + "\t" + result.getString("HireDate") + "\t" + result.getString("DeptNo") + "\t" + result.getString("Comm"));
            }
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

    public void empSearchTest(String SearchName) {
        String sql = "SELECT * FROM Emp WHERE Ename LIKE '%" + SearchName + "%'";
        
        Connection con = null;
		Statement state = null;
		ResultSet result = null;
		
		try {
        	con = DriverManager.getConnection(URL, USER, PASSWORD);
            state = con.createStatement();
            result = state.executeQuery(sql);
            System.out.println(state);
            while (result.next()) {
            	System.out.println(result.getString("EmpNo") + "\t" + result.getString("Ename") + "\t" + result.getString("Job") + "\t" + result.getString("Sal") + "\t" + result.getString("HireDate") + "\t" + result.getString("DeptNo") + "\t" + result.getString("Comm"));
            }
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
