package day14_methodCreation;

import java.util.Scanner;

public class C02_methodCreation {

	public static void main(String[] args) {
		
		// kullanicidan 2 sayi isteyin.
		// sayilarin karelerini ve kuplerini toplayip yazdiran iki ayri method yazin
		// kullaniciya us sorun
		// 2 yazarsa kareleri toplamini yapan method, 3 yazarsa kupler toplamini yapan method calissin.
		
		
		
		Scanner scan=new Scanner(System.in);
		
		System.out.println("Lutfen iki sayi giriniz \nilk sayidan sonra enter a basiniz");
		
		double sayix= scan.nextDouble();
		double sayiy=scan.nextDouble();
		
		System.out.println("Girilen sayilarin kareler toplamini istiyorsaniz 2"
				+ " \nkupler toplamini istiyorsaniz 3 e basin");
		
		int secim=scan.nextInt();	// switch de double olmaz. burda int kullandigimiz icin sorun yok.
		
		switch(secim) {				
		
		case 2 :
			
			kareToplami(sayix, sayiy) ; 
			break;
			
		case 3 :
			kupToplami(sayix, sayiy) ;
			break ;
			
			default :
				
			System.out.println("Lutfen istenen tercihlerden birini yapin");
		}
			
		
		
		//kareTopla(sayi1, sayi2);  ---->>>buna ihtiyacimiz yok, Method olusturduktan sonra silebiliriz!!!.  
		// kupToplami(sayi1, sayi2);----->>>buna ihtiyacimiz yok, Method olusturduktan sonra silebiliriz!!!

		// bir methodu 4 adimda olustururuz.
		// 1. adim methodu javaya olusturtabilmek icin method call yapiyoruz.
		// 2. adim arguman ihtiyaci var mi belirleyelim
		// 3. adim javadan yardim alarak methodu olusturalim-
		// 4. adim axcess modifer ve return type a karar ver
		// bundan sonra methodun yapacagi isleri gerceklestirecek kodlarimizi yazariz
		
		scan.close();
		
		
	}

	public static void kupToplami(double sayi6, double sayi7) {
		
		double kuplerToplami= (sayi6*sayi6*sayi6) + (sayi7*sayi7*sayi7) ;
		
		System.out.println("Girilen sayilarin kuplerinin toplami= " + kuplerToplami);
		
		
	}

	public static void kareToplami(double sayi3, double sayi4) {
		
	//bizim arguman isimlerimizle parametre isimlerimiz ayni olmak zorunda degil. 
	//java isimlere	degol degerlere bakar.
	// bu bir zorunluluk degil, imkandir. Istedigimizi tercih edebiliriz.
	
		
	double karelerToplami=sayi3*sayi3 + sayi4*sayi4 ;
	
	
	
		System.out.println("Girilen sayilarin karelerinin toplami= " + karelerToplami);
		
	
	}

	
	
	
	
	
}
