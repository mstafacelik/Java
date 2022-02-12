package javaTekrarYoutube;

import java.util.Arrays;
import java.util.Iterator;

public class Ders21_MultiArray {

	public static void main(String[] args) {
		// iki farkli siniftaki ogrenci isimlerini icerisinde tutan 2 boyutlu bir array olusturunuz
		// Not: Her sinifta 5 ogrenci var
		// Not: Ayni pratigi 3 sinif ve her sinifta 4 ogrenci olacak sekilde tekrar yapiniz
		
		
		

		String[][] ogrenciler = new String [2][5];
		
		ogrenciler[0][0]="Ali";
		ogrenciler[0][1]="Veli";
		ogrenciler[0][2]="deli";
		ogrenciler[0][3]="beni";
		ogrenciler[0][4]="seni";
		
		
		
		ogrenciler[1][0]="at";
		ogrenciler[1][1]="tat";
		ogrenciler[1][2]="bak";
		ogrenciler[1][3]="sak";
		ogrenciler[1][4]="aha";
		
		// System.out.println(Arrays.toString(ogrenciler)); -->> Bu ogrencileri YAZDIRMAZ. Referanslari yazdirir.
		// Array i yazdrimak icin(Elemanlarini degil!);
		
		System.out.println(Arrays.toString(ogrenciler[0])); // [Ali, Veli, deli, beni, seni]
		System.out.println(Arrays.toString(ogrenciler[1])); // [at, tat, bak, sak, aha]
		
		System.out.println((ogrenciler[0][0]));// Ali
		

		
		
		String[][] ogrenciler2 = new String [3][4];
		
		ogrenciler2[0][0]="";
		ogrenciler2[0][1]="";
		ogrenciler2[0][2]="";
		ogrenciler2[0][3]="";
		
		ogrenciler2[1][0]="";
		ogrenciler2[1][1]="";
		ogrenciler2[1][2]="";
		ogrenciler2[1][3]="";
		
		ogrenciler2[2][0]="";
		ogrenciler2[2][1]="";
		ogrenciler2[2][2]="";
		ogrenciler2[2][3]="";
		
		
		
		
		
		
		
		
		
		
		
		
		

	}
		
		

	}


