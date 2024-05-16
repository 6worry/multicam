package test.json;

import java.io.FileWriter;
import java.io.IOException;
import java.util.LinkedHashMap;
import java.util.Map;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

public class JSONMakerExam {
	@SuppressWarnings("unused")
	public static void main(String[] args) throws IOException {
		Map<String, Object> mainjson = new LinkedHashMap<>();
		LinkedHashMap<String, Object> json = new LinkedHashMap<String, Object>();
		LinkedHashMap<String, Object> json2 = new LinkedHashMap<String, Object>();
		LinkedHashMap<String, Object> json3 = new LinkedHashMap<String, Object>();
		JSONArray sublist = new JSONArray();
		JSONArray sublist2 = new JSONArray();
		
		json.put("subject", "java");
		json.put("month", "3");
		
		json2.put("subject", "servlet");
		json2.put("month", "3");
		
		sublist.add(json);
		sublist.add(json2);
		
		
		sublist2.add("java");
		sublist2.add("hadoop");
		sublist2.add("secure-coding");
		
		
		json3.put("zip", "111-222");
		json3.put("addr1", "인천시");
		
		
		mainjson.put("name", "진영록");
		mainjson.put("age", "25");
		mainjson.put("subject", sublist2);
		mainjson.put("addr", json3);
		mainjson.put("history", sublist);
		
		System.out.println(mainjson);
		
		FileWriter fw = new FileWriter("src/main/java/test/json/examjson.json");
		fw.write(new JSONObject(mainjson).toJSONString());
		fw.flush();
		fw.close();
	}
}