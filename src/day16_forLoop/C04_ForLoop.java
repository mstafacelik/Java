package day16_forLoop;

public class C04_ForLoop {

	public static void main(String[] args) {
		
		// 100’den baslayarak 50’ye(dahil) kadar olan sayilari aralarinda virgule olarak ayni satirda yazdirin
		
		for (int i = 100; i >= 50; i--) {
			
			if (i==50) {
				System.out.print(i);
			
			} else {
				System.out.print(i+ ",");
			}
			
						
		}
		
	}

}
