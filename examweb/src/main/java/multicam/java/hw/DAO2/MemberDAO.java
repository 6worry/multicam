package multicam.java.hw.DAO2;

import java.util.ArrayList;

public interface MemberDAO {
//	void insert(String id, String pass, String name, String addr, String info);
	int insert(MemberDTO user);
	void update(MemberDTO user2);
	void delete(String id);
	ArrayList<MemberDTO> select();
	ArrayList<MemberDTO> search(String addr);
	MemberDTO login(String id, String pw);
	MemberDTO mypage(String id);
}