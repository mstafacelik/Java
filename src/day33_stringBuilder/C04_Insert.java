package day33_stringBuilder;

public class C04_Insert {

	public static void main(String[] args) {

		StringBuilder sb = new StringBuilder("Java ogrendik");

		// append() sona eklerken insert araya ekler. Eski yapiyi bozmaz. 
		// ornegini yapmadan gectigimiz replace(3,8, "Ali) te ise 3 tem 8 kadar kaldirir ve Ali ekler. 

		// araya "cok iyi" ekleyelim

		sb.insert(4, "yi cok iyi"); // 4. indexe ekler
		System.out.println(sb); // Javayi cok iyi ogrendik
		

		String str2 = "cok iyiyim";

		sb.insert(7, str2, 0, 4); // str2'de 0 dan 4 kadar al insert et.
		System.out.println(sb); // Javayi cok cok iyi ogrendik

	}

}
