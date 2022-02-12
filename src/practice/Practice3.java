package practice;

import java.util.Scanner;

public class Practice3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//kullanicin ad soyad yas boy kilosunu alt alta yazdirin
		
		
		
		Scanner scan=new Scanner(System.in); 
		
		
		System.out.println("lütfen adinizi giriniz :");
		//System.out.print girilen veriyi ayni satira yazdirir
		//System.out.println girilen veriyi bir alt satira yazdirir
		String adi= scan.next() ;
		
		System.out.println("lutfen soyadinizi giriniz");
		
		String soyAdi= scan.nextLine();
		
		System.out.println("lutfen yasinizi giriniz");
		
		int yas= scan.nextInt();
		
		System.out.println("lutfen boyunuzu giriniz");
		
		int boy= scan.nextInt();
		
		System.out.println("lutfen kilonuzu giriniz");
		
		int kilo= scan.nextInt();
		
		
		
		/*    Hocanin cozumu-------)  Scanner scan =new Scanner(System.in);
	
	System.out.print("adinizi giriniz :");//kullanicya adını grmesinin bildirimini yazdırdık
	//System.out.print--> girilen veriyi ayni satira yazdirir
	//System.out.println--> girilen veriyi bir alt  satira yazdirir
	String name=scan.nextLine();
	
	System.out.print("soyadinizi giriniz :");
	String surName=scan.nextLine();
	
	System.out.print("yasinizi giriniz :");
	int age=scan.nextInt();
	
	System.out.print("boyunuzu giriniz :");
	int boy=scan.nextInt();
	
	System.out.print("kilonuzu giriniz :");
	int kilo=scan.nextInt();
	
	System.out.println("benim adım:"+name+"\n"
	        +"soyadım :"+surName+"\n"
			+"yasim:"+age+"\n"
			+"boyum:"+boy+"cm"+"\n"
			+"kilom:"+kilo+"kg");
	
	/*
	    adinizi giriniz :mehmet
		soyadinizi giriniz :yiğit
		yasinizi giriniz :35
		boyunuzu giriniz :188
		kilonuzu giriniz :70
		benim adım:mehmet
		soyadım :yiğit
		yasim:35
		boyum:188cm
		kilom:70kg
		*/

				
			
		
		
		
	}

}
