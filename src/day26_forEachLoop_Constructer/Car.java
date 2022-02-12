package day26_forEachLoop_Constructer;

public class Car {

	// java biz bir class olusturdugumuzda o class tan obje uretecegimizi bilir
	// ve her class a default constructor yerlestirir
	// java nin class a koydugu bu default constructor gorulmez ama
	// obje uretmek uzere kod yazdimizda otomatik olarak devreye girer.

	// bir constructor olusturmak cok kolaydir
	// method a benzer ama method dan farklidir
	// 1- Constructor ismi method ismi ile ayni olmalidir
	// Class isimleri buyuk harfle basladigi icin Constructor ismi de buyuk harfler baslar
	// 2- Constructor larin return type i olmaz
	// ( method dan 2. farki budur, method larin mutlaka return type olmalidir)
	


	public Car() {

	}
	// javanin her class ta olusturdugu constructor budur

	public int yil= 2000;
	String renk;
	String model;
	int km;
	boolean satilikMi;
	
	// bugun itibariyle class larda main method olma methodu kaldirilmistir :)
	// ancak main method olmayan bir class direkt calistirilamaz
	// main methodu olmayan class lar baska class lardan obje olusturularak kullanilmak uzere
	// ihtiyac duyulan variable lari sakladimiz bir depo gibidir.

}
