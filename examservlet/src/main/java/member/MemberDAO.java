package member;

import java.util.List;

public interface MemberDAO {
	void insert(String id,String pass,String name,String addr,String info) ;
	int insert(MemberDTO user) ;
	void update(String info,String addr,String id);
	void update(MemberDTO updateUser);
	int delete(String id) ;
	List<MemberDTO> select();
	MemberDTO select(String id);
	MemberDTO login(String id,String pass) ;
	List<MemberDTO> search(String column,String value);
	MemberDTO findById(String id) ;
	MemberDTO selectAddr(String Addr);
	List<MemberDTO> search(String Addr);
}