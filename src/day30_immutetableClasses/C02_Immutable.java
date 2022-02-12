package day30_immutetableClasses;

public class C02_Immutable {

	public static void main(String[] args) {
		
		String str="Ali";
		
		for (int i = 0; i < 100; i++) { // 100 kez loop calisir
			
			str+= " "; // str=str + " " ---->>> burda atama var!!!
		}
		
		// bu kod calistiginda java kac obje olusturur?
		// Ekranda goremeyiz fakat java atama yapar ve obje olusturur
		// bir obje basta olusturuldu
		// loop ta ose 100 obje olusturuldu
		// java 101 obje tane obje olusturmus oldu
		// str'in son degeri ise "ALi      (100 bosluk)   ""
	}

}
