package day36_inheritance;

import day35_encapsulation_inheritance.Isci;

public class Ustabasi extends Isci{
	
	Ustabasi(){
		
		System.out.println("ustabasi parametresiz constructor calisti");
		
	}

	public static void main(String[] args) {
		
		Ustabasi ust1=new Ustabasi();
		
		// Java da her class olusturuldugunda otomatik olarak default constructor olustugu GIBI
		// Child Class 'ta olusturulan her bir constructor in ilk satirinda 
		// gizli super () olusturur

	}

}
