package day19_whileLoop_doWhileLoop;

import java.util.Scanner;

public class C03_ForLoop {

	public static void main(String[] args) {
		// Kullanicidan bir sayi alin ve bu sayinin rakamlari toplamini yazdirin

		Scanner scan = new Scanner(System.in);

		System.out.println("Lutfen rakamlar toplamini bulmak icin pozitif bir tam sayi giriniz");

		int sayi = scan.nextInt(); 	// data turu int

		int rakamlarToplami = 0;
		int rakam = 0;

		String sayistr = "" + sayi; // kullanicinin girdigi int sayiyi basina hiclik koyarak ("")
									// String e cevirdik. Bu sayede str.length() methodunu kullanarak sayinin kac
									// basamakli oldugunu buluruz.
									// aksi halde sayinin kac basamaktan olustugunu bulamayiz. 
		// Baska bir deyisle;
		// int olrak verilen bir sayinin basamak sayisini bulmak istersek
		// kisa yoldan o sayiyi String e cevirip str.length() methodunu kullanabiliriz.

		for (int i = 0; i < sayistr.length(); i++) {

			rakam = sayi % 10;
			rakamlarToplami += rakam;
			sayi /= 10;

		}

		System.out.println("Girdiginiz sayinin rakamlar toplami : " + rakamlarToplami);
		scan.close();
	}

}
