package day31_dateAndTime;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class C05_DateTimeFormatter {

	public static void main(String[] args) {
		
		LocalDateTime tarihSaat=LocalDateTime.now();
		System.out.println(tarihSaat);   // 2021-12-02T21:44:49.767437200
		
		// Eger tarih veya saati kendi istedigimiz bicimde yazdirmak istersek
		// tarih--->>gun / ay / yil; zaman--->> saat:dakika seklinde
		
		DateTimeFormatter duzenle = DateTimeFormatter.ofPattern("dd / MMMM / YYYYY EEE  HH:mm");
		
		System.out.println(duzenle.format(tarihSaat));  // 02 / Dezember / 02021 Do.  21:55
		
		// format olustururken
		// GÜN ICIN---> 
		// d          : basta 0 varsa onu yazmadan gun numarasini yazar
		// dd         : tek haneli gunleri 01 gibi basina sifir yazarak gun numarasi
		// DDD        : yilin kacinci gunu
		// E, EE, EEE : gun isminin ilk uc harfi
		// EEEE       : gun isminin tamami
		
		// AY ICIN---> ( AY icin M, dakika icin m kulanilir)
		// M       : basta 0 varsa onu yazmadan ay numrasi
		// MM      :dd: tek haneli aylari 01 gibi basina sifir yazarak ay numarasi
		// MMM     : Ay isminin ilk 3 harfi
		// MMMM    : ay isminin tamami
		
		
		// YIL ICIN--->
		// YY      : yilin son iki rakamini
		// YYYY    : yilin tamamini
		
		
		
		// Saat     : ( 24 saat uzerinden istiyorsak H, 12 saat uzerinden istiyorsak h)
		// HH       : saatin tamami, tek rakamli saat olursa, 02 gibi
		// H        : tek rakamli saat olursa sadece saati
		// a yazarsak AM veya PM degerini yazar

	}

}
