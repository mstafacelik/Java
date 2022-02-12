package day45_Collections;

import java.util.LinkedList;

public class C01_LinkedList {

	public static void main(String[] args) {

		LinkedList<Integer> ll = new LinkedList<>();

		System.out.println(ll); // []

		ll.add(5);
		ll.add(7);

		System.out.println(ll); // [5, 7]

		// Linkedlist in iki tane interface parent i vardir.
		// birisi list, oteki de Deque--->>Queue

		ll.add(0, 10); //----->> List interface den ozellikle basa eleman ekleme
		
		System.out.println(ll); // N [10, 5, 7]
		
		ll.addFirst(3);  // ---->> Queue interfacede n gele ozellikle basa eleman ekleme
		System.out.println(ll);  // [3, 10, 5, 7]

	}

}
