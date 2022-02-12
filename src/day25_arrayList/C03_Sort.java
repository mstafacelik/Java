package day25_arrayList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class C03_Sort {

	public static void main(String[] args) {
		
		List<String> isimler = new ArrayList<>();
		
		isimler.add("Esros");
		isimler.add("Mustingo");
		isimler.add("Kedicik");
		
		System.out.println(isimler); //[Esros, Mustingo, Kedicik]
		
		Collections.sort(isimler);
		
		System.out.println(isimler); //[Esros, Kedicik, Mustingo]
		
		isimler.add("ali");
		
		System.out.println(isimler); // [Esros, Kedicik, Mustingo, ali]
		
		Collections.sort(isimler);

		System.out.println(isimler);// [Esros, Kedicik, Mustingo, ali]--->> a kucuk harf oldugu icin siralamada en sonda
	}

}
