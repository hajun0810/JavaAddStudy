package j17_컬렉션.ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class StringList {
	public static void main(String[] args) {
		
		ArrayList<String> list = new ArrayList<String>();
	
		//값 추가
		list.add("java");
		list.add("python");
		list.add("C");
		list.add("python");
		list.add("htmi");
		
		//원하는 위치에 값 추가
		list.add(2, "mariaDB");
		
		System.out.println(list);
		
		//리스트의 크기
		System.out.println(list.size());
		
		//리스트에서 해당 인덱스 값 찾기
		String subject = list.get(0);
		System.out.println(subject);
		
		//리스트에서 값을 통해 인덱스 값 찾기
		int index = list.indexOf("mariaDB");
		System.out.println(index);
		
		//해당 인덱스 위치에 값 수정
		list.set(3, "C++");
		System.out.println(list);
		
		//해당 리스트가 값을 포함하고 있는지 확인
		ArrayList<String> templist = new ArrayList<String>();
		templist.add("python");
		templist.add("C++");
		templist.add("Spring");

		boolean contains = templist.contains("python");
		System.out.println(contains);
		System.out.println(templist.contains("java"));
		
		System.out.println(templist);
		
		boolean contansAll = list.containsAll(templist);
		System.out.println(contansAll);
		
		//삭제
		
		boolean result = list.remove("python");
		list.add("python");
		list.add("python");
		System.out.println(list);
		
		//list.removeAll(templist);
		//System.out.println(list);
		list.retainAll(templist);
		System.out.println(list);
		
		//리스트 전체 비우기
		list.clear();
		System.out.println(list);
		
		System.out.println(list.isEmpty());//list에 값이 없을때 true 리턴
		
		//배열을 리스트에 넣기
		String[] names = {"홍길동","홍길서","홍길남"};
		Arrays.asList(names);
		
		List<String> asList = Arrays.asList(names);
		list.addAll(asList);
		System.out.println(list);
		
		// 반복문을 통해 list에 있는 값 출력
		for(int i =0; i<list.size();i++) {
			System.out.println(list.get(i));
		}
		System.out.println();
		for(String name :list) {
			System.out.println(name);
		}
	}
}
