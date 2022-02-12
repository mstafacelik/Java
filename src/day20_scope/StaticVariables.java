package day20_scope;

public class StaticVariables {
	
	static int no=20;
	static int sayi;
	static String adres="Ankara";
	static String cadde;
	static boolean aktifMi=true;
	static boolean tatildeMi;
	

	public static void main(String[] args) {
		
		// static variable lara main methodlardan direkt ulasilabilir mi? evet
		
		System.out.println(no); //20
		no++;
		System.out.println(no); //21
		
		staticMethod();
		System.out.println(no); // 22
		// staticOlmayanMethod() static olmayan method direkt main methoda cagrilamaz. Obje olusturmaliyiz
		
		
		StaticVariables obje=new StaticVariables();
		obje.staticOlmayanMethod();
		System.out.println(no); //23
	}

	
	
	public static void staticMethod() {
		
		// static variable lara static methodlardan direkt ulasilabilir mi? evet
		no++;
		System.out.println("static method da sayi : " + no); 
		
		
		
	}
	public void staticOlmayanMethod() {
		
		// static variable lara static olmayan methodlardan direkt ulasilabilir mi? evet
		// static variable lara static olan veya olmyan tum methodlardan direkt ulasilabilir.
		// bu yuzden static variable lara CLASS VARIABLE denir
		
		no++;
				
		System.out.println("static method da sayi : " + no); //23
		
	}
	
}
