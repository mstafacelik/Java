package day43_Interface;

public class C03_Concrete implements C02_Interface {

	public static void main(String[] args) {
		

		C03_Concrete concreteObje=new  C03_Concrete (); 
		
		
		// interface de default keyword kullanarak olusturdugumuz body si olan methodlara
		// child concerete class lardan obje vasitasiyla ulasabilirim
		concreteObje.kaporta();
		
		

		// interface de static keyword kullanarak olusturdugumuz body si olan methodlara
		// child concerete class lardan interface ismi vasitasiyla ulasabilirim
		
		C02_Interface.samzuman();
		
		
	}

	
	// Bir interface de static veya default keyword kullanarak body si olan bir method olusturursak 
	// bu interface'e implement eden concrete child class lar, bu method lari yani body si olan methodlari
	// implement etmek zoeunda degildir
	
	@Override
	public void motor() {
		// TODO Auto-generated method stub
		
	}

}
