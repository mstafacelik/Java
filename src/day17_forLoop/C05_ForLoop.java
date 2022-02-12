package day17_forLoop;

import java.util.Scanner;

public class C05_ForLoop {

	public static void main(String[] args) {
		
		//Soru 11 ) Interview Question
		//Kullanicidan 10’dan kucuk bir tamsayi isteyin ve girilen sayinin faktoryel’ini bulun. (5!=5*4*3*2*1)
		
		Scanner scan=new Scanner(System.in);
		
		System.out.println("Lutfen 10 dan kucuk bir tam sayi giriniz");
		
		int sayi=scan.nextInt();
		
		System.out.print(sayi + "!="); //yanyana yazdirmak icin print deki ln yi sildik
		
		int faktoryel=1;     // 0 girersek sonuc direkt 0 olur.
		
		for (int i = sayi; i >1; i--) {
		
			faktoryel*=i;
			System.out.print(i+ "*"); //yanyana yazdirmak icin print deki ln yi sildik
			
		}
		System.out.println("1="+ faktoryel);
		scan.close();
	}

}
