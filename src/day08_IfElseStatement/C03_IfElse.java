package day08_IfElseStatement;

import java.util.Scanner;

public class C03_IfElse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Soru 3) Kullaniciya yasini sorun, eger yas 65’den kucuk ise “emekli olamazsin,
		//calismalisin”, 65’e esit veya  buyukse “Emekli olabilirsin” yazdirin
		
		
		Scanner scan=new Scanner(System.in);
		
		System.out.println("lütfen yasinizi giriniz");
		
		int yas=scan.nextInt();
		
		if (yas<65) {
			System.out.println("emekli olamazsin, calismalisin");
			
		} else {
		System.out.println("Emekli olabilirsin");
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
