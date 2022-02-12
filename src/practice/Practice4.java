package practice;

import java.util.Scanner;

public class Practice4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//kullanicidan 2 tam sayi alip bu 2 tam sayinin dort islem sonucunu yazdiriniz
		
		
		
		Scanner scan=new Scanner(System.in);
		
	  System.out.println("lutfen 1. sayiyi giriniz");
	  
	  int sayi1= scan.nextInt();
	  
		
	  System.out.println("lutfen 2. sayiyi giriniz");
	  
	  
	  int sayi2= scan.nextInt();
	  
	  System.out.println("girilen sayilarin toplami :"+(sayi1+sayi2)+"\n"+ "girilen sayilarin farki :"+(sayi1-sayi2)+"\n"+"girilen sayilarin carpimi :"+(sayi1*sayi2)+"\n"+"girilen sayilarin bolumu :"+(sayi1/sayi2));
		
		
		
		
	}

}
