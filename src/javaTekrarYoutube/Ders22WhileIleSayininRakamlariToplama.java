package javaTekrarYoutube;

import java.util.Arrays;

public class Ders22WhileIleSayininRakamlariToplama {

	public static void main(String[] args) {

		// While ile bir sayinin rakamlari toplamini yazdiralim

		int sayi = 123;

		int rakamlarToplami = 0;
		int basamak = 0;

		while (sayi > 0) {

			basamak = sayi % 10; // bir basamagi icin 3, onlar icin 2 yuzler icin 1 buldu
			rakamlarToplami += basamak;
			sayi /= 10;

		}
		System.out.println("Toplam : " + rakamlarToplami);

	}

}
