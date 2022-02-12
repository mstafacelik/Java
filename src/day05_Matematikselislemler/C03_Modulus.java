package day05_Matematikselislemler;

import java.util.Scanner;

public class C03_Modulus {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//kullanicidan 3 basamakli bir sayi alip 
		//rakamlar toplamini yazdiran bir program yaziniz
		
		
		
		Scanner scan=new Scanner(System.in) ;
		
		
		System.out.println(" lütfen 3 basamakli bir sayi giriniz");
		
		int sayi= scan.nextInt() ;
		
		//sayi 573 olsun
		
		
		int rakamlarToplami=0 ; 
		
		
		int rakam=sayi%10; //bana birler basamagini verir rakam=3
		
		rakamlarToplami+=rakam; //rakamlar toplami 3 oldu
		
		//sayimiz hala 573
		
		
		// 3 ten kurtulmak istiyorum
		// cunku 3 ile isim bitti
		
		
	    // sayiyi 57 haline getir
		
		
		
		sayi/=10 ; 
				
		//sayim artik 57
		// 7 yi nasil alirim ?
			
		rakam=sayi%10 ;
		
		rakamlarToplami+=rakam;
		
		//sayi hala 57
		
		// 7 den de kurtulalim
		
		
		sayi/=10 ;
		
		//sayi artik 5
		
		System.out.println(sayi);
		
		
		
		rakamlarToplami+=sayi;		
		
		System.out.println("Girdiginiz sayinin rakamlar toplami : " + rakamlarToplami);
		
		
		
		
		
		
		
		
		
		
	}

}
