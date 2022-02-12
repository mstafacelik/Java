package day07_IfStatements;

import java.util.Scanner;

public class C04_BasitIfCumleleri {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * Soru 4) Kullanicidan dikdortgenin kenar uzunluklarini isteyin ve dikdortgenin kare olup
         olmadigini yazdirin
		 */
		
		Scanner scan=new Scanner(System.in) ; 
		
		System.out.println("lutfen dikdortgenin kenar uzunlugunu giriniz");
		
		double uzunluk1=scan.nextDouble();
		
		System.out.println("lutfen dikdortgenin diger kenar uzunlugunu giriniz");
		
		double uzunluk2=scan.nextDouble();
		
		if (uzunluk1==uzunluk2) {
			System.out.println("dikdortgen karedir");
		}
		
		if (uzunluk1!=uzunluk2) {
			System.out.println("diktortgen kare degildir");
		}
	
		/* char   a       =scan.next().charAt(0) ;
		   int    sayi    =scan.nextInt() ;
		   double uzunluk =scan.nextDouble();
		   String gun1    =scan.next() ;
		   String adSoyad =scan.nextLine();
		   
		   
		
		   String gun2   =scan.next().toLowerCase();
		   String gun3   =scan.next().toUpperCase();
		   char   b      =scan.next().toLowerCase().charAt(0);
		   char   c      =scan.next().toUpperCase().charAt(b);
		
		*/
		
		scan.close();
		
	
		
		
	} // main method sonu

} // class sonu
