package javaTekrarYoutube;

public class Ders22WhileIle1den50yeKadarSayiYazdirma {

	public static void main(String[] args) {
		// while ile 1 de n 50 ye kadar(dahil tum sayilari yazdirin
		// Ayni pratigi 1 den 50 ye kadar 5 ile tam bolunebilen sayilari console a
		// yazdiralim

		int sayi = 1;

		while (sayi < 51) {

			System.out.print(sayi);
			System.out.print(" ");
			sayi++;

		}

		System.out.println(" ");
		
		
		// 1.Yontem ve tehlikeli yontem cunku while in sarti birden fazla olursa ilk basta calismazsa loop hic devereye girmez
		
		 int deger = 5; while (deger < 51 && deger % 5 == 0) {
		  System.out.print(deger); 
		  System.out.print(" ");
		  deger+=5;
		  
		  }
		 System.out.println(" ");
		 
		 // 2. Yontem
		int count = 1;
		while (count < 51) {
			if (count % 5 == 0) {
				System.out.print(count);
				System.out.print(" ");
			}
			count++;
			
		}

	}

}
