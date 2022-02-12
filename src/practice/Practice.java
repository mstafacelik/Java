package practice;

public class Practice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		//Soru 1
		
		//verilen 12345 sayisinin rakamlarini yukaridan asagiya dogru yazdiriniz//
		
	int sayi = 12345;
	
	int birler= sayi%10 ; //biler basamaginin 10 a bolumunden kalanidir
	int onlar= (sayi/10)%10;
	int yuzler = (sayi/100)%10;
	int binler= (sayi/1000)%10;
	int onBinler= (sayi/10000);
	
	System.out.println(onBinler);
	System.out.println(binler);
	System.out.println(yuzler);	
	System.out.println(onlar);	
	System.out.println(birler);	
	
	
	//consolda altsatira yazdirmak icin "\n" komutu kullanilir.
	
	System.out.println(onBinler+"\n"+binler+"\n"+yuzler+"\n"+onlar+"\n"+birler );
	
	
	//Soru 2
	
	
	 
	
	
	
	
	}

}
