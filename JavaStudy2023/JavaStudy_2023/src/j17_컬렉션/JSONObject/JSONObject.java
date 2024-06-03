package j17_컬렉션.JSONObject;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class JSONObject {
	public static void main(String[] args) {
		Map<String, Object> datamap = new HashMap<String, Object>();
		ArrayList<String> list = new ArrayList<String>();

		Map<String,String> info = new HashMap<String,String>();
		Map<String,String> info2 = new HashMap<String,String>();
		Map<String,String> info3= new HashMap<String,String>();
		
		datamap.put("count", 1118);
		datamap.put("next", "https://");
		datamap.put("previous", null);
		
		info.put("name", "po1");
		info.put("url", "po/1");
		
		info2.put("name", "po2");
		info2.put("url", "po/2");
		
		info3.put("name", "po3");
		info3.put("url", "po/3");
		
		
		
		
	}

}
