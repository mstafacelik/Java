package day32_varargs_stringBuilder;

public class C05_Varargs {

	public static void main(String[] args) {

		topla(5, 10, 13, 0);
		// varargs tan once farkli parametreler kullanilabilir
		// ama varrags tan sonra parametre yazilamaz
		// yazarsaniz java "varargs son parametre olmalidir" diye uyarir ve
		// CTE verir.

	}

	private static void topla(int... sayilar) {

		int toplam = 0;

		for (int each : sayilar) {
			toplam += each;
		}

		System.out.println("Girilen sayilarin toplami : " + toplam);
		

	}

}
