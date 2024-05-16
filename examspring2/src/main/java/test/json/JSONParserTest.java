package test.json;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class JSONParserTest {
	public static void main(String[] args) throws FileNotFoundException, IOException, ParseException {
		JSONParser parser = new JSONParser();
		JSONObject root = (JSONObject) parser.parse(new FileReader("src/main/java/test/json/testjson.json"));
		
		String id = (String) root.get("id");
		String name = (String) root.get("name");
		String age = (String) root.get("age");
		
		System.out.println(id + name + age);
		
		JSONArray sublist = (JSONArray) root.get("subject");
		
		for(int i = 0; i < sublist.size(); i++) {
			String  sub = (String) sublist.get(i);
			System.out.println("subject" + sub);
		}
		
		JSONArray java = (JSONArray) root.get("java");
		
		for(int i = 0; i < java.size(); i++) {
			JSONObject json = (JSONObject) java.get(i);
			
			System.out.println("test" + json.get("test"));
			System.out.println("test2" + json.get("test2"));
			System.out.println("test3" + json.get("test3"));
		}
	}
}
