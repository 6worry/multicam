package multicam.java.hw;

public class NewMovie {
	private String title;
	private String genre;
	
	public void play() {
		System.out.println(title + "(" + genre+ ")상영중입니다.");			
	}
	
	public NewMovie(String title, String genre) {
		super();
		this.title = title;
		this.genre = genre;
	}
	
	public NewMovie() {
		
	}
	
	public void setTitle(String title) { 
		this.title = title;			
	}
	
	public void setGenre(String genre) { 
		this.genre = genre;
	}

	public String getTitle() {
		return title;
	}

	public String getGenre() {
		return genre;
	}
}