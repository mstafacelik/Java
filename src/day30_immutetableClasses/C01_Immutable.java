package day30_immutetableClasses;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class C01_Immutable {

	public static void main(String[] args) {
		// String immutable bir class iken List mutable dir
		
		String str="Esra";
		
		str.toUpperCase(); // str == ESRA
		
		System.out.println(str); // str.toUpperCase() yapmamiza ragmen  Esra yazdirir. 
								 // Atama yapmis gibi olmaz cunku String ler immutabledir.(degistirilemez)
		
		System.out.println(str.toUpperCase()); // ESRA
		
		System.out.println(str); // Esra
		
		
		List<String> isimler=new ArrayList<>(); // List mutable dir
		
		System.out.println(isimler); // []
		
		isimler.add("Mustafa"); // atama olmasa da asagida yazdirinca [Mustafa] yazdirir. 
								// Atama olmus gibidir, cunku List ler mutabledir(degistirilebilir)
		
		System.out.println(isimler); // [Mustafa]
		
		isimler.set(0, "Veli");
		
		System.out.println(isimler); // [Veli]
		
		isimler.remove(0);
		System.out.println(isimler);// []
		
		
		
		

	}

}
