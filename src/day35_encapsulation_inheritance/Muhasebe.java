package day35_encapsulation_inheritance;

public class Muhasebe extends Personel {
	
	protected int saatUcreti;
	protected String statu;
	protected int maas;
	
	public Muhasebe(){
		System.out.println("Muhasebe parametresiz constructor calisti");
	}
	

	public static void main(String[] args) {
		
		
		Muhasebe calisan1 = new Muhasebe();
		
		calisan1.isim="Ali";
		System.out.println(calisan1.soyIsim); // null
		
		//calisan1. ----> isci class indan methodlar gelmez!!!
		
	}

	
	
	
	public int maasHesapla() {
		
		int maas=8*25*saatUcreti;
		
		return maas;
	}
}
