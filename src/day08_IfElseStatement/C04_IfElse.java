package day08_IfElseStatement;

import java.util.Scanner;

public class C04_IfElse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
         /*Soru 4) Kullanicidan bir ucgenin uc kenar uzunlugunu alin eger uc kenar uzunlugu
		birbirine esit ise ekrana “Eskenar ucgen” yazdirin. Diger durumlarda ekrana
		“Eskenar degil” */
		
		Scanner scan=new Scanner(System.in);
		
		System.out.println("lutfen ucgenin 1.kenar uzunlugunu giriniz");
		
		double uzunluk1=scan.nextDouble();
		
        System.out.println("lutfen ucgenin 2.kenar uzunlugunu giriniz");
		
		double uzunluk2=scan.nextDouble();
		
        System.out.println("lutfen ucgenin 3.kenar uzunlugunu giriniz");
		
		double uzunluk3=scan.nextDouble();
		
		if (uzunluk1==uzunluk2 && uzunluk2==uzunluk3) {
			System.out.println("eskenar ucgen");
		} else {
         System.out.println("eskenar ucgen degil");
		}
		
		// kod su sekilde de ifade edilebilir
		
		System.out.println("Lutfrn ucgenin kenar uzunluklarini yaziniz \nilk kenari girdikten sonra diger uzunluklari girmek icin enter a basin");
		
		double kenar1=scan.nextDouble();
		double kenar2=scan.nextDouble();
		double kenar3=scan.nextDouble();
		
		if (kenar1==kenar2 && kenar2==kenar3) {
			System.out.println("eskenar ucgen");
		} else {
            System.out.println("eskenar ucgen degil");
		}
		
		
		//javada su sekilde bir tanimlama olmaz!!!!
		// if (kenar1==kenar2==kenar3), her birini ayri ayri tanimlamak zorundayiz
		
		
		
		
		
	}

}
