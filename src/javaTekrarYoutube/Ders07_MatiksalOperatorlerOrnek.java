package javaTekrarYoutube;

public class Ders07_MatiksalOperatorlerOrnek {

	public static void main(String[] args) {
		// olusurulan int degiskeni icerisindeki sayinin degerinin araliklarini gosteren bir program yaziniz
		// orn int sayi 57 ; 
		// 0-50: false, 50-100; true
		// 0-50 ve Cift : false, 50-100 ve Cift : false
		// 0-50 ve Tek : false, 50-100 ve Tek : true
		
		int sayi=57;
		
		boolean dogruMu1= sayi>0 && sayi<50;
		boolean dogruMu2= sayi>=50 && sayi<100;
		
		boolean dogruMu3=sayi>0 && sayi<50 && sayi%2==0;
		boolean dogruMu4=sayi>=50 && sayi<100 && sayi%2==0;
		
		boolean dogruMu5=sayi>0 && sayi<50 && sayi%2==1;
		boolean dogruMu6=sayi>=50 && sayi<100 && sayi%2==1;
		
		
		System.out.println(dogruMu1);
		System.out.println(dogruMu2);
		System.out.println(dogruMu3);
		System.out.println(dogruMu4);
		System.out.println(dogruMu5);
		System.out.println(dogruMu6);
				
		
		

	}

}
