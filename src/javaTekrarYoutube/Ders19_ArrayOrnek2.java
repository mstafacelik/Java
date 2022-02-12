package javaTekrarYoutube;

import java.util.Arrays;

public class Ders19_ArrayOrnek2 {

	public static void main(String[] args) {
		// 5 tane integer ve String  saklayabilen array olusturunuz ve icerisine herhangi bir data
		// eklemeden console yazdiriniz

		int[] sayilar = new int[5];
		System.out.println(Arrays.toString(sayilar)); // [0, 0, 0, 0, 0]
		
		String[] isimler=new String[5]; 
		System.out.println(Arrays.toString(isimler));  // [null, null, null, null, null]

	}

}
