package day31_dateAndTime;

import java.time.LocalTime;
import java.util.ArrayList;

public class C04_DateTime {

	public static void main(String[] args) {
		// bir String ve bir int variable olusturalim
		// bir loop icerisinde bu variabla lari 1000 kere degistirelim ve 
		// islem surelerini kiyaslayalim
		
		
		LocalTime saatS=LocalTime.now();
		System.out.println("Baslangic Saati : " + saatS);       // Baslangic Saati : 21:08:02.233980200
		
		
		String str="celik";
		for (int i = 0; i < 10000; i++) {
			
			str+=" ";
		}
		
		LocalTime saatBitisS=LocalTime.now();
		System.out.println("Bitis Saati " + saatBitisS);  
		
		double nanoS=saatS.getNano();
		
		double nanobitisS=saatBitisS.getNano();
		
		System.out.println("String Loop " + (nanobitisS-nanoS) + " nano saniyede tamamlandi");
		
		
		double stringSure=nanobitisS-nanoS;
		
		
		
		
		
		//verilen iki dogum tarihinin hangisinin daha once oldugunu bulunuz // buyuktur , kucuktur kiyaslamasi yapamayiz!
		
		
		

	}

}
