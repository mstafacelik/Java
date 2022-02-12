package javaTekrarYoutube;

public class Ders22WhileLoop {

	public static void main(String[] args) {

		int sayi = 1;

		while (sayi < 5) {
			System.out.println("Mrb");

			sayi++;

		}
		String[] isimler = { "ALi", "Ahmet", "Veli", "Ayse", "Fatma" };

		int index = 0;
		while (index < isimler.length) {

			System.out.print(isimler[index]);
			System.out.print(" ");
			index++;

		}

	}

}
