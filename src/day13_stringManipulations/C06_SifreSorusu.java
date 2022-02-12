package day13_stringManipulations;

import java.util.Scanner;

public class C06_SifreSorusu {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		//Kullanicidan ismini, soyismini ve kredi karti bilgisini isteyin ve asagidaki gibi yazdirin
		//isim-soyisim :M***** B*******
		//kart no :**** **** **** 1234		
		

		Scanner scan=new Scanner (System.in);
		
		System.out.println("Lutfen adizi giriniz");
		
		
		String isim=scan.next();
		
		System.out.println("Lutfen soyosminizi giriniz");
		
		String soyisim=scan.next();
		
		System.out.println("Lutfen 16 karakterli KK numaranizi 4 sayilik gruplar halinde yazin");
		
		String kkNo=scan.next();
		
		
		String isimFormatli=isim.substring(0, 1).toUpperCase() + isim.substring(1).replaceAll("\\w", "*") ;
		String soyisimFormatli=soyisim.substring(0,1).toUpperCase() + soyisim.substring(1).replaceAll("\\w", "*");
		
		
		String kkNoFormatli= "**** **** **** " + kkNo.substring(12);
		
		System.out.println("isim-soyisim : " + isimFormatli + " " + soyisimFormatli);
		
		System.out.println("kart no : " + kkNoFormatli);
		
		
		
		
	}

}
