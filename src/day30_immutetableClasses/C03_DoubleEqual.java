package day30_immutetableClasses;

public class C03_DoubleEqual {

	public static void main(String[] args) {
		
		
		// Java'da String iki turlu olusturulabilir
		// 1- non-primitiv oldugu icin new keyword ile
		// Java once esitligin sagina baktigindan new kelimesi oldugu icin once obje olusturur sonra degeri atar
		// Yani bu olusturma seklinde her zaman yeni bir obje olusur adi ustunde new.
		
		
		// 2- Bugüne kadar ogrendimiz gibi olusturursak
		// String str2="Mustafa" ;
		// Java bu durumda esitligin saginda olan String in STRING HAVUZU'nda olup olmadigi kontrol eder.
		// Ve havuzda varsa yeni obje olusturmaz, oncekinin referansina yeninin referansini da ekler
		
		String str1= "Mustafa";
		String str2= "Mustafa";
		
		
		String str3=new String("Mustafa"); // non primitiv data turleri new keyword ile olusturulur
		String str4=new String("Mustafa");

		
		
		System.out.println(str1==str3); // false--->> String ler icin == isareti kullanmayiz. yanlis sonuc "verebilir."
										// == isareti hem degere hem referansa bakar
		System.out.println(str1.equals(str3)); // true
											   // equals() sadece degere bakar
		
		System.out.println(str1==str2);  //true
	}

}
