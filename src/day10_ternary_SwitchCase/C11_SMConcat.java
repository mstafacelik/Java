package day10_ternary_SwitchCase;

public class C11_SMConcat {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//String olarak verilen bir degisken + ile baska bir degiskene sokulursa
		//java bunlari yan yana ekler. Buna concatenation denir.
		
		String isim="Ali" ;
		String soyIsim="Can" ;
		System.out.println(isim + " " + soyIsim);  // Ali Can
		
		//ayni islemi + semblu yerine concat() ile de yapabiliriz.
		
		System.out.println(isim.concat(soyIsim));
			
		System.out.println(isim.concat(" ").concat(soyIsim));
	}

}
