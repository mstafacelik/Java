package day26_forEachLoop_Constructer;

public class CarRunner {

	public static void main(String[] args) {
		// Car class indan bir obje olusturalim

		Car car1 = new Car();

		// class ismi obje ismi atama keyword Constructor

		System.out.println(car1.km + " " + car1.model + " " + car1.renk + " " + car1.yil); // 0 null null 2000
		
		

		// javada obje olusturmak istiyorsak constructor kullanmak zorundayiz
		// constructor java nin obje olusturmak icin kullandigi kod blogudur
		
		
		// olusturdugumuz Car class ina gitti ve orda km degerini bulup bize getirdi.
		// Car class inda olusturdugumuz variable lere deger
		// atamadimiz icin java int in default degeri olan 0 i getirdi
		

		// bir obje olustururken eger obje icin kendi class inda belirlenen degerleri kullanmak iatiyorsam 
		// hicbir degeri kendim atamadan kendim obje olusturabilirim
		// bu durumda hicbir parametre kullanilmadigi icin default constructor yeterli olacaktir
		
		
		// eger obje olusturdugum class taki degerleri kullanmak yerine kendi degerlerimle bir obje
		// olusturmak istersem o zaman parametreli constructor olusturmam gerekir
		
		// Car car2=new Car("Kirmizi, Corolla");

		// Car class inda iki String parametresi olan vir constructor olmadigi icin
		// bir obje olusturmayi simdilik yapamayiz

	}

}
