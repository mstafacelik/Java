package day18_nestedFoorLoop_whileLoop;

import java.util.Scanner;

public class C04_WhileLoop {

	public static void main(String[] args) {
		// kullanicidan toplanmak uzere sayi isteyin
		// kullanici sifira basincaya kadar sayilari alip toplamaya devam edin.
		// kullanici sifira bastiginda
		// o ana kadar kac sayi girdigini ve girilen sayilarin toplamini yazdirin.

		Scanner scan = new Scanner(System.in);

		int sayi = 100; // o in disinda herhangi bir sayi
		int toplam = 0;
		int sayac = 0;

		while (sayi != 0) {

			System.out.println("Lutfen toplama ekleme icin bir tam sayi giriniz. \nBitirmek icin 0 a basin");

			sayi = scan.nextInt();
			toplam += sayi;
			sayac++;

		}

		// kullanici 0 a bastiginda loop islevini son kez yapip
		// sonra basa donecek ve loop bitecek
		// 0 toplanmak uzere verilmeyip sadece bitirmek icin verildiginden
		// sifiri sayac a eklememek icin 36. satirda sayac-1 yaptik.

		System.out.println("Girilen sayilar toplami : " + toplam);

		System.out.println("Girilen sayi adedi : " + (sayac - 1));

	}

}
