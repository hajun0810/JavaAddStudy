package j17_컬렉션.user;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {

	public static void main(String[] args) {
		
		Map<String,Object> datamap = new HashMap<String,Object>();
		
		datamap.put("no", 1);
		datamap.put("message", "1page list");
		
		List<Map<String, Object>> list = new ArrayList<>();
		
		Map<String,Object> info = new HashMap<String,Object>();
		info.put("name", "최연호");
		info.put("주소", "부산광역시 진구");
		info.put("연락처", "010-3300-4698");
		info.put("성별", 1);
		
		Map<String,Object> info2 = new HashMap<String,Object>();
		info2.put("name", "최연이");
		info2.put("주소", "부산광역시 진구");
		info2.put("연락처", "010-1111-2222");
		info2
		.put("성별", 0);
		
		list.add(info);
		list.add(info2);
		datamap.put("data", list);
		
		
		
		
		System.out.println(datamap.get("data"));
	}

}
