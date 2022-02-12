package day10_ternary_SwitchCase;

import java.util.Scanner;

public class C04_Ternary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		//Kullanicidan bir sayi alin Sayi pozitifse “Sayi pozitif” yazdirin, negatifse
		//sayinin karesini yazdirin
		
		
		 Scanner scan=new Scanner(System.in);
			
		System.out.println("Lutfen bir sayi giriniz");
			
		double sayi=scan.nextDouble();
		
		//sayi>=0 ? "sayi pozitiftir" :sayi*sayi
		
		System.out.println(sayi>=0 ? "sayi pozitiftir" : sayi*sayi);
	}

}
