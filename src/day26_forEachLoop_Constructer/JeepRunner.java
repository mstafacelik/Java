package day26_forEachLoop_Constructer;

public class JeepRunner {

	public static void main(String[] args) {
		// Jeep class indan bir obje olusturalim ve ozelliklerini yazdiralim

		Jeep jeep1 = new Jeep();

		// artik Jeep class indaki butun ozelliklere ulasabiliriz

		System.out.println(jeep1.fiyat + " " + jeep1.ilanNo + " " + jeep1.marka + " " 
							+ jeep1.model + " " + jeep1.yil); // 10000 1001 null null 2001
		
		
		// jeep class indaki variable lar instance variable lar olduklarindan atadigim degerler sadece benim objem 
		// icin degerleri degistirir. jeep class indaki degerlere hicbirsey yapmaz
		
		jeep1.fiyat=15000;
		jeep1.ilanNo=1002;
		jeep1.marka="Toyota";
		jeep1.model= " Corola";
		jeep1.yil= 2005;
		
		// artik default ya da atanmis degerleri degil bizim atadimiz degerleri yazdirir
		
		System.out.println(jeep1.fiyat + " " + jeep1.ilanNo + " " + jeep1.marka + " " 
				+ jeep1.model + " " + jeep1.yil);   // 15000 1002 Toyota  Corola 2005
		
		
	 jeep1.hiz(150);        // araba saate : 150km hiz yapar
	 jeep1.yakit("benzin"); // Araba yakit olarak benzin kullanir
	
	}

}
