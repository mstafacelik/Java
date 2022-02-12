package day46_collections;

import java.util.Deque;
import java.util.LinkedList;

public class C04_Deque {

	public static void main(String[] args) {

		// Deque'da hem deque dan hem de Queue den gelen ozellikler kullanilabilir.

		Deque<String> ciftBasli = new LinkedList<>();
		ciftBasli.add("Ali");
		ciftBasli.add("Veli");
		System.out.println(ciftBasli);       // [Ali, Veli] ---> add() Queue den geldiginden sona ekler

		ciftBasli.addLast("Deli");
		System.out.println(ciftBasli);       // [Ali, Veli, Deli] ---> Deque 'den gelen ozellik

		System.out.println(ciftBasli.pop()); // ilkini siler ve onu delil olarak getirir.
		System.out.println(ciftBasli);       // [Veli, Deli]
		
		ciftBasli.push("Tayyar");
		System.out.println(ciftBasli);       // [Tayyar, Veli, Deli]

	}

}
