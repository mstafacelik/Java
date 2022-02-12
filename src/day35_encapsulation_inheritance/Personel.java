package day35_encapsulation_inheritance;

public class Personel {
	
	
	protected String isim;
	protected String soyIsim;
	protected boolean calisiyorMu;
	protected String telNo;
	protected int yas;
	
	Personel(){
		System.out.println("Personel parametresiz constructor calisti");
	}
	
	// eger variable lara access modifier yazmazsak java access modifier olarak default access modifier atar.
	// boyle olursa sadece o package altindaki child class lar Personel Class ini inherit edebilir.
	// baska package lardaki child class larin da Personel i inherit edebilmesi icin
	// variable ve methodlarin acc.mod larini protected yapariz.
	// public yapsak da inherit edilebilir ama biz herkesin erismesini degil de 
	// sadece child clas'larin erismesini istedigimizden protected tercih ederiz
	
	
	

	public static void main(String[] args) {
		
	}

}
