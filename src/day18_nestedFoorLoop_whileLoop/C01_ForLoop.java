package day18_nestedFoorLoop_whileLoop;

import java.util.Scanner;

public class C01_ForLoop {

	public static void main(String[] args) {
		
		// Kullanicidan iki tamsayi isteyiniz.
				// kucuk sayidan baslayarak, buyuk sayiya kadar 3 un kati olanlari yazdirin
				// ikinci sayi dahil olmak zorunda degil.
				
				Scanner scan=new Scanner (System.in);
				
				System.out.println("Lütfen iki tamsayi giriniz");
				
				int sayi1=scan.nextInt();
				int sayi2=scan.nextInt();
				
				int kucuk=0;
				int buyuk=0;
				
				
				if (sayi1>sayi2) {
					kucuk=sayi2;
				    buyuk=sayi1;
				} else {
		            kucuk=sayi1;
		            buyuk=sayi2;
				}
				
				for (int i = kucuk; i < buyuk; i++) {
					
				if (i%3==0) {
					System.out.print(i+" ");
				} else {

				}
					
					
					
				}
		
		
		

	}

}
