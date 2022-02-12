package day24_arrayList;

import java.util.ArrayList;
import java.util.List;

public class C02_Add {

	public static void main(String[] args) {

		List<String> isimler = new ArrayList<>();
		System.out.println("Bos liste : " + isimler);
		isimler.add("ALi");
		System.out.println("Bir eleman : " + isimler);
		isimler.add("Veli");
		System.out.println("Iki eleman : " + isimler);
		// add methodu listenin sonuna ekleme yapar.
		// birden fazla eleman ard arda eklenemez. hepsini tek tek ayri ayri yazmak gerekiyor

		isimler.add("Can");
		System.out.println("uc eleman : " + isimler);

		isimler.add(1, "Ayse");
		System.out.println("1. index e Ayse ekledik : " + isimler);

		// isimler.add(5);-->>declare ederken belirttigimiz data turu disinda
		// bir data turunden ekleme yapamayiz

		List<String> liste2 = new ArrayList<>();
		liste2.add("Gunter");
		liste2.add("Emrah");
		System.out.println("Liste 2 : " + liste2);

		isimler.addAll(4, liste2);
		System.out.println("isimlerin sonuna liste 2 yi ekledik : " + isimler);
		isimler.addAll(liste2);
		System.out.println("index olmadan liste 2 yi tekrar isimler in sonuna ekledik : " + isimler);
		
		

	}

}
