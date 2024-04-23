package dept;

import java.util.List;

public interface DeptDAO {
	int insert(DeptDTO user) ;
	int delete(String DeptCode) ;
	List<DeptDTO> select();
}