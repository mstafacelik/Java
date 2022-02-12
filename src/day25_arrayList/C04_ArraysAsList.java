package day25_arrayList;

import java.util.Arrays;
import java.util.List;

public class C04_ArraysAsList {

	public static void main(String[] args) {
		// verilen array i Arrays class indan yardim alarak liste cevirebiliriz
		
		String arr[]= {"A", "b", "C", "d"};
		
		List<String> arraydenList=Arrays.asList(arr); 
		
		System.out.println("List : " +arraydenList); //[A, b, C, d]
		
		// arraydenList.add("f"); // CTE hatasi vermez, RTE hatasi verir-->>UnsupportedOperationException
		
		// CTE hatasi olmasi icin syntax te bir problem olmasi lazim, ancak bu yazimda syntax hatasi yok
		// bu sekilde Arrays class indan yardim alarak array i list e cevirirsek
		// olusturdgumuz list in boyutu sabit olur.
		// dolayisiyla add(), clear(), remaove() gibi methodlari calistirmak istersek
		// UnsupportedOperationException : desteklenmeyen islem hatasi verir
		
		//NOT: Eger array’deki bir elemani degistirirseniz list’teki eleman da otomatik olarak
		//     degisir. Listteki bir elemani degistirirseniz array de otomatik olarak degisir.
		
		
		arr[1]="Z";
		System.out.println("Array i degistirdikten sonra, array = " + Arrays.toString(arr)); //[A, Z, C, d]
		System.out.println("Array i degistirdikten sonra list = " + arraydenList); 			 //[A, Z, C, d]	
		
		
		arraydenList.set(3, "D");
		System.out.println("Array i degistirdikten sonra list = " + arraydenList);			 // [A, Z, C, D]
		System.out.println("Array i degistirdikten sonra, array = " + Arrays.toString(arr)); // [A, Z, C, D]
		
		
		
		
		
		
		
		
		
	}

}
