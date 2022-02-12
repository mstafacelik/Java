package day03;

public class C03_AutoWidening {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		byte sayi1=44 ;
		
		short sayi2 = sayi1;
		
		
		//esitligin sol tarafi short, sag tarafi byte
		//iki data türü farkli oldugu halde java itiraz etmiyor
		
		//cünkü atama yapilan variable"nin data türü(short)
		//atanan degerlerin veri türünden (byte) büyük oldugundan sorun olusmaz
		
		
		System.out.println("sayi2 : " + sayi2);
		
		int sayi3=55 ;
				
		double sayi4= sayi3 ;
		
		
		System.out.println("sayi4 : " + sayi4);
		
		
		//atanan degerin data türü, deger atanan variable"nin data türünden kucukse 
		//java casting"i otomatik yapar
		// bu isleme auto widening nedir
		
		
		
		
	}

}
