package day17_forLoop;

import java.util.Scanner;

public class C03_Palindrome {

	public static void main(String[] args) {
		
		// Soru 9 ) Interview Question
	    // Kullanicidan bir String isteyin. Kullanicinin girdigi String’in palindrome olup olmadigini kontrol eden bir program yazin.
	
		
		
		Scanner scan=new Scanner(System.in);
		
		System.out.println("Lutfen tersine cevirmek icin bir metin giriniz");
		
		String str=scan.nextLine();
		
		
		if (str.equals(tersineCevir(str))) {
			System.out.println("Girdiginiz String palindrome ");
		} else {
			System.out.println("Girdiginiz String palindrome degil ");
		}
		
		
	}

		private static String tersineCevir(String str) {
		
		String tersStr="";  	// numerik bir deger atayamayiz, cunku ifade String. Hiclik veya null atanabilir.
		
		for (int i = str.length()-1; i >=0 ; i--) {
			
			tersStr+=str.substring(i, i+1); 
		}
		
		return tersStr;
		
	
		
		}


		
		
	}

