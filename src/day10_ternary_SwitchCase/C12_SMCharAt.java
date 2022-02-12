package day10_ternary_SwitchCase;

public class C12_SMCharAt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//charAt(istenenIndex) methodu istedigimiz index deki karakteri verir
		
		String kurs="Techproeducation" ;
		System.out.println(kurs.charAt(5));
		
		//index 0 dan baslar!!!
		
		System.out.println(kurs.charAt(0)); // bize ilk harfi verir
		
		System.out.println(kurs.charAt(15)); // son harfi verir
		System.out.println(kurs.charAt(16)); //hata verir
	}

}
