package day19_whileLoop_doWhileLoop;

import java.util.Iterator;
import java.util.Scanner;

public class C06_DoWhile {

	public static void main(String[] args) {
		/*
		 * Kullanicidan bir sifre girmesini isteyin. Girilen sifreyi asagidaki sartlara
		 * gore kontrol edin ve sifredeki hatalari yazdirin. Kullanici gecerli bir sifre
		 * girinceye kadar bu islemi tekrar edin. Gecerli sifre girdiginde “Sifreniz
		 * Kabul edilmistir” yazdirin. Sifre kucuk harf icermelidir. Sifre buyuk harf
		 * icermelidir. Sifre ozel karakter icermelidir Sifre en az 8 karakter
		 * olmalidir.
		 */

		Scanner scan = new Scanner(System.in);
		String sifre = "";
		boolean khk = false;
		boolean bhk = false;
		boolean okk = false;
		boolean uk = false;
		// Kullanicidan birden fazla sifre almam gerecek, o yuzden sifre giriniz kismi
		// loop un icinde olmalidir.
		// Ancak burda for loop kullanamayiz, kullanici kac kere de dogru sifreyi girer
		// bunu bilmiyoruz.
		// Kullanicidan bilgi almamiz gereken durumlarda do while loop tercih edilir.

		do {
			System.out.println("Lütfen bir sifre giriniz");
			sifre = scan.nextLine();

			khk = kucukHarfKontrol(sifre); // method call
			// Amacimiz sifrenin kucuk harf icerip icermedigini kontrol etmek.
			// Eger kucuk harf iceriyorsa true, icermiyorsa false desin.
			bhk = buyukHarfKontrol(sifre);
			okk = ozelKarakterKontrol(sifre);
			uk = uzunlukKontrol(sifre);

		} while (!khk || !bhk || !okk || !uk);

		System.out.println("Sifreniz basarili bir sekilde kaydedilmistir");

	}

	private static boolean uzunlukKontrol(String sifre) {
		boolean uk = false;
		if (sifre.length() >= 8) {
			uk = true;
		} else {
			System.out.println("sifreniz en az 8 karakter olmalidir.");
		}

		return uk;
	}

	private static boolean ozelKarakterKontrol(String sifre) {

		boolean okk = false;
		String harfler = "!@§$%&/()==?´'*-<>,;:'";
		for (int i = 0; i < sifre.length(); i++) {

			if (harfler.contains(sifre.substring(i, i + 1))) {
				okk = true;
				break;
			}

		}
		if (!okk) {
			System.out.println("Sifreniz en az bir ozel karakter icermelidir.");
		}

		return okk;
	}

	private static boolean buyukHarfKontrol(String sifre) {
		boolean bhk = false;
		String harfler = "ABCDEFGHIJKLMNOPRSTUVYZWQX";
		for (int i = 0; i < sifre.length(); i++) {

			if (harfler.contains(sifre.substring(i, i + 1))) {
				bhk = true;
				break;
			}

		}
		if (!bhk) {
			System.out.println("Sifreniz en az bir buyuk harf icermelidir.");
		}

		return bhk;
	}

	private static boolean kucukHarfKontrol(String sifre) {

		boolean khk = false;

		String harfler = "abcdefghijklmnoprstuvyzqwx";

		for (int i = 0; i < sifre.length(); i++) {

			if (harfler.contains(sifre.substring(i, i + 1))) {
				khk = true;
				break; // loop u durdurur. Sadece bir tane kucuk harf olmasi yeterlidir.

			}
			// bu satira geldigimizde sifrede kucuk harf varsa khk=true oluyor.
			// kucuk harf icermiyorsa khk=false
			// khk=false yani kucuk harf yoksa asagidaki if calisacaktir.
		}
		if (!khk) {
			System.out.println("Sifreniz en az bir kucuk harf icermelidir.");
		}
		return khk;

	}

}