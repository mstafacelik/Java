package javaTekrarYoutube;

import java.util.Scanner;

public class Ders18SwitchIleDortIslem {

	public static void main(String[] args) {
		// Kullanicidan iki sayi alin ve hangi dort islem yapilmasi gerektigi sorarak
		// Switch Case kod yazin
		// Dort islem seciniz kismi su sekilde ;
		// 1 : Toplama
		// 2: Cikarma
		// 3 : Capma
		// 4 : Bolme

		Scanner scan = new Scanner(System.in);

		System.out.println("Lutfen iki sayi giriniz.\nikinci sayiyi girmek icin enter a basiniz");

		double sayi1 = scan.nextDouble();
		double sayi2 = scan.nextDouble();

		System.out.println("Lutfen tercih ettiginiz islem numarasini giriniz. Toplama icin 1, cikarma icin 2 ,"
				+ " carpma icin 3, bolme icin 4 e basiniz");

		int tercih = scan.nextInt();

		switch (tercih) {

		case 1:

			System.out.println(sayi1 + sayi2);
			break;

		case 2:

			System.out.println(sayi1 - sayi2);
			break;
		case 3:

			System.out.println(sayi1 * sayi2);
			break;
		case 4:

			System.out.println(sayi1 / sayi2);
			break;
		default:

			System.out.println("Gecersiz numara girdiniz");
			break;

		}

	}

}
