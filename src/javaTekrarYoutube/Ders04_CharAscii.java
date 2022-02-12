package javaTekrarYoutube;

public class Ders04_CharAscii {

	public static void main(String[] args) {
		/*
		 * Asagida char tipinde karakterlerin ASCII tablosundaki DEGERLERINI gosteren bir kod yazalim 
		 * 
		 * A, a, R, , 9
		 * 
		 */

		char harf='A';
		char harf1='a';
		char harf2='R';
		char harf3=' ';
		char harf4='9';
		
		
		System.out.println(harf);   // A
		System.out.println(harf1);  // a 
		System.out.println(harf2);  // R
		System.out.println(harf3);  // 
		System.out.println(harf4);  // 9
		
		
		int krk0='A';
		int krk1='a';
		int krk2='R';
		int krk3=' ';
		int krk4='9';
		
		System.out.println(krk0);    // 65
		System.out.println(krk1);    // 97
		System.out.println(krk2);	 // 82
		System.out.println(krk3);	 // 32
		System.out.println(krk4);	 // 57
		
		// alfabedeki harflerin, ozel karakterlerin int olarak  ASCII tablusuna gore sayisal degerleri vardir
		
		// 0-9 arasi char rakamlarin da ASCII karsiligi var!!! 
		
		
		char aHarfi='a';
		char bHarfi= 98; // 98 degil  b yazdirir
		
		System.out.println(bHarfi);
		
		char cHarfi1= (char) (bHarfi+1);
		int  cHarfi2= bHarfi+1;
		
		System.out.println(cHarfi1);  // c
		System.out.println(cHarfi2);  // 99
		
		
		
	}

}
