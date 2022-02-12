package day05_Matematikselislemler;

import java.util.Scanner;

public class C04_Modulus {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
         //kullanicidan 4 basamakli bir sayi alip 
		//rakamlar toplamini yazdirin
		
		
		
		
		
        Scanner scan=new Scanner(System.in) ;
		
		
		System.out.println(" lütfen 4 basamakli bir sayi giriniz");
		
		int sayi= scan.nextInt() ;
		
	
		
		
		int rakamlarToplami=0 ; 
		
		int rakam=sayi%10; 
		
		rakamlarToplami+=rakam;
		
		
		
		
		sayi/=10 ; 
				
			
		rakam=sayi%10 ;
		
		rakamlarToplami+=rakam;
		
		sayi/=10 ;
		
        rakam=sayi%10 ;
		
		rakamlarToplami+=rakam;
		
		sayi/=10 ;
		
		
		
		
		System.out.println(sayi);
		
		
		rakamlarToplami+=sayi;		
		
		System.out.println("Girdiginiz sayinin rakamlar toplami : " + rakamlarToplami);
		
		
		
		
		
	}

}
