package day19_whileLoop_doWhileLoop;

import java.util.Scanner;

public class C01_WhileLoop {

	public static void main(String[] args) {
		// Kullanicidan bir sayi alin ve bu sayiyi tam bolen sayilari
		// ve toplam kac tane olduklarini ekranda yazdirin

		Scanner scan = new Scanner(System.in);

		System.out.println("Lutfen bolenlerini bulmak icin pozitif bir tam sayi giriniz");

		int sayi = scan.nextInt();
		int bolen = 1;
		int sayac = 0;

		while (bolen <= sayi) {
			if (sayi % bolen == 0) {

				System.out.print(bolen + " ");

				sayac++; // sart saglarsa sayac artmaya devam eder.
			}

			bolen++; //buraya yazdik cunku bolen her zaman bir artarak devam eder sart saglasa da saglamsa da.
					 //bunu yazmaksak sonsuza kadar 1 i calistirmaya devam eder
		}
		System.out.println("");
		System.out.println(sayi + " sayisinin " + sayac + " adet boleni vardir");
	}

}
