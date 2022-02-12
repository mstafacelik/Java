package day31_dateAndTime;

import java.time.LocalTime;
import java.time.ZoneId;

public class C02_LocalTime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LocalTime saat=LocalTime.now();
		System.out.println("Baslangic Saati : " + saat);       // Baslangic Saati : 21:08:02.233980200
		
		
		int sayi=10;
		for (int i = 0; i < 10000; i++) {
			
			sayi++;
		}
		
		LocalTime saatBitis=LocalTime.now();
		System.out.println("Bitis Saati " + saatBitis);  // Bitis Saati
		
		// Eger bir islemin baslangic ve bitis zamanini kaydetmek istiyorsak
		// Hem basinda, hem de sonunda LocalTime objesi olusturmaliyiz
		
		
		double nano1=saat.getNano();
		double nanobitis=saatBitis.getNano();
		System.out.println("For Loop " + (nanobitis-nano1) + " nano saniyede tamamlandi");
		
		System.out.println(saat.getMinute());   // 31
		System.out.println(saat.plusMinutes(10000)); // 20:11:50.431820500
		
		System.out.println(saat.minusHours(20)); //   01:31:50.431820500
		
		LocalTime yerelSaat=LocalTime.now(ZoneId.of("Turkey"));
		System.out.println(yerelSaat);
		
	}

}
