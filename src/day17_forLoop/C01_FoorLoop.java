package day17_forLoop;

import java.util.Scanner;

public class C01_FoorLoop {

	public static void main(String[] args) {
		//Soru 7 ) Interview Question
		// Kullanicidan bir String isteyin ve Stringi tersten yazdirin.
		
		
		Scanner scan=new Scanner(System.in);
		
		System.out.println("Lutfen tersten yazdirmak icin bir yazi giriniz");
		
		String str=scan.nextLine();
		
		//fatih
		
		
		for (int i = str.length()-1; i >=0; i--) {    //girilen string ifadenin son index in length() -1 ile buluruz
			
			System.out.print(str.substring(i, i+1));
			
			// System.out.println(str.charAt(i)); ----->>> bu sekilde de formule edilebilir
			
			
		}
		
		
		
		
	}

}
