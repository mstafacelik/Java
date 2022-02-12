package javaTekrarYoutube;

import java.util.Scanner;

public class Ders17_Ternary_Pratic {

	public static void main(String[] args) {
		// kullanicidan alinan iki farkli sayidan buyuk olani ternary ile yazdiralim
		
		Scanner scan=new Scanner (System.in);
		
		System.out.println("Lutfen 2 sayi giriniz.\nIkinci sayiyi girmek icin enter a basin");
		
		double sayi1=scan.nextInt();
		double sayi2=scan.nextDouble();
		
		double buyukSayi=sayi1>sayi2 ? sayi1 : sayi2;
		
		System.out.println(buyukSayi);
		
		
		// if ile yaparsak su sekilde olur:
		
		if (sayi1>sayi2) {
			buyukSayi=sayi1;
		} else {
			buyukSayi=sayi2;
		}
		
		System.out.println("Buyuk sayi : " + buyukSayi);
		
		
		
		
		
		
	}

}
