package day12_stringManipulations;

public class C06_Contains {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String cumle="Calisirsaniz, java ogrenmek cok kolay" ;
		
		System.out.println(cumle.contains(" ")); // true
		
		System.out.println(cumle.contains("iz, j")); // true
		
		System.out.println(cumle.contains("Hasan"));  // false
	
		
		// contains() methodu char icin kullanilamaz, String kullanmak zorunludur!!!
		
	}

}
