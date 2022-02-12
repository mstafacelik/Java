package javaTekrarYoutube;

public class Ders22WhileIleArrayIcindekiSayilariToplama {

	public static void main(String[] args) {

		// Bir array icindeki sayilarin toplamini while loop ile hesaplayaniz

		int[] sayilar = { 1, 2, 20, 30, -53 };

		int sayilarToplami = 0;
		int index = 0;

		while (index < sayilar.length) {

			sayilarToplami += sayilar[index];

			index++;

		}
		System.out.println(sayilarToplami);

	}

}
