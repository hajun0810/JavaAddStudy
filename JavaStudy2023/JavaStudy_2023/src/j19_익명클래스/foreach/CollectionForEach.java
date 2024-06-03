package j19_익명클래스.foreach;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class CollectionForEach {

	public static void main(String[] args) {
		
			List<String> strList = new ArrayList<String>();
			
			for(int i =0; i<26;i++) {
				strList.add(Character.toString((char)(97+i)));
			}
			System.out.println(strList);
			
			strList.forEach(str -> {System.out.println(str);});
	
			Set<String> strTest = new HashSet<String>();
			for(int i =0; i<26;i++) {
				strTest.add(Character.toString((char)(97+i)));
			}System.out.println(strTest);
	
	
			Map<String, Integer> map = new HashMap<String, Integer>();
			for(int i =0; i<26;i++) {
				map.put(Character.toString((char)(97+i)),97+i);
			}System.out.println(map);
			
			map.forEach((k,v) -> {
				System.out.println("key: "+k);
				System.out.println("value: "+v);
				System.out.println();
			});
			
			
			
			
			
			
			
			
			
			
			
	
	}
	
}
