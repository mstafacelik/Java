package day23_multidimensionalArrays;

import java.util.Arrays;

public class C05_Array {

	public static void main(String[] args) {
		// Kullanicidan bir cumle isteyin ve cumledeki kelime sayisini yazdirin
		
		String cumle="Her sey, Javayla kolay degil mi?";
		
		String kelimeler[]=cumle.split(" ");
		
		System.out.println(Arrays.toString(kelimeler)); // [Her, sey,, Javayla, kolay]

		
		System.out.println("Girilen cumlede " + kelimeler.length + " adet kelime var");
	}

}
