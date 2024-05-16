package test.json;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class JSONParserExam {
	public static void main(String[] args) throws FileNotFoundException, IOException, ParseException {
		JSONParser parser = new JSONParser();
		JSONObject main = (JSONObject) parser.parse(new FileReader("src/main/java/test/json/examjson.json"));
		
		String name = (String) main.get("name");
		String age = (String) main.get("age");
		
		System.out.println("name: " + name);
		
		JSONArray history = (JSONArray) main.get("history");
		
		System.out.println("history: " + history);
		
		for(int i = 0; i < history.size(); i++) {
			JSONObject json = (JSONObject) history.get(i);
			
			System.out.println("subject: " + json.get("subject"));
			System.out.println("month: " + json.get("month"));
		}
		
		
		JSONObject addr = (JSONObject) main.get("addr");
		String zip = (String) addr.get("zip");
		String addr1 = (String) addr.get("addr1");
		
		System.out.println("addr: " + addr);
		System.out.println("zip: " + zip);
		System.out.println("addr1: " + addr1);
		
		System.out.println("age: " + age);
		
		JSONArray sublist = (JSONArray) main.get("subject");
		
		for(int i = 0; i < sublist.size(); i++) {
			String  subject = (String) sublist.get(i);
			
			System.out.println("subject: " + subject);
		}
	}
}
