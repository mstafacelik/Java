package day17_forLoop;

public class C06_NestedForLoop {

	public static void main(String[] args) {
		
		
		// 1 den 4 e kadar sayilari yanyana aralarinda bir bosluk birakarak yazdirin.
		
		
		for (int satir = 1; satir <=5; satir++) {	//buna outer for loop asagidakine inner for loop denir.
				
		
		
			for (int i = 1; i <=9; i++) {
				
				System.out.print(satir*i + " "); // outer for loop ile inner for looop u satir*i ile iliskilendiririz 
				
				}
		
		System.out.println(""); //outer for loop un icine bunu yazmazsak satirlari alt alt yazmaz
		}
			

	}

}
