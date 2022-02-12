package day08_IfElseStatement;

import java.util.Scanner;

public class C01_IfElse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Soru 1) Kullanicidan dikdortgenin kenar uzunluklarini isteyin ve dikdortgenin kare olup olmadigini yazdirin
		
		Scanner scan=new Scanner(System.in);
		
		System.out.println("lutfen dikdortgenin kenar uzunlugunu giriniz");
		
		double kenar1=scan.nextDouble();
		
       System.out.println("lutfen dikdortgenin diger kenar uzunlugunu giriniz");
		
		double kenar2=scan.nextDouble();
		
		if (kenar1==kenar2) {
			System.out.println("dikdortgen karedir");
		} 
		else {
			System.out.println("dikdortgen kare degildir");
		}
		
		
		//java burda (if else de)tek bir sarti kontrol etti.
		//eger basit if cumlesi ile ifade etseydik java iki sarti da kontrol edecekti. yani kenar1==kenar2 ve
		//kenar1!=kenar2 yi kontrol edecekti ayri ayri.
		
	}

}
