package exam.di.setter;

public class LogicImpl implements Logic {
	public LogicImpl() {
		super();
	}

	@Override
	public void testLogic() {
		System.out.println("db연동,xml,json,연산등을 수행하는 비지니스 메소드");
	}
}