package day46_collections;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class C01_HashSet {

	public static void main(String[] args) {
		// verilen bir array deki tekrar edilen sayilari silip unique degerlerden olusan
		// bir array olusturun

		int arr[] = { 3, 4, 5, 6, 2, 4, 6, 7, 8, 5, 3, 2, 7, 5, };

		Set<Integer> benzersizSet = new HashSet<>();

		for (Integer each : arr) {

			benzersizSet.add(each);

		}
		System.out.println(benzersizSet); // [2, 3, 4, 5, 6, 7, 8]----> bu Arrray degil, Set tir. Gorunume aldanma!

		Object[] tekrarsizArr = benzersizSet.toArray();// Set i Array a cevirdik

		System.out.println(Arrays.toString(tekrarsizArr)); // [2, 3, 4, 5, 6, 7, 8]

	}

}
