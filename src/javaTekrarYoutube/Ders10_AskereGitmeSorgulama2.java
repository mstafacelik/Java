package javaTekrarYoutube;

public class Ders10_AskereGitmeSorgulama2 {

	public static void main(String[] args) {

		String cinsiyet = "Erkek";
		int yas = 19;

		if (cinsiyet.equalsIgnoreCase("Erkek")) {

			if (yas >= 20) {
				System.out.println("Askere gidebilirsiniz.");
			} else {
				System.out.println("Yasiniz 20 den kucuk oldugu icin askere gidemezsiniz");
			}

		} else {
			System.out.println("Sadece erkekler askere gider!");
		}

	}

}
