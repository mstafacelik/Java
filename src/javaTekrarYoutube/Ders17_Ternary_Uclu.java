package javaTekrarYoutube;

public class Ders17_Ternary_Uclu {

	public static void main(String[] args) {

		String isim = "";
		int sayi = 30;

		isim = sayi > 50 ? (sayi > 80 ? "Ali" : " Veli") : ("Deli"); // nested ternary yaptik
		System.out.println(isim);
		
		
		
		// yukaridaki ile asagidaki kod ayni.
		// ternary bazen daha kisa kod yazmamizi saglar
		
		if (sayi > 50) {
			if (sayi > 80) {
				isim = "Ali";
			} else {
				isim = "Veli";
			}

		} else {
			isim="Deli";
		}

	}

}
