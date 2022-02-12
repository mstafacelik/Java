package day20_scope;

public class InstanceVar {

	// intance variable class in icinde main methodun disinda olusturulmalidir

	int notMat = 50;
	int notFen; // buna deger atamak zorunda degiliz

	// instance variable larin main methodu yoktur
	// Baska bir deyisle main method dan instance variable lara direkt ulasamayiz

	public static void main(String[] args) {
		// System.out.println(notMat); // main method static oldugu icin static olmayan
		// variab lari main methodda
		// direk kullanilamaz veya goruntulenemez

		// main methoddan instance lere gitmek icin obje olusturup obje uzerinde
		// erisim saglayabiliriz

		// Scanner scan= new Scanner(System.in)
		// icinde oldugumuz class tan bir obje olusturalim
		// once icinde oldugumuz class in ismini yaziyoruz

		InstanceVar celik = new InstanceVar(); // bu obje uzerinden statick olmayan variable lara ve methodlara
												// ulasabiliz

		System.out.println(celik.notMat); // 50

		InstanceVar esra = new InstanceVar();
		esra.notMat = 70;
		System.out.println(esra.notMat);
		// instance variable larda deger atamazsak java instance olarak atanan degeri alir
		// bu class icin notMat=50 gibi
		// ama istersek deger de atayabiliriz. Bu durumda deger atadimiz obje icin yeni deger gecerli olur
		
		System.out.println(celik.notMat); // 50
		
		// celik in notunu degistirmek istiyorsak celik.notMat'a deger atamaliyiz
		
		celik.notMat=90;
		
		System.out.println(celik.notMat); //90
		
		celik.method2(); // method2 static olmadigi icin main method dan direkt cagrilamaz.
		
		
	}

	public static void staticMethod() {
	
		// System.out.println(notFen); // instance variable lara static method lardan direkt ulasilamaz
		

	}

	public void method2() {
		
		System.out.println("method2 deki notFen : " + notFen); // bu method static olmadigi icin
															   //instance variabe lara direkt ulasabilir
		
		// instance variable olusturulurken deger atanmasa da olur. Bu durumda java default degerler atar.
		// int icin default deger 0'dir.
		notFen=100;
		System.out.println("method2 deki duzeltilmis notFen : " + notFen);

	}
}
