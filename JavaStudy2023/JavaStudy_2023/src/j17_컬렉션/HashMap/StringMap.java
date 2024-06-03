package j17_컬렉션.HashMap;

import java.util.HashMap;
import java.util.Iterator;

public class StringMap {
	public static void main(String[] args) {
		
		HashMap<Integer, String> strMap = new HashMap<Integer,String>();
		HashMap<String, String> strMap2 = new HashMap<String,String>();
		
		strMap.put(1,"java");
		strMap.put(1,"java");
		strMap.put(1,"java");
		strMap.put(1,"C");
		strMap.put(2,"python");
		strMap.put(3,"python");
		
		System.out.println(strMap);
		
		
		strMap2.put("re","python");
		strMap2.put("as","python");
		strMap2.put("we","python");
		strMap2.put("qw","python");
		
		System.out.println(strMap2);
		
		Iterator<String> irKey = strMap2.keySet().iterator();
		
		while(irKey.hasNext()) {
			System.out.println(strMap2.get(irKey.next()));
		}
		
		Iterator<Integer> irKey2 = strMap.keySet().iterator();
		while(irKey2.hasNext()) {
			System.out.println(strMap.get(irKey2.next()));
		}
		
		// 키 값 중에 해당하는  key 값이 있는지 확인
		System.out.println(strMap.containsKey(4));
		System.out.println(strMap.containsKey(1));
		
		// 벨류 중에 해당하는 value 값이 있는지 확인
		System.out.println(strMap2.containsKey("java"));
		System.out.println(strMap2.containsKey("python"));

	}
}













