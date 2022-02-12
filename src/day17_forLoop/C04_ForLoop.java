package day17_forLoop;

import java.util.Scanner;

public class C04_ForLoop {

	public static void main(String[] args) {
		// Kullanicidan iki sayi isteyin.
		// Girilen sayilar ve aralarindaki tum tamsayilari toplayip, sonucu yazdiran bir program yaziniz
	
	
		Scanner scan=new Scanner(System.in);
		
		System.out.println("Lutfen iki sayi giriniz. "
				+ "\nDiger sayiyi girmek icin enter a basiniz");
	
		int sayi1=scan.nextInt();
		int sayi2=scan.nextInt();
		
		
		int kucuk=0; // null atayamayiz, cunku null String de atanir. Burda herhangi bir deger atamazsak da calisabilir
					 // ama bazen hata verebilirmis
		int buyuk=0;
		
		if (sayi1>sayi2) {
			
			buyuk=sayi1;
			kucuk=sayi2;
			
		} else {
			
			buyuk=sayi2;
			kucuk=sayi1;
			
		}
	
		
		int toplam=0;     // böyle bir variable olusturmak zorundayuz. Java topladigi sayilari bir kabin icinde(variable)
						  // bir araya geitirip toplar. Bu olmasa biraraya getirecegi bir kap(variable) olmaz.!!!
		
		for (int i = kucuk; i <= buyuk; i++) {
			
			toplam+=i;
		}
		
		System.out.println("Girilen sayilar ve aralarindaki sayilarin toplami : "+ toplam);
		
		scan.close();
	}

}
