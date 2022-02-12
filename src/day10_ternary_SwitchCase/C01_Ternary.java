package day10_ternary_SwitchCase;

import java.util.Scanner;

public class C01_Ternary {

	
	public static void main(String[] args) {
		
		//Kullanicidan iki sayi alin ve buyuk olmayan sayiyi yazdirin
		
		Scanner scan=new Scanner(System.in);
		
		System.out.println("Lutfen iki sayi giriniz.\nDiger sayiyi girmek icin Enter a basiniz");
		
		double sayi1=scan.nextDouble();
		
		double sayi2=scan.nextDouble();
		
		
		
		//sayi1>sayi2 ? sayi2:sayi1
		
		System.out.println(sayi1>sayi2 ? sayi2:sayi1);
		scan.close();
		
		
		
		
		
		
		
		
		
		
	}
}
