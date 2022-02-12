package day15_methodCreation;

import java.util.Scanner;

public class C01_MethodCreation {

	public static void main(String[] args) {
		
		// kullanicidan ismini ve soyismini isteyin
		// iki farkli method olusturun. methodlardan biri girilen kelimeleri ilk harf buyuk, digerleri kucuk olacak sekilde birlestirsin
		// ikinci method isim ve soyismin ilk harfleri buyuk harf kalan harfler * olacak sekilde birlestirsin
		
		// kullaniciya isim ve soyisminin acik olarak yazilmasi veya gizlenmesi tercihini sorun
		// ve programin kalan kisminda isim ve soyismi kullanicinin istedigi sekilde kullanin. 
		
		
		
		Scanner scan=new Scanner(System.in);
		
		System.out.println("Lutfen isminizi ve soyisminizi giriniz");
		
		String isim=scan.next();
		
		String soyisim=scan.next();
		
		System.out.println("Isminizin acik sekilde yazilmasini istiyorsaniz 1 "
				+ "\nilk harf haric gizli yazilmasini istiyorsaniz 2 ye basin");
		
		
		
		int girilenSayi=scan.nextInt();
		
		// bu satira kadar kullancidan ismini, soyismini ve tercihini(girdigi sayiyi) aldim.
		
		String birlesmisIsim=null;		// burda null atamak zorundayiz, degilse hata verir. 
										// Emrah Saglam, E**** S*****
			
		
		
		if (girilenSayi==1) {
			
		birlesmisIsim= acikIsim(isim, soyisim);
				
		} else if (girilenSayi==2){
			
		birlesmisIsim= isimgizle(isim, soyisim);	
			
		}else {
			System.out.println("Lutfen istenen tercihlerden birini yapin");
		}
		
		
		// Bu satirdan itibaren kullanicinin isim ve soyismi kullanicinin tercihine bagli olarak kaydedildi
		
		
		System.out.println("kullanicinin tercihi : " + birlesmisIsim);
	}

	public static String isimgizle(String isim, String soyisim) {
		
		isim=isim.substring(0, 1).toUpperCase() + isim.substring(1).replaceAll("\\w", "*");
		soyisim=soyisim.substring(0,1).toUpperCase()+ soyisim.substring(1).replaceAll("\\w", "*");
		
		
		return isim + " " + soyisim ; 
		
		
	}

	public static String  acikIsim(String isim, String soyisim) {  	//burdaki parametre isimleri(isim, soyisim) degistirilebilir.
		
		isim=isim.substring(0,1).toUpperCase() + isim.substring(1).toLowerCase();
		soyisim=soyisim.substring(0, 1).toLowerCase() + soyisim.substring(1).toLowerCase();
		
		
		
	return isim+ " "+soyisim;
		
		
		
	}

}
