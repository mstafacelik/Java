package day21_scope_arrays;

public class C02_LoopVariables {

	@SuppressWarnings("unused")
	public static void main(String[] args) {

		int sayi = 10;

		for (int i = 0; i < 6; i++) {

			String isim = "Ali";
			System.out.println(sayi + " " + isim);

		}
		
	
	   // System.out.println(isim);  ---->> loop icinde olusturdugumuz bir variable yi loop disinda kullanamayiz
	   // System.out.println(sayi);  ---->> loop un disinda olusturdugumuz variable yi loop un icinde kullanabiliriz
	   // System.out.println(i); ---->> loop icinde olusturulan variable lar loop disinda kullanilamaz.
	   // Bunun icin loop disinda da ihtiyacimiz olan bir degisken varsa loop dan once olusturur ve emniyette kalmak icin
	   // ilk deger atamasi (initializr) yapariz
		
		for (int i = 0; i < 10; i++) {
			
		//	int sayi=20; sayi variable i main methodun icinde olusturuldugundan tum main method da gecerlidir
		// dolayisiyla yeniden ayni isimde bir variable olusturamazsaniz
			
			String isim="Veli";
			
		}
	}

}
