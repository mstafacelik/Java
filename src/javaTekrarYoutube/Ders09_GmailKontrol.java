package javaTekrarYoutube;

import java.util.Scanner;

public class Ders09_GmailKontrol {

	public static void main(String[] args) {

		Scanner scan=new Scanner (System.in);
		
		System.out.println("Adres girin");
		
		String adres=scan.next();
		
		boolean iceriyorMu=adres.contains("@");
		
		int index= adres.indexOf("@");
		
		String gmail=adres.substring(index+1);
		
		if (!iceriyorMu) {
			System.out.println("adres @ icermiyor");
			
		}if(!gmail.equals("gmail.com")) {
			System.out.println("girilen adres gamil.com u icermiyor");
		}if (iceriyorMu &&  gmail.equals("gmail.com")) {
			System.out.println("giris basarili");
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
