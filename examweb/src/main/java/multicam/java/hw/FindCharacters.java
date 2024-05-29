package multicam.java.hw;

public class FindCharacters {
	public static void main(String[] args) {
		FindCharacters fc=new FindCharacters();
		int count=fc.countChar("Boys, be ambitious", 'b');
		System.out.println(count);
	}
	
	public int countChar(String str, char c) {
		char[] data = str.toCharArray();
		int count = 0;
		
		for(char result: data) {
			if(result == c) {
				count++;
			}
		}
		
		return count;
	}
}
