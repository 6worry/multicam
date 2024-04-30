package exam.jdbc;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

public class MemberRowMapper implements RowMapper<MemberDTO> {
	@Override
	public MemberDTO mapRow(ResultSet rs, int rowNum) throws SQLException {
		System.out.println(rowNum);
		MemberDTO user = new MemberDTO(rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(4), 
				rs.getDate(5), rs.getInt(6), rs.getString(7));
		return user;
	}
}