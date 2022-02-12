package day18_nestedFoorLoop_whileLoop;

import java.util.Scanner;

public class C02_ForLoop {

	public static void main(String[] args) {
		
		
		// Kullanicidan iki tamsayi isteyiniz.
		// Ilk sayidan baslayarak, ikinci sayiya kadar ucer ucer artirarak yazdirin
		// ikinci sayi dahil olmak zorunda degil.
		
		Scanner scan=new Scanner (System.in);
		
		System.out.println("Lütfen iki tamsayi giriniz");
		
		int sayi1=scan.nextInt();
		int sayi2=scan.nextInt();
		
		
		if (sayi1<sayi2) {						// artaracak gidecek
			
		for (int i = sayi1; i <= sayi2; i+=3) {		
				System.out.print(i + " ");
			}
			
		
		
			
			} else if(sayi1>sayi2) {			//azalarak gidecek
			
			for (int i = sayi1; i >= sayi2; i-=3) {
				System.out.print(i + " ");
			}
			
			
			
			
			
		} else {
			System.out.println("Girilen sayilar esit");
		}
		
		
		scan.close();
	}

}
