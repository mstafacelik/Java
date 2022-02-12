package day18_nestedFoorLoop_whileLoop;

import java.util.Iterator;
import java.util.Scanner;

public class C03_NestedForLoop {

	public static void main(String[] args) {
		// Kullanicidan 10 dan kucuk bir tam sayi girmesini isteyin
		// girdigi sayiya gore asagidaki sekli yazdrin
		// orn : 3 girerse
		// 1
		// 1 2
		// 1 2 3

		Scanner scan = new Scanner(System.in);

		System.out.println("Lutfen 10 dan kucuk bir tam sayi giriniz");

		int sayi = scan.nextInt();

		for (int satir = 1; satir <= sayi; satir++) {

			for (int i = 1; i <= satir; i++) {

				System.out.print(i + " ");
			}
			System.out.println(""); // als satira gecmesi gecmesi icin bunu yazdik
			
			
			

			// ctr+shift+f basarsak suslu parantezleri duzgun hale getirir.

		}

	}

}
