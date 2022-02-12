package day06_wrapper;

public class C02_Concetenation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		String str1= "Java" ;
		String str2="Guzel" ;
		int sayi1=5 ; 
		int sayi2=4 ;
		
		
		
		// asagidaki metinleri yazdirin.
		
		//Java Guzel 54
		//Java 5 Guzel
		//Java 94
		//Java 19
		//54 Guzel
		
		System.out.println(str1+ " "+ str2+" "+ sayi1+sayi2 );
		System.out.println(str1 +" "+sayi1+" "+ str2 );
		System.out.println(str1+" "+ (sayi1+sayi2)+sayi2);
		System.out.println(str1+" "+(sayi1-sayi2)+(sayi1+sayi2));
		System.out.println(sayi1+(sayi2+" "+ str2));    // bu sekilde de olur.
		System.out.println(""+sayi1+sayi2+" "+ str2); //bu sekilde de olur.
		
		//ifadeyi stringe cevirmek icin hiclik "" eklenir. Amac Concetenation yapmak
													 
		// int i string e cevirmenin en kisa yolu hiclik " " eklemek. 
		
		
		
		
		
		
		
		
		
		
	}

}
