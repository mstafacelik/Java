package javaTekrarYoutube;

public class Ders23ForLoopIle20den120ye3eBolunenSayilar {

	public static void main(String[] args) {

		// 20 den 120 kadar 3 ile tam bolunen sayilari yazdiralim
		
		//1. Yontem

		for (int i = 20; i <= 120; i++) {

			if (i % 3 == 0) {
				System.out.print(i);
				System.out.print(" ");

			}

		}
		
		System.out.println(" ");
		
		
		// 2. yontem

		for (int i = 21; i <= 120; i += 3) {

			System.out.print(i);
			System.out.print(" ");

		}

	}

}
