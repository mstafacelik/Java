package javaTekrarYoutube;

import java.util.Scanner;

public class Ders16_UcSayidanBuyukOlaniBulma {

	public static void main(String[] args) {
		// kullanicinin girdigi 3 sayidan buyuk olan yazdiralim
		
		Scanner scan=new Scanner (System.in);
		
		System.out.println("Lutfen 3 sayi giriniz.\n2. ve 3. sayiyi girmek icin enter a basiniz");
		
		double s1=scan.nextDouble();
		double s2=scan.nextDouble();
		double s3=scan.nextDouble();

		
		if (s1>=s2 && s1>=s3) {
			System.out.println("En buyuk sayi : " + s1);
		}else if(s2>=s1 && s2>=s3) {
			System.out.println("En buyuk sayi : " + s2);
		}else if(s3>=s1 && s3>=s2) {
			System.out.println("En buyuk sayi : " + s3);
		}
		
		
		
		
		
	}

}
