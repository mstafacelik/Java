package day01_02_Variables;

public class C02_Variables {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String okul = "Ted Koleji";

		// ayni isim ve degisken turu ile ikinci defa variable olusturulamaz
		// String okul="Mehmet Koleji";

		// farkli data turu de olsa ayni isim ile ikinci defa variable olusturulamaz
		// int okul=20;

		// var olan bir variable'a yeni deger atayabiliriz
		okul = "Ankara Koleji";

		System.out.println(okul); // Mehmet Koleji

		// yazdirma isleminde aciklama eklemek istersek
		// mesela okul adi : Mehmet Koleji yazdiralim

		System.out.println("okul adi : " + okul);// okul adi : Ankara Koleji
		System.out.println("okul adi : " + "okul"); // okul adi : okul

	}

}
