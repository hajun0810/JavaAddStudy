package j17_컬렉션.HashMap;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;

public class Dictionary {
	public static void main(String[] args) {
		/*
		 * 사전검색 기능
		 * 검색어: 축구
		 * 축구 =-> soccer
		 * 
		 * 검색어: 야구
		 * 야구 -> baseball
		 * 
		 * 검색어: 농구
		 * 농구 -> basketball
		 * 
		 * 검색어: 골프
		 * 골프 -> golf
		 * 
		 * 검색어: 수영
		 * 지원하지 않는 단어 입니다.
		 * 
		 * 검색어: exit
		 * 프로그램이 종료되었습니다.
		 * 
		 */
		Scanner sc = new Scanner(System.in);
		HashMap<String, String> strMap3 = new HashMap<String,String>();
		
		strMap3.put("축구", "soccer");
		strMap3.put("야구", "baseball");
		strMap3.put("농구", "basketball");
		strMap3.put("골프", "golf");
		strMap3.put("exit", "프로그램이 종료되었습니다.");

		Iterator<String> irKey1 = strMap3.keySet().iterator();
		
		while(true) {
		System.out.println("검색어: ");
		String seacrh = sc.next();

		if(seacrh.equals("축구")) {
			String value = strMap3.get("축구");
			System.out.println("축구 -> "+value);
		}else if(seacrh.equals("야구")){
			String value = strMap3.get("축구");
			System.out.println("야구 -> "+value);
		}else if(seacrh.equals("농구")){
			String value = strMap3.get("축구");
			System.out.println("농구 -> "+value);
		}else if(seacrh.equals("골프")) {
			String value = strMap3.get("축구");
			System.out.println("골프 -> "+value);
		}else if(seacrh.equals("exit")) {
			String value = strMap3.get("exit");
			System.out.println(value);
			break;
		}else {System.out.println("지원하지 않는 단어 입니다.");}
		}
	}
}
