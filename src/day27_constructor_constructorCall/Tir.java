 package day27_constructor_constructorCall;

public class Tir {

	
		

	
		int yil = 2000;
		String renk;
		String model;
		int km;
		boolean satilikMi;
		
		
		
		public Tir(int i, String string, String string2, int j, boolean b) {
				// int km, String model, String renk, int yil, boolean satilikMi
			// Tir Runner class indan yolladigimiz degerlerin instance variable larla eslesmesi icin atamalari
			// yapmam lazim
			
			km=i;
			model=string;
			renk=string2;
			yil=j;
			satilikMi=b;
			
			
			
		}



		public Tir(int km, String model, String renk) {
			
			// i , string ve string2 isim olarak guzel isimler degil
			// kod umuzu sonradan incelerken anlasilir degil
			// daha anlasilir olmasi varible isimlerini anlamli yapalim
			// int km, String model, String renk
			
			// class levelde olan variable i this. ile esitleyebiliriz
			
			this.km=km;
			this.model=model;
			this.renk=renk;    
			
			// artik bu scope daki km, model, renk degil bu class daki km, model, renk e gi
			// basina this. yazdigimizda java bu variable larin class leveldaki oldugunu anlar
			
			
			
		}
		
		
	}



