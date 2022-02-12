package day03;

import java.util.Scanner;

public class C01_Scanner {

	public static void main(String[] args) {
		
		
		Scanner scan= new Scanner(System.in) ; 
		
		
		System.out.println(" lütfen cemberin yaricapini giriniz : ");

		
		double yaricap=scan.nextDouble() ;
		
		double cevre= 2*3.14+yaricap;
		
		double alan=3.14*yaricap*yaricap ;
				
	//cemberin cevresi : 25.7

	//dairenin alani 26.31	
				
				
				
			System.out.println(" cembrerin cevresi : "+ cevre);
		System.out.println(" dairenin alani " + alan);
				
				
				
		
	}

}
