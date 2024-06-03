package j18_JSON;

import java.util.HashMap;
import java.util.Map;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class Gson1 {

	public static void main(String[] args) {
		//Gson 객체 생성 방법
		//1) Gson() 생성자를 통한 생성
		Gson gson1 = new Gson();
		
		//2) GsonBuilder() 생성자를 통한 생성
		Gson gson2 = new GsonBuilder().setPrettyPrinting().create();

		System.out.println(gson1.toString());
		
		Map<String, String> map = new HashMap<String,String>();
		map.put("username", "gildong");
		map.put("password", "1234");
		map.put("name", "길동");
		map.put("email", "gildong@");
		
		String json1 = gson1.toJson(map);
		System.out.println(json1);
		
		String json2 = gson2.toJson(map);
		System.out.println(json2);
		
		
	}

}
