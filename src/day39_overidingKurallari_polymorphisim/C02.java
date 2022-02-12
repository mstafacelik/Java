package day39_overidingKurallari_polymorphisim;

public class C02 extends C01 {

	public static void main(String[] args) {
		C02 obj1 = new C02();
		obj1.privateMethod();
		obj1.staticMethos();

		
		C01 obj2 = new C02();
		// obj2.privateMethod();
		// data turu C01 oldugundan oncelikle C01 class indaki methoda bakmamiz gerekir
		// ancak private oldugundan ulasamayiz
		// ulasamadigimiz bir methodu override YAPAMAYIZ
		// dolayisiyla signature ayni olmasina RAGMEN bu ikisi ayri methoddur
		obj2.staticMethos();
		// PRIVAT; STATIC VE FINAL METHODLAR OVERRIDE EDILEMEZ!!!
		// dolayisiyla signature ayni olmasina RAGMEN bu ikisi 
		
		
		
	}

	public static void staticMethos() {
		System.out.println("Child class static method calisti");
	}

	private void privateMethod() {
		System.out.println("Child class private methodu calisti");
	}

	/*
	 * public final void finalMethod() {
	 * 
	 * System.out.println("Child class final method");
	 * 
	 * }
	 */
}
