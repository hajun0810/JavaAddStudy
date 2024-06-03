package j15_스태틱;

public class SingletonMain {
	public static void main(String[] args) {
	
		KIA kia = KIA.getInstance();
		
		System.out.println(kia);
		
		System.out.println(kia.produceCar("k1"));
		System.out.println(kia.produceCar("k2"));
		System.out.println(kia.produceCar("k3"));
		System.out.println(kia.produceCar("k4"));
		System.out.println(kia.produceCar("k5"));
		System.out.println(kia.produceCar("k6"));
		System.out.println(kia.produceCar("k7"));
		System.out.println(kia.produceCar("k8"));
		System.out.println(kia.produceCar("k9"));
		System.out.println(kia.produceCar("k10"));
		System.out.println(kia.produceCar("k11"));
		
		KIA kia2 = KIA.getInstance();
		System.out.println(kia2);
		
	}
}
