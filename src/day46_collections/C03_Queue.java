package day46_collections;

import java.util.LinkedList;
import java.util.Queue;

public class C03_Queue {

	public static void main(String[] args) {
		
		// gelen sona gelir, silinen bastan silinir
		// FIFO-->> first in first out
		
		// Queue'de index yapisi yok tipki Set teki gibi ama Set ten farkli olarak unique ozelligi yok yani
		
		// istedigin kadar null ve ayni eleman eklenebilir

		Queue<String> kuyruk = new LinkedList<>();

		kuyruk.add("Ali");
		kuyruk.add("Veli");
		kuyruk.add("Deli");
		System.out.println(kuyruk); // [Ali, Veli, Deli]

		kuyruk.remove();
		System.out.println(kuyruk); // [Veli, Deli]---> ilk element cikti, kuyruk yapisi(Queue) oldugu icin.

		kuyruk.remove();
		System.out.println(kuyruk); // [Deli]
		
		
		
		
		
		

	}

}
