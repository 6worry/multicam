package multicam.java.hw.DTO;

import java.time.LocalDate;

public class BoardDTO {
	private int num;
	private String title;
	private String content;
	private String name;
	private LocalDate regLocalDate;
	
	public BoardDTO() {
		
	}
	
	public BoardDTO(int num, String title, String content, String name, LocalDate regLocalDate) {
		super();
		this.num = num;
		this.title = title;
		this.content = content;
		this.name = name;
		this.regLocalDate = regLocalDate;
	}

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public LocalDate getRegLocalDate() {
		return regLocalDate;
	}

	public void setRegLocalDate(LocalDate regLocalDate) {
		this.regLocalDate = regLocalDate;
	}

	@Override
	public String toString() {
		return "BoardDTO [num=" + num + ", title=" + title + ", content=" + content + ", name=" + name + ", regLocalDate="
				+ regLocalDate + "]";
	}
}