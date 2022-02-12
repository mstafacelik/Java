package day12_stringManipulations;

import java.util.Scanner;

public class C01_IndexOf {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Soru 1) Kullanicidan bir cumle ve bir harf isteyin, harfin cumlede var olup
		// olmadigini yazdirin
		
		
		Scanner scan=new Scanner(System.in);
		
		System.out.println("Lutfen bir cumle giriniz");
		
		String cumle=scan.nextLine();
		
		System.out.println("lutfen varligini kotrol etmek icin bir harf giriniz");
		
		char krk=scan.next().charAt(0);
		
		int index=cumle.indexOf(krk);   // girilen karakterin cumledeki index ini verir. Yani sayi bulundugu yeri sayo olarak verir.
		
		
		
		if(index<0) {   // index<0 --->>>> -1 demektir!!! yani girilen karakter cumlede yok.
						// if(index==(-1))----> seklinde de if sarti yazilabilir !!!
			
		System.out.println("Girdiginiz harf verilen cumlede yok");
		
		}else {
	    System.out.println("Girdiginiz harf verilen cumlede var");
		
	    
	    
	    //asagidaki yontem de dogrudur. bence bu daha kolay:)))
	    
		if (cumle.indexOf(krk)<0) {							
		System.out.println("Girdiginiz harf verilen cumlede yok");
		
		} else {
		System.out.println("Girdiginiz harf verilen cumlede var");
		
		}
	}
}
}
