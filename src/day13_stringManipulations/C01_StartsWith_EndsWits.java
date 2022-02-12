package day13_stringManipulations;

import java.util.Scanner;

public class C01_StartsWith_EndsWits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Kullanicidan bir cumle ve bir kelime alin.
		// verilen cumlenin verilen kelime ile baslayip baslamadigini
		// ve bitip bitmedgini yazdirin.
		
		Scanner scan=new Scanner(System.in);
		
	System.out.println("lutfen bir cumle giriniz");
	
	String cumle=scan.nextLine();
	
	System.out.println("lutfen bir kelime giriniz");
	
	String kelime=scan.next();
	
	
	
	
	if (cumle.startsWith(kelime)) {
		
		System.out.println("Girilen cumle " + kelime +" ile basliyor");
		
	}else {
		System.out.println("Girilen cumle " + kelime +" ile baslamiyor");
			
	}
	
	
    if (cumle.endsWith(kelime)) {
		
		System.out.println("Girilen cumle " + kelime +" ile bitiyor");
		
	}else {
		System.out.println("Girilen cumle " + kelime +" ile bitmiyor");
			
	}
	
	
	// birinci durumla ikinci durum arasinda herhangi bir baglanti
    // olmadigi icin "if, else if" kullanmadik. ikisi icin de 
    // ayri ayri "if" kullandik.
	
	//endsWith ve startsWith boolean ifadelerdir. Output true ya da false veridigi icin.
	
	
	
	}

}
