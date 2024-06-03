package j17_컬렉션.HashSet;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;

public class StringHashSet {

	public static void main(String[] args) {
		HashSet<String> set = new HashSet<String>();
		set.add("java");
		set.add("java");
		set.add("java");
		set.add("java");
		
		set.add("5");
		set.add("python");
		set.add("4");
		
		System.out.println(set);
		
		Iterator<String> ir = set.iterator();
		
		/*System.out.println(ir.hasNext());
		System.out.println(ir.next());
		System.out.println(ir.hasNext());
		System.out.println(ir.next());
		System.out.println(ir.hasNext());
		System.out.println(ir.next());
		System.out.println(ir.hasNext());
		System.out.println(ir.next());
		System.out.println(ir.hasNext());*/
	
		while(ir.hasNext()) {
			System.out.println(ir.next());
		}
		
		String[] names = {"홍길동","홍길서"};
		
		set.addAll(Arrays.asList(names));
		System.out.println(set);
	}
		
}
