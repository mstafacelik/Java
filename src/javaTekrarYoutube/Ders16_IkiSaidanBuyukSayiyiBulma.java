package javaTekrarYoutube;

import java.util.Scanner;

public class Ders16_IkiSaidanBuyukSayiyiBulma {

	public static void main(String[] args) {
		// Kullanicinin girmis oldugu 2 sayidan buyuk olan sayiyi bulan bir program
		// yaziniz

		Scanner scan = new Scanner(System.in);
		System.out.println("lutfen bir sayi  giriniz");
		double sayi1 = scan.nextDouble();

		System.out.println("lutfen ikinci sayiyi giriniz");
		double sayi2 = scan.nextDouble();

		if (sayi1 < sayi2) {
			System.out.println("Girilen ikinci sayi " + sayi2+  " birinci sayidan 4" + sayi1+ " buyuktur  " );
		} else if (sayi1 > sayi2) {
			System.out.println("Girilen birinci sayi " + sayi2 + " ikinci sayidan " + sayi2+ " buyuktur  " );
		} else {
			System.out.println("Girilen iki sayi birbirine esittir");
		}

	}

}
