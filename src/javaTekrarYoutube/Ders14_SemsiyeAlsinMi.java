package javaTekrarYoutube;

import java.util.Scanner;

public class Ders14_SemsiyeAlsinMi {

	public static void main(String[] args) {
		// kullaniciya yanina semsiye alip almamasi gerektigi soyleyen kod yazalim
		// Kosullar
		// 1. hava yagmurlu olabilir
		// 2. Arabasi olabilir
		
		Scanner scan=new Scanner (System.in);
		
		System.out.println("Hava nasil");
		String havaDurumu =scan.next();
		System.out.println("Araban var mi");
		String arabaVarMi=scan.next();
		// String havaDurumu =Yagmurlu
	    // boolean arabaVarMi=true;
		
		if (havaDurumu.equalsIgnoreCase("Yagmurlu") && arabaVarMi.equalsIgnoreCase("Hayir")) {
			System.out.println("Semsiye almalisin, araban da yok!");
		} else if (havaDurumu.equalsIgnoreCase("Yagmurlu") && arabaVarMi.equalsIgnoreCase("Evet")){
			System.out.println("Hava yagmurlu olsa da semsiye almana gerek yok, araban var!");
		}else {
			System.out.println("Hava yagmurlu degil.Araban olmasa da semsiye almana gerek yok");
		}
				
				
				
				
				
				
				

		/*if (havaDurumu.equalsIgnoreCase("Yagmurlu") && !arabaVarMi) {
			System.out.println("Semsiye almalisin, araban da yok!");
		} else if (havaDurumu.equalsIgnoreCase("Yagmurlu") && arabaVarMi) {
			System.out.println("Hava yagmurlu olsa da semsiye almana gerek yok, araban var!");
		} else {
			System.out.println("Hava gunesli. Semsiye almana gerek yok");
		*/

	}

}
