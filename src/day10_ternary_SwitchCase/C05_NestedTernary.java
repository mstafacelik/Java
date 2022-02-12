package day10_ternary_SwitchCase;

import java.util.Scanner;

public class C05_NestedTernary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Eger calisan kadinsa 60 yasindan buyuk oldugunda emekli
		//olabilir, calisan erkekse 65 yasindan buyukse emekli olabilir
				
		
		// her seferinde Scanner olusturmak yerine test datalarimizi variable olarak da olusturabiliriz.
		// buna test datasi denir. Ve kod yazimi bittiginde bu test datalarini degistirerek kodlarimizi
		// test edebiliriz
		
		char cinsiyet='K';
		int yas=66;		
		
		String sonuc  =cinsiyet=='K' ? (yas>=60 ? "Emekli olabilirsin" : "Emekli olamazsin")  :  
			                           (yas>=65 ? "Emekli olabilirsin" : "Emekli olamazsin") ;
		
		System.out.println(sonuc);
		
		
	}

}
