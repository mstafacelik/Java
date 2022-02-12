package day32_varargs_stringBuilder;

public class C06_StringBuilder {

	public static void main(String[] args) {

		String str = "Ali Can";

		String str2 = new String("Veli");

		StringBuilder sb = new StringBuilder("Yasasin Java");

		sb.append("!!!");
		
		System.out.println(sb); // Yasasin Java!!!
								// Eger yukarida objeyi String str; seklinde yazsaydik !!! cikmazdi. 
								// Sadece Yasasin Java yazardi.
		
		// StringBuilder mutable dir yani degistirilebilir.
		
		sb.toString().toUpperCase();
		System.out.println(sb); // Yasasin Java!!! -->> String isin icine girdi, onun icin kucuk yazdirdi

	}

}
