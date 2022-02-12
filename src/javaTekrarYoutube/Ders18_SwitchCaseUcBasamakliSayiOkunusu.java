package javaTekrarYoutube;

import java.util.Scanner;

public class Ders18_SwitchCaseUcBasamakliSayiOkunusu {

	public static void main(String[] args) {
		// Kullanicinin girmis oldugu 3 basamakli sayinin sozel okunusunu yazdiran kod
		// yazalim

		Scanner scan = new Scanner(System.in);

		System.out.println("Lutfen 3 basamakli bir sayi giriniz");

		int sayi = scan.nextInt();

		int birler = sayi % 10;

		int onlar = (sayi / 10) % 10;

		int yuzler = sayi / 100;

		switch (yuzler) {

		case 1:
			System.out.print("Yuz ");
			break;
		case 2:
			System.out.print("IKizuz ");
			break;
		case 3:
			System.out.print("Ucyuz ");
			break;
		case 4:
			System.out.print("Dortyuz ");
			break;
		case 5:
			System.out.print("Besyuz ");
			break;
		case 6:
			System.out.print("Altiyuz ");
			break;
		case 7:
			System.out.print("Yediyuz ");
			break;
		case 8:
			System.out.print("Sekizyuz ");
			break;
		case 9:
			System.out.print("Dokuzyuz ");
			break;

		}

		switch (onlar) {

		case 1:
			System.out.print("on ");
			break;
		case 2:
			System.out.print("yimi ");
			break;
		case 3:
			System.out.print("otuz ");
			break;
		case 4:
			System.out.print("kirk ");
			break;
		case 5:
			System.out.print("elli ");
			break;
		case 6:
			System.out.print("altmis ");
			break;
		case 7:
			System.out.print("yetmis ");
			break;
		case 8:
			System.out.print("seksen ");
			break;
		case 9:
			System.out.print("doksan ");
			break;

		}
		
		// Aralarda bosluk birakmak icin System.out.print(" "); da kullanilabilir
		
		switch (birler) {

		case 1:
			System.out.print("bir");
			break;
		case 2:
			System.out.print("iki");
			break;
		case 3:
			System.out.print("uc");
			break;
		case 4:
			System.out.print("dort");
			break;
		case 5:
			System.out.print("bes");
			break;
		case 6:
			System.out.print("alti");
			break;
		case 7:
			System.out.print("yedi");
			break;
		case 8:
			System.out.print("sekiz");
			break;
		case 9:
			System.out.print("dokuz");
			break;

		}
		
		
		

	}

}
