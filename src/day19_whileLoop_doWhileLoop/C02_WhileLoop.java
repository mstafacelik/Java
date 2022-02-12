package day19_whileLoop_doWhileLoop;

import java.util.Scanner;

public class C02_WhileLoop {

	public static void main(String[] args) {
		// Kullanicidan bir sayi alin ve bu sayinin rakamlari toplamini yazdirin

		Scanner scan = new Scanner(System.in);

		System.out.println("Lutfen rakamlar toplamini bulmak icin bir sayi giriniz");

		int sayi = scan.nextInt();

		int rakamlarToplami = 0;

		int rakam = 0;

		while (sayi > 0) {

			rakam = sayi % 10;

			rakamlarToplami += rakam;

			sayi /= 10;

		}

		System.out.println("Girdiginiz sayinin rakamlar toplami : " + rakamlarToplami);

		// for loop ile yapalim

		rakamlarToplami = 0;

		for (int i = 0; i < args.length; i++) {

		}

	}

}
