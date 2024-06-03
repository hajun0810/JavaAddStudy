package j19_익명클래스.람다식;

@FunctionalInterface // 인터페이스는 하나만 남도록 표기 해두는 것 
public interface StrTest {

	
	// public int plus(int num); 
	//  람다식을 사용하기 위해서는 추상 메소드가 무조건 하나만 있어야함.
	
	public String test(String str);

}
