package day33_stringBuilder;

public class C03_Equals {

	public static void main(String[] args) {
		
		StringBuilder sb1=new StringBuilder("Java");
		StringBuilder sb2=new StringBuilder("Java");
		
		System.out.println(sb1==sb2); // false----Stringde de false verir.
		System.out.println(sb1.equals(sb2)); // false  ---> sb degilde String olsaydi true olurdu.
		
		// sb da equals methodu String deki mantikla calismaz, == mantigi ile calisir!!! 
		// sb ler equals da olsa == olsa hem referansa hem degere bakar
		// Yani sb ler equals ya da == ile karsilastirilamaz. false verir
		
		// System.out.println(sb1.compareTo(sb2));  // 0 (compare=vergleichen)
		// compareTo methodu ilk harflerden baslayarak sb leri karsilastirir
		// eger tum karakterler ayni ise sonuc olarak 0 doner.
		// farkli karakter bulursa ilk yazilan sb, ikinci yazilandan kac char ondeyse onu doner
		// sb1 "Jeva", sb2 "Java" olsaydi e a dan 4 karakter buyuk, onde (ASCII ye gore) oldugu icin konsolda 4 yazardi.
		
		
		// eger iki sb nin esit olup olmadigi anlamak istersek
		// if(sb1.compareTo(sb)==0) ile bakabiliriz.
		
		
		String str="Java";
		
		// System.out.println(sb1==str);   == ile String i karsilastiramaz
		
		System.out.println(sb1.equals(str)); // false
		
		// System.out.println(sb1.compareTo(str)); // compareTo, String icin kullanilamaz
		
		// System.out.println(sb1=="Java");  // Java burda "Java" yi direkt String olarak kabul ettigi icin CTE verir
		
		System.out.println(sb1.equals("Java")); // false
		// System.out.println(sb1.compareTo("Java"));
		
		
		
	}

}
