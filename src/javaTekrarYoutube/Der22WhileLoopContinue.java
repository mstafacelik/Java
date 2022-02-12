package javaTekrarYoutube;

public class Der22WhileLoopContinue {

	public static void main(String[] args) {

		// while loop icerisinde istemedgimiz bir durum varsa onu continue ile atlariz.
		// break dur derken continue o islemi gec der.

		int sayi = 0;

		while (true) {

			sayi++;
			if (sayi > 99) {
				break;
			}
			if (sayi == 5) { // burada 5 i atladik
				continue;
			}
			System.out.println("Sayi : " + sayi);

		}

	}

}
