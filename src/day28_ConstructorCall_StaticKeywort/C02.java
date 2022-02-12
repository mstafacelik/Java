package day28_ConstructorCall_StaticKeywort;

public class C02 {

	
	int x=5;
	static int y =10;
	
	@SuppressWarnings("static-access")
	public static void main(String[] args) {
		// 3 tane obje olusturalim ve degisimleri gozlemleyelim
		
		C02 obje1=new C02();
		System.out.println("obje1 icin x : " + obje1.x + " obje1 icin y : " + y); // obje1 icin x : 5 obje1 icin y : 10

		obje1.x++;
		y++;
		
		System.out.println("islemden sonra obje1 icin x : " + obje1.x + " obje1 icin y : " + y); // obje1 icin x : 6 obje1 icin y : 11
		
		// ayni class icinde iken static variable lara ulasmak icin obje ihtiyac yoktur
		// kullanirsak java CTE vermez fakat " static variable lara static yoldan ulas " diye bizi uyarur
		
		C02 obje2=new C02();
		System.out.println("obje2 icin x : " + obje2.x + " obje2 icin y : " + y); // obje2 icin x : 5 obje2 icin y : 11
	
		obje2.x++;
		y++;
		
		System.out.println("islemden sonra obje2 icin x : " + obje2.x + " obje2 icin y : " + obje2.y); // islemden sonra obje2 icin x : 6 obje2 icin y : 12
	
	System.out.println("obje2 olusturulduktan ve islemden sonra obje1 in x : " + obje1.x + " y : " + obje1.y); // obje2 olusturulduktan ve islemden sonra obje1 in x : 6 y : 12
		
		
		C02 obje3=new C02();
		obje3.x=20;
		C02.y=40;
		
		System.out.println("obje3 ten sonra obje1 in x : " + obje1.x);   //6
		System.out.println("obje3 ten sonra obje2 nin x : " + obje1.x);  //6
		System.out.println("obje3 ten sonra obje3 un x : " + obje1.x);   //20
		
		
		System.out.println("obje3 ten sonra obje1 in y : " + C02.y);   //40
		System.out.println("obje3 ten sonra obje2 nin y : " + C02.y);  //40
		System.out.println("obje3 ten sonra obje3 un y : " + C02.y);   //40
		
	
	}

}
