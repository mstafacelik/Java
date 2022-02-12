package day16_forLoop;

import java.util.Iterator;
import java.util.Scanner;

public class C05_ForLoop {

	public static void main(String[] args) {
		// Kullanicidan 100’den kucuk bir tamsayi isteyin. 
		// 1’den baslayarak girilen sayiya kadar(sayi dahil) 3’un kati olan sayilari yazdirin.
		
		
		
	
		
		
		Scanner scan=new Scanner(System.in);
		
		System.out.println("Lutfen 100 den kucuk bir tam sayi giriniz");
		
		double sayi=scan.nextDouble();				
		int num=(int) sayi; // double int e normalde donusmeyecegi icin(double daha genis cunku)
							// burda bu islemi yaparken manuel onay ister
		
		
		// girilen sayinin double olup olmadigi kontrol icin num isimli int bir variable olustururuz.
		// sonra num ile sayi yi karsilastiririr.
		// num ile sayi esit ise girilen girilen sayi bir tam sayidir, esit degilse girilen sayi tam sayi degildir.
		
		
		
		// sayi negatifse veya tam sayi degilse uyari verelim	
		
		
		if (sayi<0 ) {
			System.out.println("nagatif sayi giremezsiniz");
		} else if(sayi!=num) {

			System.out.println("Lutfen tam sayi giriniz");
			
		}else if(sayi>100) {
			System.out.println("Lutfen 100 den kucuk bir sayi giriniz");		
		}else {
			
			
			for (int i = 1; i <= sayi; i++) {
			
			if (i%3==0) {
			
			System.out.print(i + " ");
			
			  }
			
			}
		}
			
			
			
			
	}		
			
			
}		
				
		
