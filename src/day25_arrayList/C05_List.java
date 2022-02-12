package day25_arrayList;

import java.util.ArrayList;
import java.util.List;

public class C05_List {

	public static void main(String[] args) {
		// verilen bir listede, icinde belirli bir harf olan elemanlari
		// silen bir method yaziniz

		List<String> str = new ArrayList<>();

		str.add("Jeyhun");
		str.add("Yildiz");
		str.add("Mustafa");
		str.add("Tugba");
		str.add("Turgat");

		System.out.println(str);

		String silinecekHarf = "a";

		str=killTheAll(str, silinecekHarf);

	}

	private static List<String> killTheAll(List<String> str, String silinecekHarf) {

		for (int i = 0; i < str.size(); i++) {

			if (str.get(i).contains(silinecekHarf)) {

				str.remove(i);
				i--; // eger loop calisir ve a olan elementi silerse index kaymasini engellemek icin 1 azaltma yapmaliyiz.
					 // aksi halde ornegimizde 3. sirada mustafa silinince tugba 3. siraya kayacak ve loop o index i
					 // tekrar kontrol etmeyecek, direkt 4 uncu index ten calismaya devam eder

			}

		}

		System.out.println(str);

		return str;

	}

}
