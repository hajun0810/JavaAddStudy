package j16_제네릭;

public class GenericMain {
	public static void main(String[] args) {
		
		GenericTest <Integer,String>genericTest = new GenericTest();
		GenericTest <String,String>genericTest2 = new GenericTest();
		
		genericTest.setUserCode(100);
		genericTest.setName("홍길동");
		System.out.println(genericTest);
		
		genericTest2.setUserCode("200");
//		genericTest2.setUserCode(100);
		
		
	}
}
