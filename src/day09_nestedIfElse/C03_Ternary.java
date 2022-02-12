package day09_nestedIfElse;

public class C03_Ternary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	int x=10;
	
	String tekMiCiftMi=x%2==0 ? "cift sayi" : "tek sayi" ;// bu yontem assignment yaparak yapilabilir
		System.out.println(tekMiCiftMi);
		
	System.out.println(x%2==0 ? "cift sayi" : "tek sayi");// ya da direkt syso nun icine alarak assignment yapmadan da
														// yapilabilir
	
	//ternary iki turlu kullanilabilir. 
	//ya donen sonuca gore bir variable assign ederiz
	//veya direkt syso icine yazip sonucu yazdiririz.
	
	//eger turnary de donecek sonuclar ayni data turunden degilse
	//atama yapamayiz, sadece syso ile yazdirabiliriz.
	
	//String    sonuc=x>5?   "Aferin" : 4 ; //burda "Aferin" ve 4 farkli data turu oldugu icin java hata verir.
	
	System.out.println(x>5? "Aferin" : 4); //burda ise kod calisir
	
	
	
	
	}

}
