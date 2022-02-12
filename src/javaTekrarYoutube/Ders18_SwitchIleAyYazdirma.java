package javaTekrarYoutube;

import java.util.Scanner;

public class Ders18_SwitchIleAyYazdirma {

	public static void main(String[] args) {
		// kullanicinin girmis oldugu sira bilgisini kullanarak hangi ayda oldugunu
		// consol yazdiralim
		// Not:If-Else degil Switch Case kullanalim

		Scanner scan = new Scanner(System.in);
		System.out.println("Icinde bulundugunuz ayi ogrenmek icin 1 ila 12 arasindan bir sayi giriniz");

		int sayi = scan.nextInt();

		switch (sayi) {

		case 1:
			System.out.println("Ocak");
			break;
		case 2:
			System.out.println("Subat");
			break;
		case 3:
			System.out.println("Mart");
			break;
		case 4:
			System.out.println("Nisan");
			break;
		case 5:
			System.out.println("Mayis");
			break;
		case 6:
			System.out.println("Haziran");
			break;

		case 7:
			System.out.println("Temmuz");
			break;

		case 8:
			System.out.println("Agustos");
			break;

		case 9:
			System.out.println("Eylul");
			break;

		case 10:
			System.out.println("Ekim");
			break;

		case 11:
			System.out.println("Kasim");
			break;

		case 12:
			System.out.println("Aralik");
			break;

		default:
			System.out.println("Gecersiz sayi");
			break;

		}

	}

}
