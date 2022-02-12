package day23_multidimensionalArrays;

import java.lang.reflect.Array;
import java.util.Arrays;

public class C02_MDArrays {

	public static void main(String[] args) {
		// MultiDimensional array ler ic ice konulmus array ler demektir.
		// Array olusturrmak icin iki yontem vardi.
		// 1. yontem once declare edip sonra deger atama

		int arr[][] = new int[3][2]; // outer array i 3 elemanli
										// her bir inner array ise 2 elemanli olan MDArray olusturur

		// bu yontemle olusturdugumuzda inner array lerin hepsi ayni boyutta/sayida olmalidir

		System.out.println(Arrays.toString(arr)); // [I@2c7b84de, [I@3fee733d, [I@5acf9800]

		// direk outer array i yazdirmak istedigimizde icindeki elemanlar
		// non-primitiv(array) oldugundan referanslari yazdirir-

	System.out.println(Arrays.toString(arr[1]));  // [0, 0]
	System.out.println(Arrays.toString(arr[2]));  // [0, 0]
	
	
	System.out.println(Arrays.deepToString(arr)); // [[0, 0], [0, 0], [0, 0]]
	
	
	
	arr[0][1]=5;
	arr[1][0]=2;
	arr[2][1]=3;
	
	System.out.println(Arrays.deepToString(arr));  // [[0, 5], [2, 0], [0, 3]]
		
	// Array olusturrmak icin iki yontem vardi.
	// 2. yontem hem declare edip hem deger atama
	
	int arr2[][]= {  {0}, {1,2,3}, {6,7,8,9}  }	;
	System.out.println(Arrays.deepToString(arr2)); // [[0], [1, 2, 3], [6, 7, 8, 9]]
	
	System.out.println(Arrays.toString(arr2[1]));  // [1, 2, 3]
	
	System.out.println(arr2[2][1]); // 7 ---->>array in icindeki bir degeri yazdirmak istedigimiz icin Arrays.to yu kullanmadik.
									
	
	}

}
