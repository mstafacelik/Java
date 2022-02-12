package day28_ConstructorCall_StaticKeywort;

public class C03 {

	public static void main(String[] args) {
		// Java run time bir programdir. 
		// Run tusuna batigimizda java calismaya baslar ve islemleri yaoar.
		// Java nin isi bittiginde (calisma tusu kirmizidan griye dondugunde)
		// Her sey basa doner. Bu arada calistigi sure boyunca static variable ler hep degisir
		
		// static variable ve methodlar bulunduklari class ile ilintilidir.( obje ile degil class ile)
		//baska bir class ta iken C02 deki static variable veya methoda ulasmak istedigmizde 
		// C02.staticVariableIsmi ve C02.staticMethodIsmi() yazmamiz yeterli olur
		
		C02 obje1=new C02();
		System.out.println("obje1 icin x : " + obje1.x + " obje1 icin y : " + C02.y); // obje1 icin x : 5 obje1 icin y : 10

		obje1.x++;
		obje1.y++;
		// static bir variable a class uzerinden ulasmak yerine instance variable lar gibi obje ile ulasmaya calisirsaniz
		// java CTE vermez ama solda ! isareti ile bizi uyarir
		// "static bir field olan C02.y' ye static yoldan ulas" der
		
		System.out.println("islemden sonra obje1 icin x : " + obje1.x + " obje1 icin y : " + C02.y); // obje1 icin x : 6 obje1 icin y : 11
		
		
		C02 obje2=new C02();
		System.out.println("obje2 icin x : " + obje2.x + " obje2 icin y : " + obje2.y); // obje2 icin x : 5 obje2 icin y : 11
	
		obje2.x++;
		C02.y++;
		
		System.out.println("islemden sonra obje2 icin x : " + obje2.x + " obje2 icin y : " + C02.y); // islemden sonra obje2 icin x : 6 obje2 icin y : 12
	
	System.out.println("obje2 olusturulduktan ve islemden sonra obje1 in x : " + obje1.x + " y : " + obje1.y); // obje2 olusturulduktan ve islemden sonra obje1 in x : 6 y : 12
		
		
		C02 obje3=new C02();
		obje3.x=20;
		obje3.y=40;
		
		System.out.println("obje3 ten sonra obje1 in x : " + obje1.x);   //6
		System.out.println("obje3 ten sonra obje2 nin x : " + obje1.x);  //6
		System.out.println("obje3 ten sonra obje3 un x : " + obje1.x);   //20
		
		
		System.out.println("obje3 ten sonra obje1 in y : " + obje1.y);   //40
		System.out.println("obje3 ten sonra obje2 nin y : " + obje1.y);  //40
		System.out.println("obje3 ten sonra obje3 un y : " + obje1.y);   //40
		
	
	

	}

}
