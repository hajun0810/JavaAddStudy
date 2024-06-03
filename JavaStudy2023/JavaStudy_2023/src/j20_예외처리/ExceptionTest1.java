package j20_예외처리;

public class ExceptionTest1 {

	public static void main(String[] args) {
		
		int[] numArray = {1,2,3,4,5};
		
		for(int i = 0;i<6;i++) {
			try {
				System.out.println(numArray[i]);
			} catch (Exception e) {
				System.out.println("예외 발생");
				e.printStackTrace();
			}
			finally {
				System.out.println("예외 발생 유무에 상관없이 무조건 실행");
			}
		}
	}

}
