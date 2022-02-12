package day21_scope_arrays;

import java.util.Arrays;

public class C05_Arrays {

	public static void main(String[] args) {
		// Verilen 3 elemanli bir array’in tum elemanlarini bir soldaki konuma tasiyacak
		// bir
		// program yazin. Ornek; array [1,2, 3] ise output [2, 3, 1] olacak.

		int arr[] = { 1, 2, 3, 4, 5 };
		int kova = arr[0]; // int in degeri arr[0] in degeridir. arr [0] demek arr (0] in ilk index i demek yani 1 dir.

		for (int i = 0; i < arr.length - 1; i++) {

			arr[i] = arr[i + 1];

		}

		arr[arr.length - 1] = kova; // son elementin index ini 1 e esitledik. yani arr[0] in index i olan 1 e.

		System.out.println(Arrays.toString(arr));

	}

}
