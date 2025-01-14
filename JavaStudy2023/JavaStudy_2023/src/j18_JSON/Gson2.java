package j18_JSON;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class Gson2 {

	public static void main(String[] args) {
		User user = UserService.createUser();
		Gson gson = new GsonBuilder().setPrettyPrinting().create();
		
		//객체를 JSON 변환
		String userJson = gson.toJson(user);
		System.out.println(userJson);

		//JSON을 객체로 변환 
		User userObj = gson.fromJson(userJson, User.class);
		System.out.println(userObj);
		System.out.println(userObj.getUsername());
	}

}
