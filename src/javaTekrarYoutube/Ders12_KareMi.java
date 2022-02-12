package javaTekrarYoutube;

import java.util.Scanner;

public class Ders12_KareMi {

	public static void main(String[] args) {
		// kullanicidan diktorgenin uzunluklarini al ve kare mi dikdortgen mi soyle
		// il else kullanalim
		
		Scanner scan=new Scanner (System.in);
		
		System.out.println("Lutfen dikdorgenin kisa ve uzun kenarini giriniz.\nUzun kenari girmak icin enter basin");
		
		double kisaKenar=scan.nextDouble();  
		double uzunKenar=scan.nextDouble();
		
		if (kisaKenar==uzunKenar) {
			System.out.println("Karedir");
		}else {
			System.out.println("Dikdortgendir ");
		}
		
		

	}

}
