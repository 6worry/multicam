package exam.mvc.dept;

import java.util.List;

public interface DeptService {
	int insert(DeptDTO dto);
	List<DeptDTO> getDeptList();
	List<DeptDTO> getDeptSearch(String deptName);
	DeptDTO getDeptInfo(String deptno);
	int update(DeptDTO dto);
	int count();
}