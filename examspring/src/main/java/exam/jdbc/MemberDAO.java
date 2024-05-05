package exam.jdbc;

import java.util.List;

public interface MemberDAO {
	int insert(MemberDTO user);
	int update(MemberDTO updateUserInfo);
	int delete(String id);
	MemberDTO login(String id, String pw);
	List<MemberDTO> select();
	MemberDTO findById(String id);
	List<MemberDTO> findByAddr(String addr);
	int count();
}