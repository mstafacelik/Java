package day03;

import java.util.Scanner;

public class C02_Scanner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Scanner scan= new Scanner(System.in) ; 
		
		System.out.println(" lütfen isminizi yaziniz ");
		
		char ilkHarf=scan.next().charAt(1) ; 
		
		System.out.println(" isminizin ilk harfi: " + ilkHarf) ; 
	}

}
