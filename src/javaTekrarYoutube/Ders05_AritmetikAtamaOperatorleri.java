package javaTekrarYoutube;

public class Ders05_AritmetikAtamaOperatorleri {

	public static void main(String[] args) {

		int sayi = 10;

		sayi = sayi * 5;  // bu atama yontemi acemiligi gosterir

		System.out.println(sayi);
		
		sayi*=5; 				// 250
		System.out.println(sayi);
		sayi+=5; 				// 255
		System.out.println(sayi);
		sayi-=5;   				// 250
		System.out.println(sayi);
		sayi/=5;
		System.out.println(sayi); //50
		sayi%=5; 				  // 0
		System.out.println(sayi);
		
		
		// asagidaki sekil profosyonel
		
		sayi*=5; 				
		sayi+=5; 				
		sayi-=5;   				
		sayi/=5;
		sayi%=5;
		
		System.out.println(" ");
		
		// ornek 
		int s1=25;
		int s2=4;
		
		s1*=s2;
		System.out.println(	s1); // 100
		s1+=s2;
		System.out.println(s1); // 104
		s1-=s2;
		System.out.println(s1); // 100
		s1/=s2;
		System.out.println(s1);  // 25
		s1%=s2;
		System.out.println(s1); // 1
		
		
		
		
		
		
		
		
		
	}

}
