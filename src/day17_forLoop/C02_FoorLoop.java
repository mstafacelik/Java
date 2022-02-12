package day17_forLoop;

import java.util.Scanner;
import java.util.concurrent.ForkJoinPool;

public class C02_FoorLoop {

	public static void main(String[] args) {
		// Soru 8 ) Interview Question
	    // Kullanicidan bir String isteyin ve Stringi tersine ceviren bir method yazin.

		Scanner scan=new Scanner(System.in);
		
		System.out.println("Lutfen tersine cevirmek icin bir metin giriniz");
		
		String str=scan.nextLine();
		
		
		System.out.println(tersineCevir(str));
		
		
		scan.close();
		
		
	}

	private static String tersineCevir(String str) {
		
		String tersStr="";  // Tersine cevirdigimiz kelimeyi saklamak icin bir variable e ihtiyacimiz var.
							// Eger bu olmazsa saklayamayiz!
		
		for (int i = str.length()-1; i >=0 ; i--) {
			
			tersStr+=str.substring(i, i+1); // burdaki islem sayesinde index leri degil harfleri topluyoruz!!!
		}
		
		return tersStr;
		
	}

}
