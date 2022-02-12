package day39_overidingKurallari_polymorphisim;

public class C01 {

	public static void staticMethos() {
		System.out.println("Parent class static method calisti");
	}

	private void privateMethod() {
		System.out.println("Parent class private methodu calisti");
	}

	// final demek bu son hali bir daha degistirilemez demektir
	// dolayisiyla final olarak tanimlanan bir method override edilemez
	public final void finalMethod() {

		System.out.println("Parent class final method");

	}

	// child class ile parent class ayni package ta olduklarindan methodlarin access
	// modifier lari public, protected
	// veya default olsaydi hicbir sorun olmazdi
}
