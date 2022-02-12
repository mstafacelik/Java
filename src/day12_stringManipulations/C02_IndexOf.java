package day12_stringManipulations;

import java.util.Scanner;

public class C02_IndexOf {

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
		
		String kelime=scan.next();     //kelime oldugu icin nextLine degil
		
		int index=cumle.indexOf(kelime);
		
		if (index<0) {
			
		System.out.println("Girilen kelime cumlede kullanilmamis");
			
		} else if(cumle.indexOf(kelime, index+1)<0) {
			
		System.out.println("Girilen kelime cumlede 1 kere kullanilmis.");
			
		}else {
		
			System.out.println("Girilen kelime cumlede 1’den fazla kullanilmis.");
		}
		
		
		// eger 0 dan kucukse cumlede boyle bir kelime yoktur.
		
		// eger 0 dan kucuk degilse kelime cumlede kullanilmistir.
		
		// bu noktada bir kere mi yoksa birden fazla mi kullanilmis buna bakmamiz gerekiyor.
		
		// bir kere kullanilmissa kelimenin indexinden sonra tekrar kullanilmamis olmasi gerekir.
		
		// yani en son aradigimiz index+1 in degerinin 0 dan kucuk olmasi gerekiyor.

		// eger sifirdan kucuk degilse birden fazla kullanilmis demektir
		
		scan.close();
	}


}