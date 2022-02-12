package day38_overridding;

public class KumesHayvanlari extends Kuslar {

	public static void main(String[] args) {
		
		
		KumesHayvanlari kms1=new KumesHayvanlari();
		kms1.beslenme(); // kendi class inda yok, parente olan Animals tan aldi
		kms1.hareket();  // kendi class indan aldi.
		kms1.solunum();  // kendi class inda yok parent i olan Kuslar dan alir
		
		Kuslar kms2=new KumesHayvanlari();
		
		kms2.beslenme(); // animals tan alir   -->Tum hayvanlar beslenir
		kms2.hareket();  // kuslar dan ALMADI. ---> Kumes hayvanlari yuruyerek hareket eder
						 // cunku Kuslar class indaki hareket methodu overridden
		
		kms2.solunum();  // kuslar dan aldi  ----> Kuslar akcigerleriyle nefes alir
		
		// kendi spesifik ozellikleri disinda kuslara tabi.
		// ama spesifik bir durumu varsa farkini ortaya koyuyor
		
		
		
		Kuslar kms3=new Kuslar();
		
		kms3.beslenme(); // animals tan alir   ---> Tum hayvanlar beslenir
		kms3.hareket();  // kuslar dan ALDI.   ----> Kuslar ucarak hareket eder
		kms3.solunum();  // kuslar dan aldi   -------> Kuslar akcigerleriyle nefes alir
		
		Animals kms4=new KumesHayvanlari();
		
		kms4.beslenme(); // Animalstan  ---> Tum hayvanlar beslenir
		kms4.hareket();  // Animalstan DEGIL ----> Kumes hayvanlari yuruyerek hareket eder
						 // Const KumesHayvanlari ve burda overriding var spesifik ozellikleri alir
		kms4.solunum();  // kuslardan ---->Kuslar akcigerleriyle nefes alir
		
		
		// variable larda override yok data turunu bulur ordan devam eder
		
		

	}

	public void hareket() {
		System.out.println("Kumes hayvanlari yuruyerek hareket eder");
	}

}
