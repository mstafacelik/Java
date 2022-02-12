package day43_Interface;

public interface C02_Interface {

	void motor(); // normal class larda access mod. yazmazsak java default acces mod. kabel eder.
					// interface'de ise access mod. yazmazsak java public olarak kabul eder.

	// private int sayi=10; ---> access mod. private veya protected OLAMAZ.
	int sayi = 10; // final ve static olarak kabul etti. Variable lara atamak yapmak zorundayiz-

	// interface de body si olan bir method yazmak isterseniz java bize 2 alternatif
	// sunar(Normalde bu mumkun degil!!!)
	// 1- Methodun basina "default" keyword (Access mod DEGIL!, bizim bildigimiz default DEGIL!) yazabiliriz ancak burada yazilan
	// default, access mod. degil,
	// java nin interface icin ozel kabul ettigi bir keyword dur. Body kullanmak
	// bunu concrete YAPMAZ.
	
	// 2- Methodun basina "static" keyword(Access mod DEGIL! bizim bildigimiz static DEGIL!) yazabiliriz ancak burada yazilan
	// default, access mod. degil,
	// java nin interface icin ozel kabul ettigi bir keyword dur. Body kullanmak
	// bunu concrete YAPMAZ.
	 
	
	
	

	default void kaporta() {
		System.out.println("default keyword sayesinde body olusturabildim");

	}

	public static void samzuman() {

		System.out.println("static keyword ile body olusturabildim");

	}

}
