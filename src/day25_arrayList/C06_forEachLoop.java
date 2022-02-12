package day25_arrayList;

import java.util.ArrayList;
import java.util.List;

public class C06_forEachLoop {

	public static void main(String[] args) {
		// bazen index ile hic ugrasmadan bir array veya list teki tum elemanlari
		// gozden gecirmek isteriz

		int arr[] = { 1, 2, 3, 5, 3, 2, 7 };

		// bu array i esenek list yapmak istiyorum

		List<Integer> yeniList = new ArrayList<>();

		/*
		 * for (int i = 0; i < arr.length; i++) {
		 * 
		 * yeniList.add(arr[i]);
		 * 
		 * } System.out.println(yeniList); // bu index lerle olusturdugumuz esnek list
		 * [1, 2, 3, 5, 3, 2, 7]
		 * 
		 * eger index lerle ugrasmak istemiyorsak foreach ile yapariz
		 * 
		 */

		// bu yontem eger tum array veya list le bir islem yapacaksak cok kullanisli
		// yani eger bir list veya array in tum elemanlarini elen gecirmekk istiyorsak
		// ve siralama onemli degilse
		// for-each loop kullanmak cok mantikli

		for (int each : arr) { // arr deki herbir(each) int i bana getir

			yeniList.add(each);

		}

		System.out.println(yeniList);

	}

}
