package j14_lombok;

import lombok.NonNull;

public class StudentMain {
	public static void main(String[] args) {
		Student student = new Student();
		Student student2 = new Student(20230001,"홍길동",2,18);
		Student student3 = new Student("홍길서");
		Student student4 = new Student(20230002,"홍길서",1,20);
		
		System.out.println(student2.getAge());
		System.out.println(student4);
		
	}
}
