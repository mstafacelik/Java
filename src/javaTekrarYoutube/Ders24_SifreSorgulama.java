package javaTekrarYoutube;

public class Ders24_SifreSorgulama {

	public static void main(String[] args) {

		String sifre = "aasd123";
		
		sifreKotrol(sifre);

		
	}
	
	
	public static boolean sifreKotrol(String a) {
		
		boolean rakamVarMi = false;
		boolean buyukHarfVarMi = false;
		boolean kucukHarfVarMi = false;

		for (int i = 0; i < a.length(); i++) {

			if (a.charAt(i) >= '0' && a.charAt(i) <= '9') {
				rakamVarMi = true;

			} else if (a.charAt(i) >= 'A' && a.charAt(i) <= 'Z') {
				buyukHarfVarMi = true;

			} else if (a.charAt(i) >= 'a' && a.charAt(i) <= 'z') {

				kucukHarfVarMi = true;

			}

		}

		boolean kontrol = rakamVarMi && buyukHarfVarMi && kucukHarfVarMi;
		System.out.println("Sonuc kontrol : " + kontrol);
		
		return kontrol;
		
	}

}
