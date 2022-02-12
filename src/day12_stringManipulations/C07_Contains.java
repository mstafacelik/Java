package day12_stringManipulations;

import java.util.Scanner;

public class C07_Contains {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		// Kullanicidan email adresini girmesini isteyin, mail
		// @gmail.com icermiyorsa “lutfen gmail adresinizi giriniz”, 
		// @gmail.com ile bitiyorsa “EMail adresiniz kaydedildi"
		// @gmail.com ile bitmiyorsa "Lutfen yazimi kontrol ediniz" yazdirin
		
		
		Scanner scan=new Scanner (System.in);
		
		System.out.println("Lutfen e posta adresinizi giriniz");
		
		String email=scan.next();
		
		
		int uzunluk=email.length();
		int index=email.lastIndexOf("@gmail.com");
		
		
		
		if (!email.contains("@gmail.com")) {
			System.out.println("Lutfen gmail adresinizi giriniz");
			
		} else if(index==uzunluk-10) {
			
			System.out.println("EMail adresiniz kaydedildi");
			
			
		}else {
			System.out.println("Lutfen yazimi kontrol ediniz\" yazdirin");
		}
			
		
		
	}
}
