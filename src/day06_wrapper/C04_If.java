package day06_wrapper;

public class C04_If {

	public static void main(String[] args) {

		int a= 10 ;
		int b= 20 ;
		
		if (a>5) {
			
		System.out.println("a sayisi 5 ten buyuk"); // treu, kod calisir ve sonuc ekranda yazar
			
		}
		
		
		 if (a>b) {
			
		 System.out.println("a sayisi buyuktur b den"); // false, kod calisir ama sonuc yazdirmaz
		}
		

		 
		 if (b>100) {
			 
		System.out.println("b sayisi 100 den buyuk"); // false, kod calisir ama sonuc yazdirmaz
		}
	
	
	//basit if cümleleri bagimsiz calisir. Tüm if lerin body'si calisabilir, bazilari calisabilir
	// hatta hicbirinin body si calismayabilir
    //her bir if cumlesi kendi sartina bakar, sart true ise body yazdirir
	// sart false ise kod calisir ama yazdirmaz

		 
		// if ("Student") {    
		// bu foksiyon calismaz. if fonksiyonu muhakkak boolean olmali. yani degerin treu ya da false olabilcek
		// bir if fonksiyonu olmali.
		 
		// if (5=5) {
		// bu foksiyon da output vermez. cunku = yerine matematiksel islemi ifade eden == kullanilmali!!!	
			 
		
		 
		 
		 
		 
		 
	}
	

}
