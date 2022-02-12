package javaTekrarYoutube;

import java.util.Scanner;

public class Ders08 {

	public static void main(String[] args) {
		
		Scanner scan=new Scanner (System.in);
		
		String isim="Esra";
		String soyIsim="Celik";
		
		int adSoyad=isim.concat(soyIsim).length();   
		
		//isim.lastIndexOf(isim);
		
		String adSoyad1=isim+" " + soyIsim;
		System.out.println(adSoyad1);
		
		System.out.println(adSoyad1.replace("Esr", "Mustafa"));
		
		System.out.println("Ali" + "\nVeli");
		
		
		
		
		
	}

}
