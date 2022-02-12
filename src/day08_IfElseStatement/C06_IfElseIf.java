package day08_IfElseStatement;

import java.util.Scanner;

public class C06_IfElseIf {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*
  
 * Soru 7) Kullanicidan 100 uzerinden notunu isteyin. Not’u harf sistemine cevirip yazdirin.
  50’den kucukse “D”, 50 60 arasi “C”, 60 80 arasi “B”, 80’nin uzerinde ise “A”
 */
		
		
		Scanner scan=new Scanner(System.in);
		
		System.out.println("lutfen 100 uzerinden notunuzu giriniz");
		
		double not=scan.nextDouble();
		//double not2=scan.nextDouble();
		//double not3=scan.nextDouble();
		//double not4=scan.nextDouble();
		
		
		
		if (not<0 || not>100 ) {
			System.out.println("lutfen gecerli bir not giriniz");
		} else if (not>80) {
			System.out.println("Notunuz \"A\"");
		} else if(not>60) {
		System.out.println("Notunuz \"B\"");
		}
		else if(not>50) {
			System.out.println("Notunuz \"C\"");
		}
		
		else {
		System.out.println("Notunuz \"D\""); }
		// bir kod else if le bitmez!!!!!!!! sadece else le biter!!!!!!!
		}
		
	}

