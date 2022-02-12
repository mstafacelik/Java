package javaTekrarYoutube;

import java.util.Scanner;

public class Ders11_HaftaninGunuSorgulama {

	public static void main(String[] args) {
		// Kullanicidan bugunun hangi gun oldugunu alin ve eger gun c.tesi ya da pazar
		// ise consol "Haftasonu"
		// degilse " Haftaici" yazdiralim

		Scanner scan = new Scanner(System.in);

		System.out.println("Bugun gunlerden ne?");

		String gun = scan.next();

		if (gun.equalsIgnoreCase("cumartesi") || gun.equalsIgnoreCase("pazar")) {
			System.out.println("Haftasonu");
		}
		else if ((gun.equalsIgnoreCase("pazartesi") || gun.equalsIgnoreCase("sali") || gun.equalsIgnoreCase("carsamba"))
				|| gun.equalsIgnoreCase("persembe") || gun.equalsIgnoreCase("cuma")) {
			System.out.println("Hafta ici");
		} else {
			System.out.println("Gecersiz gun girdiniz");
		}

	}

}
