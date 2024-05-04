package exam.di.setter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service("message")
public class MessageBean implements InterMessage {
	@Value("name2")
	private String name;
	@Value("Hi")
	private String greeting;
	@Autowired
	private Outputter outputter;
	
	public MessageBean() {
		super();
	}
	
	public MessageBean(String name) {
		super();
		this.name = name;
	}

	public String getGreeting() {
		return greeting;
	}

	public void setGreeting(String greeting) {
		this.greeting = greeting;
	}

	@Override
	public void sayHello() {
		System.out.println(greeting + " " + name);
	}

	public Outputter getOutputter() {
		return outputter;
	}

	public void setOutputter(Outputter outputter) {
		this.outputter = outputter;
	}
}