package day03;

public class C03_AutoWidening {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		byte sayi1=44 ;
		
		short sayi2 = sayi1;
		
		
		//esitligin sol tarafi short, sag tarafi byte
		//iki data t�r� farkli oldugu halde java itiraz etmiyor
		
		//c�nk� atama yapilan variable"nin data t�r�(short)
		//atanan degerlerin veri t�r�nden (byte) b�y�k oldugundan sorun olusmaz
		
		
		System.out.println("sayi2 : " + sayi2);
		
		int sayi3=55 ;
				
		double sayi4= sayi3 ;
		
		
		System.out.println("sayi4 : " + sayi4);
		
		
		//atanan degerin data t�r�, deger atanan variable"nin data t�r�nden kucukse 
		//java casting"i otomatik yapar
		// bu isleme auto widening nedir
		
		
		
		
	}

}
