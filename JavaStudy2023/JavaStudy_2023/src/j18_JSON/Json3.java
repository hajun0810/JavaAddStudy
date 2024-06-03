package j18_JSON;

import java.util.HashMap;
import java.util.Map;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class Json3 {

	public static void main(String[] args) {
		
		User user = UserService.createUser();
		Gson gson = new GsonBuilder().setPrettyPrinting().create();
		
		//Map -> Json
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("code", 1);
		map.put("message", "json 형변환 테스트");
		map.put("data", user);
		
		String mapjason = gson.toJson(map);
		System.out.println(mapjason);
		
		//Json - > Map
		Map<String,Object> mapobj = gson.fromJson(mapjason, Map.class);
		System.out.println(mapobj);
		
		System.out.println(mapobj.get("data"));
	}
}
