package exam.anno;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service("service")
public class ServiceImpl implements MyService {
	@Value("name")
	String name;
	@Value("msg")
	String msg;
	@Autowired
	Logic logic;
	
	public ServiceImpl() {
		super();
	}

	public ServiceImpl(String name, String msg, Logic logic) {
		super();
		this.name = name;
		this.msg = msg;
		this.logic = logic;
	}

	@Override
	public void testService() {
		System.out.println(msg+","+name);
		logic.testLogic();
	}
}