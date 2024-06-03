package j19_익명클래스.람다식;

public class StrTestMain {

	public static void main(String[] args) {
/*		StrTest strTest = new StrTest() {
			
			@Override
			public String test(String str) {
				// TODO Auto-generated method stub
				return null;
			}
		};*/
		
		StrTest strTest = str -> str +"님";
		System.out.println(strTest.test("홍길동"));
		
	}

}
