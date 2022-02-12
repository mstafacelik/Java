package day09_nestedIfElse;

import java.util.Scanner;



 public class C01_NestedIfElseNested {
	

	public static void main(String[] args) {
		

		
		


	
				// TODO Auto-generated method stub

				//Nested If kullanarak asagidaki soruyu cozen kodu yaziniz
				//Kullanicidan bir sifre girmesini isteyin
				//Eger 	ilk harf buyuk harf ise “A" olup olmadigini kontrol edin Ilk harf A ise
			    //“Gecerli Sifre” degilse “Gecersiz Sifre” yazdirin
				//Eger ilk harf kucuk harf ise “z" olup olmadigini kontrol edin Ilk harf z ise
				//  “Gecerli Sifre” degilse “Gecersiz Sifre” yazdirin
				
				Scanner scan=new Scanner(System.in);
				
				System.out.println("lutfen bir sifre giriniz");
				
				char sifre=scan.next().charAt(0);
				
				if (sifre>='A' && sifre<='Z') { //buyuk harfleri secmis olduk
					
					if (sifre=='A') {
						System.out.println("sifre gecerli");
					} else {
						System.out.println("sifre gecersiz");
					}
					
					
					
				} else if(sifre>='a' && sifre <='z') { //kucuk harfleri secer
					
					if (sifre=='z') {
						System.out.println("Gecerli sifre");
					} else {
						System.out.println("Gecersiz sifre");
					}

					
					
				}else { //geriye kalan tum durumlar
					
					System.out.println("lutfen bir harf ile baslayiniz");
				}
				}
				
				
        }

	
