package j17_컬렉션.HashMap;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;


public class UserArrayList {
	
	private List<User> userList;
	private static Scanner scanner;
	
	public UserArrayList() {
		userList = 	new ArrayList<User>();
		scanner = new Scanner(System.in);
	}
	
	
	public void addUser() {
		String username = null;
		String password = null;
		String name = null;
		String email = null;
		
		System.out.println("아이디: ");
		username = scanner.next();
		System.out.println("비밀번호 : ");
		 password = scanner.next();
		System.out.println("이름 : ");
		name = scanner.next();
		System.out.println("이메일 : ");
		 email = scanner.next();
		
		 User user = User.builder()
				 .username(username)
				 .passward(password)
				 .name(name)
				 .email(email)
				 .build();
		
		userList.add(user);
	}
	
	public void printUserList() {
		for(User user : userList) {
			System.out.println("아이디 > "+user.getUsername());
			System.out.println("비밀번호 > "+user.getPassward());
			System.out.println("이름 > "+user.getName());
			System.out.println("이메일 > "+user.getEmail());

		}
	}
	
	private void removeUser() {
		String username = null;
		String password = null;
		
		System.out.println("아이디: ");
		username = scanner.next();
		
		for(User user: userList) {
			if(user.getUsername().equals(username)) {
				System.out.println("비밀번호: ");
				password = scanner.next();
				if(user.getPassward().equals(password)) {
					userList.remove(user);
					System.out.println("삭제되었습니다.");return;
				}else {
					System.out.println("비밀번호가 일치하지 않습니다. ");return;
					
				}
			}else {
				System.out.println("아이디가 존재하지 않습니다.");
			}
		}
		
		
	}
	private static boolean contains(String n) {
		// TODO Auto-generated method stub
		return false;
	}


	public static void main(String[] args) {
		/*
		 * [사용자 관리 프로그램]
		 * userList
		 * 사용자( User class) 정보
		 * username
		 * password
		 * name
		 * email
		 * 
		 * 1. 사용자 추가(addUser)
		 * 		아이디:
		 * 		비밀번호:
		 * 		이름:
		 * 		이메일:
		 * 2. 사용자 리스트 출력(printUseList)
		 * 		아이디 >
		 * 		비밀번호 >
		 * 		이름 >
		 * 		이메일 >
		 * 3. 사용자 삭제
		 * 		
		 * q. 프로그램 종료
		 */
		UserArrayList userArrayList = new UserArrayList();
		String choice = null;
	
		while(true) {
		System.out.println("[사용자 관리 프로그램]");
		System.out.println("1. 사용자 추가 2. 사용자 리스트 출력 3. 사용자 삭제  q. 프로그램 종료");
		System.out.println("입력 >> ");
		choice = UserArrayList.scanner.next();
		
		if(choice.equals("1")) {
			userArrayList.addUser();
			
			System.out.println("사용자가 추가되었습니다.");
		}else if (choice.equals("2")) {
			userArrayList.printUserList();
			
		}else if(choice.equals("3")) {
			userArrayList.removeUser();
		
		}else if(choice.equals("q")){
			break;
		}else {
			System.out.println("지원하지 않는 번호 입니다.");
		}
		
		
		}
	}


	
}
