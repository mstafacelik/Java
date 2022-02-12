package day29_staticBlock_passByValue;

import java.util.ArrayList;

public class C04_PassByValueList {

	public static void main(String[] args) {
		// bir list olusturalim
		// sonra list elemanlarini degistir methodu yazip orada 
		// list elemanlarindan bazilarini degistirelim
		// method void olsun
		// main methoda dondukten sonra yeniden list i yazdiralim.
		
		
		ArrayList<String> harfler= new ArrayList<>();
		harfler.add("A");
		harfler.add("B");
		harfler.add("C");
		
		
		
		listElemanlarDegistir(harfler);  //[D, B, C]
		System.out.println("Main methoda donunce list : " + harfler); //[D, B, C]
		
		// java da list ve Array gibi objeler icin de pass bay value gecerlidir
		// yani farkli bir methodda array veya list e yeni deger atamasi yaparsaniz
		// orjinal array veya list degismez
			
		
		listDegistir(harfler); // methodda yeni deger atadigim halde harfler listesi degismedi
		System.out.println("liste yeni list atadiktan sonra main method a donunce list : " + harfler);
		
		
	}

	private static void listDegistir(ArrayList<String> harfler) {
		harfler= new ArrayList<>();
		System.out.println("List e yeni deger atayinca : "  + harfler);  
		
	}

	private static void listElemanlarDegistir(ArrayList<String> harfler) {
		
		harfler.set(0, "D");
		
		System.out.println("Methodda degistirdimiz list : " + harfler);  
		
		
	}

}
