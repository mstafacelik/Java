package javaTekrarYoutube;

public class Ders22WhileBreakIleSonlandirma {

	public static void main(String[] args) {
		// Sonsuza kadar calisan bir tane while loop olusturun ve 100. calismasi
		// sirasinda donguyu
		// "break" ifadesi ile sona erdirin.

		// 1. Yol

		int sayi1 = 0;
		while (true) {

			System.out.print(sayi1);
			System.out.print (" ");
			if (sayi1 > 99) {
				break;
			}
			sayi1++;

		}
		System.out.println(" ");

		// 2.Yol
		int sayi2 = 0;

		while (sayi2 < sayi2 + 1) {

			if (sayi2 < 101) {
				
				System.out.print(sayi2);
				System.out.print (" ");
				sayi2++;
				if (sayi2 == 101) {
					break;
				}

			}

		}

	}

}
