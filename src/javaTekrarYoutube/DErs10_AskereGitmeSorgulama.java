package javaTekrarYoutube;

import java.util.Scanner;

public class DErs10_AskereGitmeSorgulama {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.println("Lutfen cinsiyetinizi giriniz");

		String cinsiyet = scan.next();

		System.out.println("Lutfen yasinizi giriniz");

		int yas = scan.nextInt();

		
		if (!cinsiyet.equalsIgnoreCase("Erkek")) {
			System.out.println("Sadece erkekler askere gider!");
			
		}
		
		
		if (cinsiyet.equalsIgnoreCase("Erkek")) {
			if (yas >= 20) {
				System.out.println("Askere gidebilirsiniz");
			}
			if (yas < 20) {
				System.out.println("Yasiniz 20 den kucuk oldugu icin askere gidemezsiniz!");
			}
		}

	}

}
