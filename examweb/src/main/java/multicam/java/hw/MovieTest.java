package multicam.java.hw;

public class MovieTest {
	public static void main(String[] args) { 
		Movie myMovie = new Movie();
		myMovie.setTitle("파묘");
		myMovie.setGenre("미스테리");
		myMovie.play();
		System.out.println("--------------------");

		Movie yourMovie = new Movie();
		yourMovie.setTitle("쥬라기월드");
		yourMovie.setGenre("액션어드벤쳐");
		yourMovie.play();
	}
}

class Movie {
	private String title;
	private String genre;
	
	public void play() {
		System.out.println(title + "(" + genre+ ")상영중입니다.");			
	}
	
	public String getTitle() {
		return title;
	}

	public String getGenre() {
		return genre;
	}
	
	public void setTitle(String title) { 
		this.title = title;			
	}
	
	public void setGenre(String genre) { 
		this.genre = genre;
	}
}

