package day10_ternary_SwitchCase;

import java.util.Scanner;

public class C02_Ternary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Kullanicidan bir tamsayi alin ve sayinin tek veya cift oldugunu yazdirin
		
		
		
		Scanner scan=new Scanner(System.in);
		
		System.out.println("Lutfen bir tam sayi giriniz");
		
		double sayi=scan.nextDouble();
		
		//sayi%2==0 ? cift sayi : tek sayi
		

		
		System.out.println(sayi%2==0 ? "cift sayi" : "tek sayi"); //String bir ifade girilince tirnak icine almak zorundayiz
		
		
	}

}
