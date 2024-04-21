package multicam.java.hw.DAO2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class MemberDAOImpl implements MemberDAO {
	public int insert(MemberDTO user) {
		String sql = "INSERT INTO member VALUES (?, ?, ?, ?, sysdate, 10000, ?)";
		
		Connection con = null;
		PreparedStatement ptmt = null;
		int result = 0;
		try {
			con = DBUtil.getConnect();
			ptmt = con.prepareStatement(sql);
			
			ptmt.setString(1, user.getId());
			ptmt.setString(2, user.getPass());
			ptmt.setString(3, user.getName());
			ptmt.setString(4, user.getAddr());
			ptmt.setString(5, user.getInfo());
			
			result = ptmt.executeUpdate();
			System.out.println(result);
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			DBUtil.close(null, ptmt, con);
		}
		
		return result;
	}
	public void update(MemberDTO user2) {
		String sql = "UPDATE member SET addr = ?, info = ? WHERE id = ?";
		String sql2 = "SELECT * FROM member";
		
		Statement state = null;
		Connection con = null;
		PreparedStatement ptmt = null;
		ResultSet result = null;
		
		try {
			con = DBUtil.getConnect();
			state = con.createStatement();
			ptmt = con.prepareStatement(sql);
			
			ptmt.setString(1, user2.getAddr());
			ptmt.setString(2, user2.getInfo());
			ptmt.setString(3, user2.getId());
			ptmt.executeUpdate();
			
			result = state.executeQuery(sql2);
			
			while(result.next()) {				
				System.out.println(result.getString("id") + "\t" 
								+ result.getString("addr") + "\t"
								+ result.getString("info") + "\t");
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			DBUtil.close(result, ptmt, con);
		}
	}
	public void delete(String id) {
		String sql = "DELETE FROM member WHERE id = ?";
		String sql2 = "SELECT * FROM member";
		
		Statement state = null;
		Connection con = null;
		PreparedStatement ptmt = null;
		ResultSet result = null;
		
		try {
			con = DBUtil.getConnect();
			state = con.createStatement();
			ptmt = con.prepareStatement(sql);
			
			ptmt.setString(1, id);
			ptmt.executeUpdate();
			
			result = state.executeQuery(sql2);
			
			while(result.next()) {
				System.out.println(result.getString("id") + "\t" + result.getString("addr"));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			DBUtil.close(result, ptmt, con);
		}	
	}
	public ArrayList<MemberDTO> select() {
		String sql = "SELECT * FROM member";
		
		Connection con = null;
		PreparedStatement ptmt = null;
		ResultSet result = null;
		ArrayList<MemberDTO> userlist = new ArrayList<>();
		MemberDTO user= null;
		
		try {
			con = DBUtil.getConnect();
			ptmt = con.prepareStatement(sql);
			
			result = ptmt.executeQuery();
			
			while(result.next()) {
				user = new MemberDTO(result.getString("id"), result.getString("pass"), result.getString("name"), result.getString("addr"), result.getDate(5), result.getInt("point"), result.getString(7));
				userlist.add(user);
//				System.out.println(result.getString("id") + " " + result.getString("addr"));
			}
			
			System.out.println(userlist.size());
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			DBUtil.close(result, ptmt, con);
		}
		
		return userlist;
	}
	
	public ArrayList<MemberDTO> search(String addr) {
		String sql = "SELECT * FROM member WHERE addr LIKE ?";
		
		Connection con = null;
		PreparedStatement ptmt = null;
		ResultSet result = null;
		ArrayList<MemberDTO> userlist = new ArrayList<>(); 
		MemberDTO user = null;
		
		try {
			con = DBUtil.getConnect();
			ptmt = con.prepareStatement(sql);
			
			ptmt.setString(1, "%" + addr + "%");
			ptmt.executeUpdate();
			
			result = ptmt.executeQuery();
			while(result.next()) {
				user = new MemberDTO(result.getString("id"), result.getString("pass"), result.getString("name"), result.getString("addr"), result.getDate(5), result.getInt("point"), result.getString(7));
				userlist.add(user);
//				System.out.println(result.getString("id") + "\t" + result.getString("addr"));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			DBUtil.close(result, ptmt, con);
		}
		
		return userlist;
	}
	
	public MemberDTO login(String id, String pw) {
		String sql = "SELECT * FROM member WHERE id = ? and pass = ?";
//		String sql2 = "SELECT * FROM member WHERE id = '" + id + "' and pass = '" + pw + "'";
		Connection con = null;
		PreparedStatement ptmt = null;
		ResultSet result = null;
		MemberDTO user = null;
		
		try {
			con = DBUtil.getConnect();
			ptmt = con.prepareStatement(sql);
			ptmt.setString(1, id);
			ptmt.setString(2, pw);
			result = ptmt.executeQuery();
//			state = con.createStatement();
//			state.executeUpdate(sql2);
//			result = state.executeQuery(sql2);
			
			if(result.next()) {
				user = new MemberDTO(result.getString("id"), result.getString("pass"), result.getString("name"), result.getString("addr"), result.getDate(5), result.getInt("point"), result.getString(7));
//				System.out.println(result.getString("name") + "님 로그인 성공");
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			DBUtil.close(result, ptmt, con);
		}
		
		return user;
	}
	
	public MemberDTO mypage(String id) {
		String sql = "SELECT * FROM member WHERE id = ?";
		Connection con = null;
		PreparedStatement ptmt = null;
		ResultSet result = null;
		MemberDTO user = null;
		
		try {
			con = DBUtil.getConnect();
			ptmt = con.prepareStatement(sql);
			ptmt.setString(1, id);
			result = ptmt.executeQuery();
			
			if(result.next()) {
				user = new MemberDTO(result.getString("id"), result.getString("pass"), result.getString("name"), result.getString("addr"), result.getDate(5), result.getInt("point"), result.getString(7));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			DBUtil.close(result, ptmt, con);
		}
		
		return user;
	}
}