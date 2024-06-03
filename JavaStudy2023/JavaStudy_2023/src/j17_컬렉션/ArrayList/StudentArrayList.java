package j17_컬렉션.ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import j15_스태틱.Student;

public class StudentArrayList {
	public static void main(String[] args) {
		
		Student student = new Student("홍길동");
		Student student2 = new Student("홍길서");
		Student student3 = new Student("홍길남");
		Student student4 = new Student("홍길북");

		/*
		 * studentList 라는 list 만들고
		 * student 1 2 3 4 추가
		 */
		
		ArrayList<Student> studentList = new ArrayList<Student>();
		
		studentList.add(student);
		studentList.add(student2);
		studentList.add(student3);
		studentList.add(student4);
		System.out.println(studentList);
		
		Student[] students = {student,student2,student3,student4};
		studentList.addAll(Arrays.asList(students));
		System.out.println(studentList);
		
		List<String> list3 = new ArrayList<String>();
		
		/*
		 * studentList에서 홍길동 삭제(1개만 삭제)
		 */
		
		

		System.out.println(studentList);
	}
}
