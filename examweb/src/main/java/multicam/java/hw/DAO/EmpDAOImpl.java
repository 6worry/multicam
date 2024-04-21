package multicam.java.hw.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class EmpDAOImpl implements EmpDAO {
	public void insert(String EmpNo, String Ename, String Job, String Mgr, String DeptNo) {
		String sql = "INSERT INTO emp VALUES (?, ?, ?, ?, sysdate, 800, 0, ?)";
		
		Connection con = null;
		PreparedStatement ptmt = null;
		
		try {
			con = DBUtil.getConnect();
			ptmt = con.prepareStatement(sql);
			
			ptmt.setString(1, EmpNo);
			ptmt.setString(2, Ename);
			ptmt.setString(3, Job);
			ptmt.setString(4, Mgr);
			ptmt.setString(5, DeptNo);
			
			ptmt.executeUpdate();
			System.out.println("가입완료! 환영합니다!");
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			DBUtil.close(null, ptmt, con);
		}
	}
	
	public void update(String Sal, String Ename) {
		String sql = "UPDATE emp SET Sal = ? WHERE Ename = ?";
		String sql2 = "SELECT * FROM emp";
		
		Statement state = null;
		Connection con = null;
		PreparedStatement ptmt = null;
		ResultSet result = null;
		
		try {
			con = DBUtil.getConnect();
			state = con.createStatement();
			ptmt = con.prepareStatement(sql);
			
			ptmt.setString(1, Sal);
			ptmt.setString(2, Ename);
			int count = ptmt.executeUpdate();
			
			result = state.executeQuery(sql2);
			
			System.out.println(count + "개 수정 성공");
			System.out.println("급여변경완료");
			
			while(result.next()) {
				System.out.println(result.getString(1) + "\t" 
						+ result.getString(2) + "\t"
						+ result.getString(3) + "\t"
						+ result.getString(4) + "\t"
						+ result.getString(5) + "\t"
						+ result.getString(6) + "\t"
						+ result.getString(7) + "\t"
						+ result.getString(8) + "\t");
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			DBUtil.close(result, ptmt, con);
		}
	}
	
	public void delete() {
		String sql = "DELETE FROM emp WHERE Comm = 0";
		String sql2 = "SELECT * FROM emp";
		
		Statement state = null;
		Connection con = null;
		PreparedStatement ptmt = null;
		ResultSet result = null;
		
		try {
			con = DBUtil.getConnect();
			//state = con.createStatement();
			ptmt = con.prepareStatement(sql);
			
			int count = ptmt.executeUpdate();
			
			ptmt = con.prepareStatement(sql2);
			//기존 메소드 call
			result = ptmt.executeQuery(sql2);
			
			System.out.println(count + "명 삭제 완료");
			
			while(result.next()) {
				System.out.println(result.getString(1) + "\t" 
								+ result.getString(2) + "\t"
								+ result.getString(3) + "\t"
								+ result.getString(4) + "\t"
								+ result.getString(5) + "\t"
								+ result.getString(6) + "\t"
								+ result.getString(7) + "\t"
								+ result.getString(8) + "\t");
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			DBUtil.close(result, ptmt, con);
		}	
	}
	
	public void select() {
		String sql = "SELECT * FROM emp";
		String sql2 = "SELECT count(*) FROM emp";
		
		Connection con = null;
		PreparedStatement ptmt = null;
		PreparedStatement ptmt2 = null;
		ResultSet result = null;
		ResultSet result2 = null;
		
		try {
			con = DBUtil.getConnect();
			ptmt = con.prepareStatement(sql);
			ptmt2 = con.prepareStatement(sql2);
			
			result = ptmt.executeQuery();
			result2 = ptmt2.executeQuery();
			
			if(result2.next()) {				
				System.out.println("리스트사이즈: " + result2.getInt(1));
			}
			while(result.next()) {
				System.out.println(result.getString(1) + "\t" 
								+ result.getString(2) + "\t"
								+ result.getString(3) + "\t"
								+ result.getString(4) + "\t"
								+ result.getString(5) + "\t"
								+ result.getString(6) + "\t"
								+ result.getString(7) + "\t"
								+ result.getString(8) + "\t");
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			DBUtil.close(result, ptmt, con);
		}
	}
	
	public void search(String SearchJob) {
		String sql = "SELECT * FROM emp WHERE Job LIKE ?";
		
		Connection con = null;
		PreparedStatement ptmt = null;
		ResultSet result = null;
		
		try {
			con = DBUtil.getConnect();
			ptmt = con.prepareStatement(sql);
			
			ptmt.setString(1, "%" + SearchJob + "%");
			ptmt.executeUpdate();
			
			result = ptmt.executeQuery();
			while(result.next()) {
				System.out.println(result.getString(1) + "\t" 
								+ result.getString(2) + "\t"
								+ result.getString(3) + "\t"
								+ result.getString(4) + "\t"
								+ result.getString(5) + "\t"
								+ result.getString(6) + "\t"
								+ result.getString(7) + "\t"
								+ result.getString(8) + "\t");
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			DBUtil.close(result, ptmt, con);
		}
	}

	public void searchMgr(String SearchMgr) {
		String sql = "SELECT * FROM emp WHERE Mgr LIKE ?";
		
		Connection con = null;
		PreparedStatement ptmt = null;
		ResultSet result = null;
		
		try {
			con = DBUtil.getConnect();
			ptmt = con.prepareStatement(sql);
			
			ptmt.setString(1, "%" + SearchMgr + "%");
			ptmt.executeUpdate();
			
			result = ptmt.executeQuery();
			while(result.next()) {
				System.out.println(result.getString(1) + "\t" 
								+ result.getString(2) + "\t"
								+ result.getString(3) + "\t"
								+ result.getString(4) + "\t"
								+ result.getString(5) + "\t"
								+ result.getString(6) + "\t"
								+ result.getString(7) + "\t"
								+ result.getString(8) + "\t");
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			DBUtil.close(result, ptmt, con);
		}
	}
}