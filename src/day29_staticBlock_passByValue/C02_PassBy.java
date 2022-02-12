package day29_staticBlock_passByValue;

public class C02_PassBy {

	public static void main(String[] args) {
		
		// biz 100 tl ye satilan bir urun icin 2 farkli indirim uygulyan 2 ayri method
		// olusturalim.
		
		int fiyat = 100;

		indirimYap25(fiyat); // %25 indirimli fiyat : 75
		

		System.out.println("methoddan sonra main methoddaki fiyat : " + fiyat); // 100

		indirimYap10(fiyat); // %10 indirimli fiyat : 90

		System.out.println("methoddan sonra main methoddaki fiyat : " + fiyat); // 100

	}

	private static void indirimYap25(int fiyat) {

		fiyat *= 0.75;
		System.out.println("%25 indirimli fiyat : " + fiyat);

	}

	private static void indirimYap10(int fiyat) {

		fiyat *= 0.90;
		System.out.println("%10 indirimli fiyat : " + fiyat);

	}
}