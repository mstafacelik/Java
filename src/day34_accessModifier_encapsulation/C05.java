package day34_accessModifier_encapsulation;

public class C05 {
	
	private int asgariMaas=4000;

	public static void main(String[] args) {
		
		
		

	}

	public int getAsgariMaas() {   // sol ustten source->generate getters und setters den bunu urettik
		return asgariMaas;
	}

	
	// bir class taki herhangi bir class uyesine ulasilabilsin ama degistirilemesin diyorsaniz
	// 1- class uyesini PRIVATE yapin
	// 2- private class uyelerine hicbir sekilde ulasim olmayacagi icin sadece gorebilme yetkisi verin
	// getter() olusturun
}
