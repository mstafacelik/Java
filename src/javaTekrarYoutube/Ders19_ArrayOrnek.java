package javaTekrarYoutube;

import java.util.Arrays;

public class Ders19_ArrayOrnek {

	public static void main(String[] args) {
		
		// bir array olusturunuz ve olusturdugunuz array 
		// icerisinde 5 farkli isim yer alsin. Ve bunu yazdirin
		
		
		
		// 1. yontem
		int [] sayilar= {1,2,3,4,5};   // data turu String olsaydi " " icine elemanlari yazardik!
		System.out.println(sayilar);   // [I@2c7b84de --->>> referansi yazdirir
		System.out.println(Arrays.toString(sayilar)); // [1, 2, 3, 4, 5]
		
		
		
		
		// 2 . yontem
		String[] isimler= new String[5];
		 
		isimler[0]="Ali";
		isimler[1]="Veli";
		isimler[2]="Deli";
		isimler[3]="Meli";
		isimler[4]="Seni";
		
		System.out.println(Arrays.toString(isimler));
		
		
		
		
	}

}
