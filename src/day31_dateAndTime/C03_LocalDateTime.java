package day31_dateAndTime;

import java.time.LocalDateTime;

public class C03_LocalDateTime {

	public static void main(String[] args) {
		
		LocalDateTime tarihSaat=LocalDateTime.now();
		System.out.println(tarihSaat);   // 2021-12-02T21:39:45.603872400
		
		tarihSaat.toString().startsWith("2021"); // String manipilation yapmayi saglariz boylece
		System.out.println(tarihSaat.toString().startsWith("2021")); // true

	}

}
