package core;

import java.io.FileReader;
import java.util.ArrayList;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

import jsonpckge.ReadJson;

public class Main {
	
	ArrayList<Staff> staffList = new ArrayList<>();

	public static void main(String[] args) {
	

		Main hola = new Main();
		hola.init();
		
	}
	
	
	public void init() {
		
		parseStaffData();
	
	}
	
	public void parseStaffData() {
		
		String pplData = "jsonpckge/personalData.json";
		
		JSONObject test = ReadJson.getFileAndParseToJsonObj(pplData);
		
		try{
			
			JSONArray data = (JSONArray)test.get("staff");
			
			for(int i = 0; i < data.size() ; i++) { 
			
				JSONObject sMember = (JSONObject)data.get(i);
				String nif = (String)sMember.get("id");
				String name = (String)sMember.get("name");
				String born_date = (String)sMember.get("born_date");
				String specialization = (String)sMember.get("specialization");
				Boolean assigned = (Boolean)sMember.get("assigned");
				
				staffList.add(new Staff(nif, name, born_date, specialization, assigned));			
			}
			
			staffList.forEach(ea-> System.out.println(ea.getId()));
			
		} catch(Exception e){
			e.printStackTrace();
		}
	}

}
