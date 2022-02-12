package day11_stringManupilations;

public class C04_IndexOf {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// parametre olarak girilen bir CHAR veya STRING in ilk index ini verir.
		
		String str="Calisirsaniz, Java ogrenmek cok kolay";
				
		System.out.println(str.indexOf('s')); //4
		
		System.out.println(str.indexOf("J")); //14
		
		
		int index=str.indexOf("r") ;  // indexOf() bize her zaman integer bir deger doner
		
	    System.out.println(index);  // 6
	    
	    System.out.println(str.indexOf('q'));
		
		
		// eger bir string in index degeri  olarak -1 gelirse o string in olmadigini anlariz.
	    // Bir string icinde olmayan bir karakter veya kelime ararsak java -1 sonucunu döndürür.
	    
	    System.out.println(str.indexOf('A')); //-1 --->>str de buyuk A olmadigi icin -1 yazdirir.
	    
	    System.out.println(str.indexOf("va og")); // 16
	    
	    // aradigimiz charSquence anlamli veya anlamsiz bir kelime olabilir.
	    // bu durumda java aradigimiz charSquence tek bir paket gibi dusunur ve o paketin baslangic index ini bize verir
	    
	    System.out.println(str.indexOf('e', 15)); // java 15. inci index ten itibaren(15 dahil) e harfini aramaya baslar.
	    
	}

}
