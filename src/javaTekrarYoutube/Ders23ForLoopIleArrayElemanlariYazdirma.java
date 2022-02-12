package javaTekrarYoutube;

import java.util.Iterator;

public class Ders23ForLoopIleArrayElemanlariYazdirma {

	public static void main(String[] args) {
		// bia arrray icindeki verileri for loop ile yazdiralim

		String[] isimler = { "ALi", "Veli", "Ahmet", "Mehmet Cagri" };
		
		for (int i = 0; i < isimler.length; i++) {

			System.out.print(isimler[i]);
			System.out.print(" ");

		}
		System.out.println(" ");
		
		int[] sayilar= {1,2,4,6,89,678};
		
		
		for (int i = 0; i < sayilar.length; i++) {
			
			
			System.out.print(sayilar[i]);
			System.out.print(" ");
		}
		
		
	}

}
