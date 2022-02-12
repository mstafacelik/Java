package day22_arrays;

import java.util.Arrays;

public class C01_BinarySearch {

	public static void main(String[] args) {
		
		
		String isimler[]= {"Hacer", "ainagul", "Emine", "Murat", "Kutlu"};
		
		// isimler array inde murat ismi var mi?
		// arrayda arama yapmadan once siralama yapmaliyiz
		
		
		Arrays.sort(isimler);
		
		// arrays class i ile sort yaptigiizda array imiz kalici olarak degisir
		// yani array de yaptigimiz degisiklikler. Atama yapmasak bile kalicidir
		
		System.out.println(Arrays.toString(isimler));   // [Emine, Hacer, Kutlu, Murat, ainagul]
		
		// Siralama isimlerin ilk harflerine gore yapilmistir.
		// sort methodu elemetleri natural ordner a gore siralar. yani sayi olsa kucukten buyuge harf olsa a,b,c olarak
		
		isimler[4]="Ainagul";
		
		System.out.println(Arrays.toString(isimler)); // [Emine, Hacer, Kutlu, Murat, Ainagul]
		
		Arrays.sort(isimler);
		
		System.out.println(Arrays.toString(isimler));  // [Ainagul, Emine, Hacer, Kutlu, Murat]
		
		System.out.println(Arrays.binarySearch(isimler, "Murat")); //[Ainagul, Emine, Hacer, Kutlu, Murat], 4 Murat in INDEX i
		
		System.out.println(Arrays.binarySearch(isimler, "Mehmet")); //olsaydi -5. SIRADA olurdu. 
		
		System.out.println(Arrays.binarySearch(isimler, "Tugba")); // olsaydi -6. SIRADA olurdu.
		
		System.out.println(Arrays.binarySearch(isimler, "Kursat")); //olsaydi -4. SIRADA olurdu.
		

	}

}
