package day03;

public class C04_ExplicitNarrowing {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		// eger buyuk data türündeki veriyi daha kucuk turundeki
		//varianle"a atamak istersek java bunu otomatik olarak yapmaz
		
		
		int sayi1=140 ;
		
		short sayi2= (short) sayi1 ;
		
		
		//esitligin sagi ile solundaki veri turleri farkli oldugundan java mismatch hatasi verir
		
		// hatayi gidermek icin buyuk data turundeki degerin onune manuel onayimizi gosteren
		//short yazilir
	
	System.out.println(" sayi2 : " + sayi2);
	
	
	byte sayi3=(byte) sayi2 ;
	
	System.out.println(" sayi3 : " + sayi3);
	
	//deger byte"in sinirlarindan buyuk oldugu ivin java int 140 i kendi yontemine gore 
	//byte"a donusturur ve bu arada bizim sayimiz DEGISIR
	
	
	double sayi4 = 87.3 ;
	int sayi5 = (int) sayi4   ; 
	
	System.out.println(" sayi5 : " + sayi5);
	
	
	// deger virgillu oldugundan ve int "da ondalikli kisim olmadigindan java ondalikli kismi keser
	//dolasiyla veri kaybi olur
	
	
	int sayi6=27;
	int sayi7=4 ;
	
	System.out.println(sayi6 / sayi7); // bolme islemi yapilan iki sayi da int oldugu icin
	//java sonucu int olarak yazar
	
	
	double sayi8=4 ;
	double sayi9=17 ;

   System.out.println(sayi6 / sayi8); //6,75 islem yapilan sayilardan daha genis data türüne sahip olan 
	//double oldugundan sonucu double olarak yazdirir
	
	System.out.println(sayi9 / sayi7); //4.25
	
	
	
	
	
		
	}

}
