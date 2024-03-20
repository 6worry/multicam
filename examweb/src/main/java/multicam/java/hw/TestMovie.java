package multicam.java.hw;

public class TestMovie {
	public static void main(String[] args) { 
		NewMovie myMovie = new NewMovie("파묘", "미스테리");
		myMovie.play();
		System.out.println("--------------------");

		NewMovie yourMovie = new NewMovie("쥬라기월드", "액션어드벤쳐");
		yourMovie.play();
	}
}