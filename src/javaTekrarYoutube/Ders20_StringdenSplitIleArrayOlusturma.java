package javaTekrarYoutube;

import java.lang.reflect.Array;
import java.util.Scanner;

public class Ders20_StringdenSplitIleArrayOlusturma {

	public static void main(String[] args) {
		// girilen bir metinde kac cumle, kac kelime, kac karakter oldugunu yaziniz

		Scanner scan = new Scanner(System.in);
		System.out.println("Bir metin giriniz");

		String metin = scan.nextLine();

		String[] cumleSayisi = metin.split("\\.");
		System.out.println("Metin " + cumleSayisi.length + " adet cumle icermektedir");

		String[] kelimeSayisi = metin.split(" ");

		System.out.println("Metin " + kelimeSayisi.length + " adet kelime icermektedir");

		String[] karakterSayisi = metin.split("");
		System.out.println("Metin " + karakterSayisi.length + " adet karakter icermektedir");

	}

}
