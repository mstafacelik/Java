package javaTekrarYoutube;

import java.util.Scanner;

public class Ders15_VizeFinalNotuHesaplama {

	public static void main(String[] args) {
		// 0-39 ->FF
		// 40-49 ->DD
		// 50-59 ->CC
		// 60-69 ->BB
		// 70-79 ->BA
		// 80-100 ->AA
		// Vize -> %40
		// Final -> %60

		Scanner scan = new Scanner(System.in);

		System.out.println("lutfen vize notunuzu giriniz");

		double vizeNotu = scan.nextDouble();

		System.out.println("lutfen final notunuzu giriniz");

		double finalNotu = scan.nextDouble();

		double ortalama = (vizeNotu * 40 / 100)+ (finalNotu * 60 / 100);
		System.out.println(ortalama);

		if (ortalama < 40) {
			System.out.println("Notunuz : FF");
		}
		
		else if (ortalama < 50) {    // ortalama >= 40 && --->>yazmaya gerek yok! zaten 40 tan buyukse buraya gelecek
			System.out.println("Notunuz : DD");
		} 
		
		else if ( ortalama < 60) {  // ortalama >= 50 && --->>yazmaya gerek yok! zaten 50 den buyukse buraya gelecek
			System.out.println("Notunuz : CC");
		} 
		
		else if (ortalama < 70) { // ortalama >= 60 && --->>yazmaya gerek yok! zaten 60 tan buyukse buraya gelecek
			System.out.println("Notunuz : BB");
		} 
		
		else if (ortalama < 80) {  // ortalama >= 70 && --->>yazmaya gerek yok! zaten 70 ten buyukse buraya gelecek
			System.out.println("Notunuz : BA");
		}
		
		else if(ortalama<=100) {  // ortalama>=80 &&  --->>yazmaya gerek yok! zaten 80 ten buyukse buraya gelecek
			System.out.println("Notunuz : AA");
		}
		

	}

}
