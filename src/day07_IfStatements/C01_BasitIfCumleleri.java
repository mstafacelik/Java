package day07_IfStatements;

import java.util.Scanner;

public class C01_BasitIfCumleleri {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/* Kullanicidan gun isimlerinden birinin ilk harfini isteyin ve o harfle baslayan gun
		isimlerini yazdirin
		Ornek:
		ilkHarf=P output = �Pazar, Pazartesi veya Persembe�
		ilkHarf=S output = �Sali�
		*** Buyuk kucuk harf problem olmamasi icin toUpperCase methodunu kullanin
		*/
		
		
		Scanner scan=new Scanner (System.in) ;
		
		System.out.println("l�tfen g�n isimlerinden birisinin ilk harfini giriniz");
		
		// kullanicinin girdigi verinin tamamini kucuk harf veya buyuk harf yapabiliriz
		//scan.next() ten sonra toUpperCase yazarsak kelimenin tamamini buyuk harfe,
		//toLowerCase yazarsak kelimenin tamamini kucuk harfe cevirmis oluruz
		
		char ilkHarf=scan.next().toUpperCase().charAt(0);
		
		
		
		if (ilkHarf=='P') {
			
		System.out.println("Pazar, Pazartesi veya Persembe");
		}
		
		if (ilkHarf=='S') {
		System.out.println("Sali");
			 }
		if (ilkHarf=='C') {
			
			System.out.println("Carsamba, Cuma veya Cumartesi");
		
		}
		
		//Output almak icin girilen harfin buyuk harf olmasi gerekir. aksi haldi output vermez.
		//bunun icin farkli cozum vardir. Asagidaki gibi
		// if (ilkHarf=='C'||ilkHarf 'c')
		
		
		//Kullanici farkli sekillerde carsamba yazabilir.
		
		
		if (ilkHarf!='C' && ilkHarf!='P' && ilkHarf!='S') {
			
		System.out.println("Gecersiz harf girdiniz. Lutfen gun isimlerinden birinin bas harfini yazin");	
		}
		
		
		}
			
		}
		
		
		
		

