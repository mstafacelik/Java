package day05_Matematikselislemler;

public class C01_Matematikselislemler {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		
		
		
		System.out.println((4*(2+5)/2)) ; 
		
		System.out.println((4*(2+5)/3)); // 29/3 ikisi de tam sayi oldugu icin int olarak alir ve virgüleden sonrasini 
		//dikkate almaz.
		
		
		double sonuc=4*(2+5)/3 ;
		
		System.out.println(sonuc); //9.0
		
		sonuc=(4*(2+5)/3);
		
		System.out.println(sonuc); //9.0
		
		
	    sonuc=(double)4*(2+5)/3 ;
		
		
		System.out.println(sonuc); // 9.333333333334
		
		
		int sayi1=5 ;
				 
		int sayi2=2 ;
				
		double sayi3=2 ;
		
		System.out.println(sayi1/sayi2);//.. ikisi de int oldugu icin java bunu 2.5 degil 2 yapar.
		
		
		System.out.println(sayi1/sayi3); //.. double oldugu icin sonuc 2.5
		
		System.out.println(sayi1+sayi3/sayi2); //.. sonucun virgüllü olmasini isiyorsak "isleme girenlerden biri" douable olmali
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
