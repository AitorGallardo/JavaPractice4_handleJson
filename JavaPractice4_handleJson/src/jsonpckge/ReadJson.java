package jsonpckge;

public class ReadJson {
	
	
	public void getFile(String filePath) {
		ClassLoader classLoader = this.getClass().getClassLoader();

File file = new File(classLoader.getResource(fileName).getFile());

JSONParser parser = new JSONParser();

try{
	FileReader reader = new FileReader(file.getAbsolutePath());
	Object obj = parser.parse(reader);
	JSONObject jsonObj = (JSONObject)obj;
	JSONObject 
}
	}

}
