package day27_constructor_constructorCall;

public class Car1 {

	public int yil = 2000;
	String renk;
	String model;
	int km;
	boolean satilikMi;

	public Car1(int km, String model, String renk, int yil, boolean satilikMi) {
		// atama yapacagimiz tum ozellikleri parametre olarak yolladik
	}
	
	// ben 5 ozelligi birden degistiren bir constructor urettigimde
	// java default constructor u siler
	// bu durumda daha onceden yazilan ve default constructor i kullanan tum kodlar coker
	// bu durumda kodlari duzeltmek icin javanin sildigi default constructor yerine
	// parametresiz bir constructor olusturmaliyim
	
	
	public Car1() {
		
	}
	
	
	// parametresiz constructor uretmenin syntax i classAdi+()+{}. parametrenin basina public yazsak da olur, ama zorunlu degil
	
	
	public Car1(int i) { // bu satirdaki int ismi km olsa da class leveldeki km farkli scope lardadir.
		km=i;  // buraya tek bir tane int girilen parametreli objeler olusturlursa
			   // java o int degeri bu constructerdan alip km olarak algilyacaktir. orn ; C02 ParametreliConstructer
			   // class i satir 17
		
	}

	public Car1(int i, int j) {
		yil=i;
		km=j;
		}

	public void hiz(int hiz) {
		System.out.println("araba saate : " + hiz + "km hiz yapar");
	}

	public void yakit(String yakit) {
		System.out.println("Araba yakit olarak " + yakit + " kullanir");

	}
}
