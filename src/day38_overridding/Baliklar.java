package day38_overridding;

public class Baliklar extends Animals {

	public static void main(String[] args) {

		Baliklar balik1 = new Baliklar();
		balik1.beslenme(); // bu class ta beslenme method u arar. Ama burda yok.
							// extends oldugu icin parent a gider. Ordakini yazdirir
		balik1.hareket(); // bu class ta hareket methodu oldugu icin bunu yazdirir
		balik1.solunum(); // bu class ta solum methodu oldugu icin onu alir yazdirir
	}
	
    
    // Chil class daki bir method parent class tan bir methodu override ediyorsa
    // bunu istersek @Override notasyonu ile deklare edebiliriz
    // deklare etmezsek de kodlarimiz calisir
    // ancak deklare ettigimizde java overriden method u surekli kontrol eder
    // ve o method da bir overriding e uymayan bir degisiklik olursa  CTE verir
	@Override
	public void hareket() {
		System.out.println("Baliklar yuzerek hareket eder");
	}

	public void solunum() {
		System.out.println("Baliklar solungaclariyla nefes alir");
	}

}


// Method signature, method ismi ve parametrelerden olusur
// Method signature unu degistirmezsek java her iki methodu ayni method olarak gorur ve ayni class icerisinde ayni
// methodu iki kez olusturmaya izin vermez. 
// Biz parent ve child class ta signature i ayni olan iki method olusturursak java ikisinden sadece birisini calistirir.





