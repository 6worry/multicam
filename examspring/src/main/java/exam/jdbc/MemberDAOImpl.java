package exam.jdbc;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

@Repository
public class MemberDAOImpl implements MemberDAO {
	private JdbcTemplate template;

	public MemberDAOImpl() {
		super();
	}

	@Autowired
	public MemberDAOImpl(JdbcTemplate template) {
		super();
		this.template = template;
	}
	
	public int count() {
		return template.queryForObject("SELECT COUNT(*) FROM member", Integer.class);
	}

	@Override
	public int insert(MemberDTO user) {
		String sql = "INSERT INTO member VALUES (?, ?, ?, ?, sysdate, 10000, ?)";
		return template.update(sql, user.getId(), user.getPass(), user.getName(), user.getAddr(), user.getInfo());
	}

	@Override
	public int update(MemberDTO updateUserInfo) {
		String sql = "UPDATE member SET info = ? WHERE id =? AND addr = ?";
		return template.update(sql, updateUserInfo.getInfo(), updateUserInfo.getId(), updateUserInfo.getAddr());
	}

	@Override
	public int delete(String id) {
		String sql = "DELETE FROM member WHERE id = ?";
		return template.update(sql, id);
	}

	@Override
	public MemberDTO login(String id, String pw) {
		MemberDTO user = null;
		
		try {
			user = template.queryForObject("SELECT * FROM member WHERE id = ? "
					+ "AND pass = ?", new Object[] {id, pw}, new MemberRowMapper());
		} catch (EmptyResultDataAccessException e) {
			System.out.println("로그인 실패");
		}
		
		return user;
	}

	@Override
	public List<MemberDTO> select() {
		return template.query("SELECT * FROM member", new MemberRowMapper());
	}

	@Override
	public MemberDTO findById(String id) {
		MemberDTO user = null;
		
		try {
			user = template.queryForObject("SELECT * FROM member WHERE id = ?", new Object[] {id}, new MemberRowMapper());
		} catch (EmptyResultDataAccessException e) {
			System.out.println("오류");
		}
		
		return user;
	}

	@Override
	public List<MemberDTO> findByAddr(String addr) {
		return template.query("SELECT * FROM member WHERE addr LIKE ?", new Object[]{"%" + addr + "%"}, new MemberRowMapper());
	}
}