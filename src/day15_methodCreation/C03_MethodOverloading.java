package day15_methodCreation;

public class C03_MethodOverloading {

	public static void main(String[] args) {
		
		// java da ayni isimde birden fazla method olur mu?
		//cevap : EVET
		
		// ayni isimde birden fazla method olursa java hangisini calistiracagina nasil karar?
		// cevap : isim ayni olan methodlarda oncelikle parametre sayisini bakar
		// sonra da parametre sayisi ile arguman sayisi esit olanlardan 
		// arguman data turleri ile parametre data turleri arasinda uyuma bakar
		// tamamen uyusan varsa onu kullanir
		// tamamen uyusan yoksa kapsayan var mi bakar ve onu kullanir.
		// birden fazla secenek oldugunda java her zaman en optimum olani tercih eder.
		
		
		
		//overloading icin bkz slayt!
		
		
		/*int sayi1=4;
		int sayi2=5;
		int sayi3=10;								---->asagida method olusturduktan sonra bunlarin hepsini silebiliriz
		int sayi4=20;
		topla(sayi1, sayi2, sayi3, sayi4); 
		*/
		
		
		topla(2, 4) ; // sonuc int int toplamindan 6 olur.
		topla(2.4, 5); // sonuc double int ten 7.4 olur. 
		

	

	}

	private static void topla(int sayi1, int sayi2, int sayi3, int sayi4) {
		
		System.out.println("dort sayinin toplami : " + (sayi1+sayi2+sayi3+sayi4));
	}

	private static void topla(int sayi1, int sayi2, int sayi3) {
		
		System.out.println("uc sayinin toplami : " + (sayi1+sayi2+sayi3));
	}

	private static void topla(int sayi1, int sayi2) {
		
		
		System.out.println("iki sayinin toplami ii : " + (sayi1+sayi2));
		
		
	}



	private static void topla(int sayi1, double sayi2) {
	
	
	System.out.println("iki sayinin toplami id : " + (sayi1+sayi2));
	
	
}


	private static void topla(double sayi1, int sayi2) {
	
	
	System.out.println("iki sayinin toplami di : " + (sayi1+sayi2));
	
	
}



	private static void topla(double sayi1, double sayi2) {
	
	
	System.out.println("iki sayinin toplami dd : " + (sayi1+sayi2));
	
	/*slayt tan bilgi...
	 * 
	 1) Overloading nedir ?
	2) Overloading nasil yapilir ?
	3) method signature (metot imzasi) nasil degistirilir?
	 ***
	method置n return type段ni degistirmek, access modifier段ni degistirmek veya static
	kelimesi eklemek method signature段 degistirmez
	Eger bir Class壇a ismi ayni fakat parametreleri farkli olan methodlar
	olusturursak buna Overloading denir.
	Java ayni isim ve ayni parametrelerle birden fazla method
	olusturulmasina izin vermez. Ayni isimle birden fazla method olusturmak isterseniz
	method signature (metot imzasi) imzasi)地in degistirilmesi gerekir
	Method signature段 degistirmek icin 3 yontem kullanilabilir
	-parametrelerin data tipleri degistirilebilir
	-parametrelerin sayisi degistirilebilir
	-parametre sayisi ayni olmak zorunda ise farkli data tipindeki parametrelerin sirasi
	degistirilir
	 * 
	 */
	
	
	
	
	
	
	
}

}


