package day10_ternary_SwitchCase;

public class C06_NestedTernary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Verilen karakteri inceleyin,
		//kucuk harf ise consola “Kucuk Harf”,
		//buyuk harfse consola “Buyuk Harf” 
		//yoksa “girdiginiz karakter harf degil” yazdirin
	
		
	char krk='z';
		
	String sonuc= (krk>='a' && krk<='z') ? "Kucuk Harf": 
				( (krk>='A' && krk<='Z' ? "Buyuk Harf" : " Gridiginiz karakter harf degil")  );
		
		System.out.println(sonuc);
	
	}

}
