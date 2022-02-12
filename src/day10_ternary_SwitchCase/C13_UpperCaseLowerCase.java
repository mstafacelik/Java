package day10_ternary_SwitchCase;

import java.util.Locale;

public class C13_UpperCaseLowerCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//verilen String in tamamini buyuk veya kucuk harfe cevirir
		
		String isim="aLI" ; // bunu Ali olarak yazdiralim.
		
		System.out.println(""+isim.toUpperCase().charAt(0)+ //kodun basina hiclik yani " " eklemezsek ascii tabelasina
															//gore toplama islemi yapar!!! icerdekiler char oldugu icin!!!
				isim.toLowerCase().charAt(1)+
				isim.toLowerCase().charAt(2)
				);
		
		//turkce lokal harfler kullanarak tamamini kucuk harfe cevirelim
		
		System.out.println(isim.toLowerCase(Locale.forLanguageTag("tr")));
	}

}
