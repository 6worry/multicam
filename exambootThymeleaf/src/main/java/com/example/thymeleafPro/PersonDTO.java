package com.example.thymeleafPro;

public class PersonDTO {
	private String id;
	private String pass;
	private String name;
	private int point;
	
	public PersonDTO() {
		super();
	}

	public PersonDTO(String id, String pass, String name, int point) {
		super();
		this.id = id;
		this.pass = pass;
		this.name = name;
		this.point = point;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getPass() {
		return pass;
	}

	public void setPass(String pass) {
		this.pass = pass;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPoint() {
		return point;
	}

	public void setPoint(int point) {
		this.point = point;
	}

	@Override
	public String toString() {
		return super.toString();
	}
}
