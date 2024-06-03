package j17_컬렉션.HashSet;

import java.util.Arrays;
import java.util.HashSet;

import j15_스태틱.Student;

public class StudentHashSet {
	
	public static void main(String[] args) {
		
		/*
		 * 학생 4명 (홍길동,홍길서,홍길남,홍길북)
		 * students 라는 배열에 넣고 
		 * set에다가 추가하고 
		 * 
		 * 홍길남을 찾아서 삭제
		 * 
		 */
		
		
		
		Student student1 = new Student("홍길동");
		Student student2 = new Student("홍길서");
		Student student3 = new Student("홍길남");
		Student student4 = new Student("홍길북");
		Student[] students = {student1,student1,student3,student4};
		
		HashSet<Student> set = new HashSet<Student>();
		set.addAll(Arrays.asList(students));
		System.out.println(set);
		
		for(Student student: set  ) {
			if(student.getName().equals("홍길남"));
			set.remove(student);
			break;
		}System.out.println(set);
	}
}
