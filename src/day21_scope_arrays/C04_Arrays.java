package day21_scope_arrays;

import java.util.Arrays;

public class C04_Arrays {

	public static void main(String[] args) {
		
		// Array in elemanlarini yazdirmak istersek loop ile yazdirabiliriz
		// ya da arrays class indan yardim alarak direkt array olarak yazdirabiliriz

		int arr[] = { 2, 4, 5, 6, 78, 89 };

		// tum elementleri yazdirabilir

		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");   // 2 4 5 6 78 89 ---> bu array degil, array in elementleridir
			
			
		}
		System.out.println(" ");
		System.out.println(Arrays.toString(arr));
		
		
	}

}
