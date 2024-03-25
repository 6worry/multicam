package multicam.java.hw;

public class VideoShop {
	public static void main(String[] args) {
		Content[] content = new Content[3];
		content[0] = new Video("변호인","new");
		content[1] = new Video("탐정","comic");
		content[2] = new Video("헬로카봇","child");
		
		for (int i = 0; i < content.length; i++) {
			content[i].totalPrice();
			content[i].show();
		}
	}
}

abstract class Content {
	protected String title;
	protected int price;

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}
	
	public Content() {
		super();
	}
	
	public Content(String title) {
		this.title = title;
	}
	
	public Content(String title, int price) {
		this.title = title;
		this.price = price;
	}

	public abstract void totalPrice();
	
	public void show() {
		System.out.println(title + "비디오의 가격은 " + price + "입니다.");
	}
}

class Video extends Content {
	private String genre;

	public String getGenre() {
		return genre;
	}

	public void setGenre(String genre) {
		this.genre = genre;
	}
	
	public Video() {
		super();
	}
	
	public Video(String title, String genre) {
		super(title);
		this.genre = genre;
	}
	
	public void totalPrice() {
		if("new".equals(genre)) {
			price = 2000;
		} else if("comic".equals(genre)) {
			price = 1500;
		} else if("child".equals(genre)) {
			price = 1000;
		} else {
			price = 500;
		}
	}
}