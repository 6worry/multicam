package dept;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
//insert,delete,update,select,login,search
public class DeptDAOImpl implements DeptDAO{
	public int insert(DeptDTO user) {
		String sql="INSERT INTO mydept VALUES (?,?,?,?)";
		Connection con = null;
		PreparedStatement ptmt =null;
		int result = 0;
		
		try {
			con = DBUtil.getConnect();
			ptmt =  con.prepareStatement(sql);
			ptmt.setString(1, user.getDeptCode());
			ptmt.setString(2, user.getDeptName());
			ptmt.setString(3, user.getTel());
			ptmt.setString(4, user.getAddr());
			
			result = ptmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			DBUtil.close(null, ptmt, con);
		}
		
		return result;
	}
	
	public int delete(String DeptCode) {
		String sql = "DELETE FROM mydept WHERE deptcode = ?";
		Connection con = null;
		PreparedStatement ptmt = null;
		int result = 0;
		
		try {
			con = DBUtil.getConnect();
			ptmt =  con.prepareStatement(sql);
			ptmt.setString(1,DeptCode);
			
			result = ptmt.executeUpdate();
		}  catch (SQLException e) {
			e.printStackTrace();
		} finally {
			DBUtil.close(null, ptmt, con);
		}
		
		return result;
	}
	
	public List<DeptDTO> select() {
		Connection con = null;
		PreparedStatement ptmt =null;
		ResultSet rs = null;
		
		String sql = "SELECT * FROM mydept";
		List<DeptDTO> memberlist = new ArrayList<>();
		DeptDTO member = null;
		
		try {
			con = DBUtil.getConnect();
			ptmt =  con.prepareStatement(sql);
			
			rs =  ptmt.executeQuery();
			System.out.println(rs);
			
			while(rs.next()) {
				member = new DeptDTO(rs.getString(1), rs.getString(2),
						rs.getString(3), rs.getString(4));
				memberlist.add(member);
			}
		}  catch (SQLException e) {
			e.printStackTrace();
		} finally {
			DBUtil.close(rs, ptmt, con);
		}
		
		return memberlist;
	}
}