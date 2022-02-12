package javaTekrarYoutube;

import java.util.Scanner;

public class Ders17_Ternary_VizeFinalNotuHesaplama {

	public static void main(String[] args) {
		// // 0-39 ->FF
		// 40-49 ->DD
		// 50-59 ->CC
		// 60-69 ->BB
		// 70-79 ->BA
		// 80-100 ->AA
		// Vize -> %40
		// Final -> %60
		
		Scanner scan=new Scanner (System.in);
		System.out.println("Lutfen vize ve final notunuzu giriniz.\nFinal notunu girmek icin enter a basiniz");

		double vizeNotu=scan.nextDouble();
		double finalNotu=scan.nextDouble();
		
		double ortalama=vizeNotu*40/100 + finalNotu*60/100; 
		
		
		//1. yontem ternary ile
		String sonuc=ortalama<40 ? ("FF"  ): (ortalama<50 ? "DD" : ortalama<60 ? "CC" : ortalama<70 ?  "BB "  :
					 ortalama<80 ? "BA " :   "AA ");
		System.out.println("ortalamaniz : " + ortalama + " olup " + "harf notunuz : " +   sonuc);
		
		
		
		//2. yontem if ile
		
		if (ortalama<40) {
			System.out.println("Notunuz : FF");
		} else if(ortalama<50) {
			System.out.println("Notunuz : DD");
		}else if (ortalama<60) {
			System.out.println("Notunuz : CC");
		}else if (ortalama<70) {
			System.out.println("Notunuz : BB");
		}else if(ortalama<80) {
			System.out.println("Notunuz : BA");
		}else if (ortalama<=100) {
			System.out.println("Notunuz : AA");
		}
		
		
		
		
		
		
		
	}

}
