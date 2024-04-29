package exam.di;

public class ServiceImpl implements MyService {
	String name;
	String msg;
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