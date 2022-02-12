package day29_staticBlock_passByValue;

public class C03_PassByValue {

	public static void main(String[] args) {
		// main method dan diger method lara veya diger methodlardan main method a
		// bir variable gonderirseniz java orjinal variable lari degil
		// onlarin degerlerini(value) goturur, orjinal variable in degeri degismez.
		
		
		int fiyat = 100;

		System.out.println(indirimYap25(fiyat)); // 75

		// main methodun icinde atama yapmadik. O yuzden fiyat degismez.
        // indirimi kalici yapmak istiyorsak main methodda atama yapmamiz gerekiyor.

		System.out.println("methoddan sonra main methoddaki fiyat : " + fiyat); // 100

		fiyat=indirimYap10(fiyat); // kalici olarak degisti cunku burda main methid icinde atama yaptik.

		System.out.println("atama yaptiktan sonra main methoddaki fiyat : " + fiyat); // 100

	}

	private static int indirimYap25(int fiyat) {

		fiyat *= 0.75;
		System.out.println("%25 indirimli fiyat : " + fiyat);
		return fiyat;
	}

	private static int indirimYap10(int fiyat) {

		fiyat *= 0.90;
		System.out.println("%10 indirimli fiyat : " + fiyat);
		return fiyat;

	

	}

}
