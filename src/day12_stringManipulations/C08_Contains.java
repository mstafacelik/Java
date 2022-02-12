package day12_stringManipulations;

import java.util.Scanner;

public class C08_Contains {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Kullanicidan bir cumle isteyin.
		//Cumle “buyuk" kelimesi iceriyorsa tum	cumleyi buyuk harf olarak,
		//"kucuk" kelimesi iceriyorsa tum cumleyi kucuk harf olarak,
		//iki kelimeyi de icermiyorsa "Cumle kucuk ya da buyuk kelimesi icermiyor" yazdirin.
		// iki kelimeyi de iceriyorsa " kucuk mu buyuk karar ver"
		
		Scanner scan=new Scanner (System.in);
		
		System.out.println("Lutfen bir cumle giriniz");
		
		String cumle=scan.nextLine().toLowerCase(); // toLowerCase() i eklersek kullanici
													// KuCuK ya da BuYuk yazsa  case sensitive ortadan kalkar.
													// java buyuk ya da kucuk olarak algilar!!!
		
		
		if (cumle.contains("kucuk") && cumle.contains("buyuk")) {
			
			System.out.println("kucuk mu buyuk karar ver");
			
			//eger once bu kodla baslamazsak java yukaridan asagiya calistigi icin
			// yukarida ilk yakaladigi sarti output verir. Dolayisiyla eger yukaridaki kod
			// 3 . sart olsaydi buyuk ve kucuk birlikte ayni cumlede olsaydi
			// yukaridan asagi ilk buyuk u yakalaidigi icin buyuk yazdirir!!!
			
			
			
		} else if(cumle.contains("buyuk")) {

			System.out.println(cumle.toUpperCase()); }
			
		  else if (cumle.contains("kucuk") ) {
			
			System.out.println(cumle.toLowerCase());	
			
			
		}else {
			
			System.out.println("Cumle kucuk ya da buyuk kelimesi icermiyor");
			
		}
		
		
	}

}
