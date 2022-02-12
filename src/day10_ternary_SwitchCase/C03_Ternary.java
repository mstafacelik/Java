package day10_ternary_SwitchCase;

import java.util.Scanner;

public class C03_Ternary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		//Kullanicidan bir sayi alin ve sayinin mutlak degerini yazdirin
		
		
        Scanner scan=new Scanner(System.in);
		
		System.out.println("Lutfen bir sayi giriniz");
		
		double sayi=scan.nextDouble();
		
		//sayi>=0 ? sayi :sayi*(-1)
		
		System.out.println(sayi>=0 ? sayi :sayi*(-1)); //matematik dehasi esrosss :))öpücük :))) esros a bir öpucuk daha:))
		
		// double mutlakDeger= sayi>=0 ? sayi :sayi*(-1) ---) seklinde atama yapilip syso yaptirilarak da yapilabilir.
		
	}

}
