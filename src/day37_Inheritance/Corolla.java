package day37_Inheritance;

public class Corolla extends Toyota{
	
	
	String renk;
	int fiyat;
	boolean elektrikliMi;
	int tekerSayisi=4;
	String uretimYeri="Turkiye";
	

	public static void main(String[] args) {
		
		     Corolla                      arb1            =               new         Corolla();
		
		// Class ismi && Data turu      Obje ismi    Assignment        keyword       Constructor
		
		// Constructor olmadan obje calismaz. Objeyi olusturan constructor tir.
		// Obje olustururken constructor i takip et!
		// Class uyesi bulmak icin data turune bak!
	    // Bir objenin hangi ozellikleri sahip oldugunu bulmak icin data tipine bakariz.(String, Toyoto vs) 
		
		// javada obje olusturdugumuz her class ismi ayni zamanda bir data turudur
		// bu ornegimiz icin Corolla hem classs adi, hem de olusturdugumuz arb1 objesinin data type dir
		// java da obje uretilen her bir class ayni zamanda non-primitive data turu olur.
		     
		     
		     
		System.out.println(arb1.calisiyorMu);   // true-->> Bu class ta calisiyorMu yok, Toyoto class inda da yok.
											    // Ama Araba da var.Ordan buldu getirdi.
		System.out.println(arb1.tekerSayisi);   // 4 --->>>bu class taki(Corolla) 4 u yazdirir.
		System.out.println(arb1.uretimYeri);    // Turkiye--->>> bu class ta Turkiye var
		     
		
		
		Toyota arb2= new Corolla();		       // data Toyota string olan obje
	    System.out.println(arb2.calisiyorMu);  // ture
		System.out.println(arb2.tekerSayisi);  // 0-->> 4 OLMAZ!!! DATA TYPE TOYOTA.ONEMLI OLAN CONSTRUCTOR DEGIL DATA TYPE!
		 
		Araba arb3=new Corolla();              // data turu Araba olan obje
		 
		String str=new String("Esros");        // data turu String olan obje
		 
		  
		// Data turu ve conts. farkli class lardan olustugunda objemiz data turu ve 
		// onun parent class larindaki variable lara
		// ulasabilir ancak data turunden asagaidakilere ulasamaz
		
		
		     
		     
	}

}
