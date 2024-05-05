package exam.mvc.dept;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DeptServiceImpl implements DeptService {
	DeptDAO dao;

	@Autowired
	public DeptServiceImpl(DeptDAO dao) {
		super();
		this.dao = dao;
	}

	@Override
	public int insert(DeptDTO dto) {
		int result = dao.insert(dto);
		return result;
	}

	@Override
	public List<DeptDTO> getDeptList() {
		List<DeptDTO> result = dao.getDeptList();
		return result;
	}

	@Override
	public List<DeptDTO> getDeptSearch(String deptName) {
		List<DeptDTO> result = dao.getDeptSearch(deptName);
		return result;
	}

	@Override
	public DeptDTO getDeptInfo(String deptno) {
		DeptDTO result = dao.getDeptInfo(deptno);
		return result;
	}

	@Override
	public int update(DeptDTO dto) {
		int result = dao.update(dto);
		return result;
	}

	@Override
	public int count() {
		int result = dao.count();
		return result;
	}
}