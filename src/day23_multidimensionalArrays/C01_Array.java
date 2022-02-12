package day23_multidimensionalArrays;

import java.util.Arrays;

public class C01_Array {

	public static void main(String[] args) {
		// verilen bir array den istenen degere sahip elementleri silip
		// kalani yeni bir array olarak kaydedin
		// ve sonra yeni array i yazdirin.

		int arr[] = { 3, 4, 5, 6, 3, 5, 8, 3, 4, 9 };

		int silinecekEleman = 5;

		// array de yeni eleman ekleyemeyiz veya var olan elemanlari silemeyiz
		// cunku array in deklare edilen uzunlugu DEGISMEZ.

		// bu soruda istenen elementi sildigimizde geriye kac element kaliyor bulmamiz
		// lazim.
		// silinecek sayi adedini bulalim.

		int sayac = 0;

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == silinecekEleman) { 
				sayac++;
			}
		}

		System.out.println(sayac);// 3

		int yeniArrayuzunluk = arr.length - sayac;

		// artik yeni array i olusturabiliriz

		int yeniArr[] = new int[yeniArrayuzunluk];

		// simdi eski array deki elemanlari birer birer alip
		// silinicek elemana esit olmayanlari yeni array e atamaliyiz

		int yeniArrayindex = 0;
		for (int i = 0; i < arr.length; i++) {

			if (arr[i] != silinecekEleman) {
				yeniArr[yeniArrayindex] = arr[i];
				yeniArrayindex++;
			}

		}

		System.out.println(Arrays.toString(yeniArr));

	}

}
