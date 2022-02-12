package day16_forLoop;

import java.util.Scanner;

public class C07_ForLoop {

	public static void main(String[] args) {
		
		
		// Soru 6) Interview Question
				// Kullanicidan 100’den kucuk bir tamsayi isteyin. 1’den baslayarak girilen sayiya kadar tum sayilari yazdirin. Ancak;
			 	// -Sayi 3’un kati ise sayi yerine “Java” yazdirin.
				// -Sayi 5’in kati ise sayi yerine “Guzeldir” yazdirin.
				// -Sayi hem 3’un hem 5’in kati ise sayi yerine “Java Guzeldir” yazdirin.


				Scanner scan=new Scanner(System.in);
				
				System.out.println("Lutfen 100 den kucuk pozitif bir tamsayi giriniz");
				
				double sayi=scan.nextDouble();
						
				int num=(int) sayi;
				
				if (sayi<0) {
					System.out.println("Lutfen pozitif bir sayi giriniz!");
				} else if (sayi>100)  {
		          System.out.println("Lutfen 100 den kucuk bir sayi giriniz"); }
		          
				else if(sayi!=num) {
					System.out.println("Lutfen bir tam sayi giriniz");
				}else {
				
					for (int i = 1; i <= sayi; i++) {
					
						if (i%3==0 && i%5==0) {
							System.out.println("Java Güzeldir");
						} else if(i%3==0) {
							System.out.println("Java");
						}else if(i%5==0) {
					System.out.println("Java Guzeldir");
					
					}else {
					
					System.out.println(i);
					
					}
					
					
				}
				
					
	}
	}
}
