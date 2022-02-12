package day12_stringManipulations;

import java.util.Scanner;

public class C03_LastIndexOf {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		//Kullanicidan bir cumle ve bir kelime isteyin,
		//kelimenin cumledeki kullanimina bakarak asagidaki 3 cumleden uygun olani yazdirin
		//Girilen kelime cumlede kullanilmamis.
		//Girilen kelime cumlede 1 kere kullanilmis.
		//Girilen kelime cumlede 1’den fazla kullanilmis.
		
		
		
		Scanner scan=new Scanner(System.in);
		
		System.out.println("Lutfen bir cumle giriniz");
		
		String cumle=scan.nextLine();
		
		System.out.println("Lutfen bir kelime giriniz");
		
		String kelime=scan.next();
		
		int index=cumle.lastIndexOf(kelime);
		
		if (index==(-1)) 
			
		{
			System.out.println("Girilen kelime cumlede kullanilmamis");
			
		} else if (cumle.lastIndexOf(kelime, index -1)==(-1)) {
		
		System.out.println("Girilen kelime cumlede 1 kere kullanilmis");
			
		} else {
        System.out.println("Girilen kelime cumlede 1 den fazla kullanilmis");			
		}
		

		
		
		
	}

}
