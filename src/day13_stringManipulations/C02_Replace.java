package day13_stringManipulations;

public class C02_Replace {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// String olarak verilen 10.000 sayisinin 
		// binden buyuk olup olmadigini yazdirin
		
		
		String sonuc="10.000";
		
		sonuc=sonuc.replace(".", "") ; // 10000 e cevirip sonuc a assign ettik
		
									 // = oldugu icin sonuc kalici olarak degisti. Ama hala String bir ifade!!!
									
		
		
		// String bir ifade int ile kiyaslanamaz
		// String ifadedeki noktayi kaldirmadan direkt Integer.valueOf(sonuc) YAPAMAYIZ!!!
		
		
		System.out.println(sonuc);
		
		if (Integer.valueOf(sonuc)>1000) {
			
			System.out.println("bulunan sonuc sayisi 1000 den cok");
			
		} else {
			System.out.println("bulunan sonuc sayisi 1000 den az") ; 
		}
		
		
		
		
		//replace() methodu char icin de kullanilabilir ama replaceAll() da char kullanilamaz.
		
		
		

		
		//asagidaki sekilde if (sonuc>1000) bir yazim yapamayiz. String bir ifade int ile karsilastirilamaz!!!
		//String ifadeyi Integer.valueOf ile boolen a ceviririz 
		
		/*if (sonuc>1000) {
			System.out.println("bulunan sonuc sayisi 1000 den cok");    // Hata verir!
		} else {
			System.out.println("\"bulunan sonuc sayisi 1000 den az");
		}
		*/
		
		
		
		
		
	}

}
