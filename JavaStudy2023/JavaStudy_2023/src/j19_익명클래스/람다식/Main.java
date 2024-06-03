package j19_익명클래스.람다식;

public class Main {

	public static void main(String[] args) {
		Math<Integer, Integer> pulsMath = new Math<Integer, Integer>() {
			
			@Override
			public double calc(Integer value1, Integer value2) {
				
				return value1+value2;
			}
		};
		
		System.out.println(pulsMath.calc(10, 20));
		
		/*
		 * plusMath2.calc(10.7,20.5);
		 * 
		 * return: 홍길동
		 */
		
		Math<Double,Double> pMath = new Math<Double, Double>() {
			
			@Override
			public double calc(Double value1, Double value2) {
				// TODO Auto-generated method stub
				return value1+value2;
			}
		};
		
		System.out.println(pMath.calc(10.7, 20.5));
		
		//람다식
		Math<Integer, Integer> pulsMath3 = (v1,v2) -> v1+v2;
		System.out.println(pulsMath3.calc(20, 30));
		
		
		Math<Double, Double> pulMath4 = (v1,v2) ->{
			System.out.println("안녕");
			return v1 + v2;
					};
					System.out.println(pulMath4.calc(20.3, 30.3));
		}
	}


