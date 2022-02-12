package javaTekrarYoutube;

import java.util.Scanner;

public class Ders13_PozitifMiNegatifMiNotrMu {

	public static void main(String[] args) {
		// kullanicinin girdigi sayinin pozitif/negatif/notr oldugunu girin

		Scanner scan = new Scanner(System.in);
		System.out.println("Lutfen bir sayi giriniz");

		double sayi = scan.nextDouble();

		if (sayi < 0) {
			System.out.println("Girilen sayi negatif");
		} else if (sayi > 0) {
			System.out.println("Girilen sayi pozitiftir");
		} else {
			System.out.println("Girilen sayi notrdur");
		}

	}

}
