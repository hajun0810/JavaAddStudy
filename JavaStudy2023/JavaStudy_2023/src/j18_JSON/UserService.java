package j18_JSON;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class UserService {
	
	public static User createUser() {
		List<String> hobby = new ArrayList<String>();
		hobby.addAll(Arrays.asList(new String[] {"축구","야구","농구","골프"}));
		User user = User.builder()
				.userCode(1)
				.username(null
						)
				.password("1234")
				.email("@")
				.address("부산광역시 진구")
				.phone("1111")
				.hobby(hobby)
				.build();
		return user;
		
	}
}
