package day16_forLoop;

public class C03_ForLoop {

	public static void main(String[] args) {
		
		// 10 ile 30 arasindaki sayilari(10 ve 30 dahil) aralarinda virgule olarak ayni satirda yazdirin
		
		for (int i = 10; i <= 30; i++) {
			if (i==30) {
				
				System.out.print(i );
				
			} else {
				
				System.out.print(i + ", ");
			}
			
			}
		
		System.out.println(); //bos syso sadece alt satira gecmek icin kullanilir
		
		for (int i = 10; i <= 29; i++) {
			System.out.print(i+ ", ");
		}
		System.out.print(30); 
		}
	

}
