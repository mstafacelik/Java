package javaTekrarYoutube;

public class Ders06_BasamaklariYazdirmaToplama {

	public static void main(String[] args) {
		
		
		int sayi=345;
		
		// benim cozdugum sekil
		
		System.out.println(sayi%10);
		
		System.out.println((sayi/10)%10);;
		
		System.out.println(sayi/100);
		
		System.out.println(" ");
		
		
		// hocanin cozumu
		
		int birler=sayi%10;  // 5
		sayi/=10;			 // 34
		
		int onlar=sayi%10;  // 4
		sayi/=10;			// 3
		
		int yuzler=sayi%10; //3			// bunu yapmasak da olurdu. Zaten 34 u 10 bolunce geriye yuzler 
										//basamigini direkt veriyor
		System.out.println("Birler basamagi : " + birler);
		System.out.println("Onlar basamagi : " + onlar);
		System.out.println("Yuzler basamagi : " + yuzler);
		
		// verilen sayinin basamaklarini toplamak istresek;
		
		int basamakDegerleriToplam=birler+ onlar+ yuzler;
		System.out.println("Verilen sayinin basamak degerleri toplami : " +basamakDegerleriToplam);
		
		
		 

	}

}
