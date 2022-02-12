package day11_stringManupilations;

public class C01_Equals {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int a =10 ;
		int b =a + 0 ;
		System.out.println(a==b); //true verir.
		
		char ch1='K';
		char ch2='K' + 0 ;
		System.out.println(ch1==ch2); // true verir.
									  //char variable ler matematiksel isleme girerse ascii degerine bakilir.
									 // dolayisiyla int ya da char da OBJELERI DEGISTIRSEK de sonuc true verir.
		
		String str1= "Ali" ;
		String str2= "Can" ;
		String str3= "Ali Can" ;
		String str4= str1 + " " + str2;
		System.out.println(str4);   //Ali Can yazdirir
		
		System.out.println(str3==str4); //false verir. Degerler esit olsa da REFERANSLAR farkli!!!
										//Degerler ayni olsa da  OBJELER FARKLI!!! Bu String icin gecerli bir kuraldir.
		
		System.out.println(str3.equals(str4)); //true. Cunku equals methodu REFERANSLARA bakmaz. 
											   //sadece degerlere bakar.
		
		
		// String variable larda ==  hem DEGERE hem REFERANSA bakar.
		// Dolayisyla objeler farkli oldugunda genelde(ilerde istisna ogrenecegiz) false doner
		// str1.equals.(str2) ise REFERANSLARA degil SADECE DEGERE  bakar,
		// Eger case sensitive olarak String degerleri ayni ise true doner.
	}

}
