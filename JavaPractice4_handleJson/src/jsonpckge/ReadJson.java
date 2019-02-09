package jsonpckge;

import java.io.File;
import java.io.FileReader;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

public class ReadJson {
	
	
	public static JSONObject getFileAndParseToJsonObj(String filePath) {
		
		ClassLoader classLoader = new ReadJson().getClass().getClassLoader();

		File file = new File(classLoader.getResource(filePath).getFile());
		
		JSONParser parser = new JSONParser();
		
		try{
			FileReader reader = new FileReader(file.getAbsolutePath());
			Object obj = parser.parse(reader);
			JSONObject jsonObj = (JSONObject)obj;
			return jsonObj;
			
		} catch(Exception e){
			e.printStackTrace();
			return null;
		}
		
	}
	
	

}
