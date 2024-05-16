package test.json;

import java.io.FileWriter;
import java.io.IOException;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

public class JSONMakerTest {
	@SuppressWarnings("unused")
	public static void main(String[] args) throws IOException {
		JSONObject mainjson = new JSONObject();
		JSONObject json = new JSONObject();
		JSONObject json2 = new JSONObject();
		JSONArray sublist = new JSONArray();
		
		json.put("id", "test1");
		json.put("name", "test2");
		json.put("age", "29");

		json2.put("id", "test3");
		json2.put("name", "test4");
		json2.put("age", "299");
		
		sublist.add("java1");
		sublist.add("java2");
		sublist.add("java3");
		
		sublist.add(json);
		sublist.add(json2);
		
		mainjson.put("java", sublist);
		
		System.out.println(mainjson.toJSONString());
		
		FileWriter fw = new FileWriter("src/main/java/test/json/testjson.json");
		
		fw.write(mainjson.toJSONString());
		fw.flush();
		fw.close();
	}
}