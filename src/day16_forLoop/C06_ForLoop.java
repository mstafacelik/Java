package day16_forLoop;

import java.util.Scanner;

public class C06_ForLoop {

	public static void main(String[] args) {
		
		//Kullanicidan 100’den kucuk pozitif bir tamsayi isteyin. 
		//1’den baslayarak girilen sayiya kadar 3’un veya 5”in kati olan sayilari yazdirin. 

		Scanner scan=new Scanner(System.in);
		
		System.out.println("Lutfen 100 den kucuk pozitif bir tamsayi giriniz");
		
		double sayi=scan.nextDouble();
		
		int num=(int) sayi;
		
		
		if (sayi<0) {
			System.out.println("Girilen sayi 0 dan kucuktur. Lutfen pozitif bir sayi giriniz!!!");
		} else if(sayi>100) {
			System.out.println("Girilen sayi 100 den buyuktur. Lutfen 100 kucuk pozitif bir sayi giriniz!!!");
		}else if(sayi!=num) {
			System.out.println("Lutfen pozitif bir tam sayi giriniz!!!");
		}else {

			for (int i = 1; i <= sayi; i++) {
				
				if (i%3==0 || i%5==0) {
				
					System.out.print(i+ " ");
				}
					
			}
			
		}
		
	}

}
