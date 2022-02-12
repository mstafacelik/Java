package day11_stringManupilations;

public class C03_Length {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str1= "Ali Kahyaoglu" ;
		
		System.out.println(str1.length());  //13---->
											//str1.length(), 1 den baslayarak str nin
											// ne kadar karakter uzunlukta oldugunu verir.
		
		// verilen str1 in son harfini yazdirin
		
		System.out.println(str1.charAt(12));    // u ----)bu dinamik yapi degildir. 
											    //ismin sonundan harf silsek kod hata verir.
		
		System.out.println(str1.charAt(str1.length() -1)); // bu dinamik yapidir.
		
		String str2= "";
		System.out.println(str2.length());  //0
		String str3=null ;
		// System.out.println(str3.length());--->>>bu durumda java hata verir ---->>>java.lang.NullPointerException
		
		String str4;
		System.out.println(str3);   // java hata vermez.null yazdirir--->>>str3 u olusturdun ama simdilik
								    // hic deger atamadin demek.
								    // null degeri bizim bu varianle i bilerek olusturdugumuzu ve bilerek deger 
									// atamadigimizi belirtiyor.
		// System.out.println(str4);   // Java hata verir.
								    // Eger String i olusturur ama deger atamazsak yazdirdigimizda hata aliriz.
										
		        // null pointer olusturdugumuz ancak sonra kullanacagimiz bir String i isaretlemek icin kullanilir.
				// Bir String i yazdirdigimizda null cikiyorsa turkce olarak
				// "Ben bu degiskeni olusturdum ama henuz deger atamadim" demek istiyor
				
		
		
		
		
		
		
	}

}
