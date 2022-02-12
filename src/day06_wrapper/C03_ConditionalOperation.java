package day06_wrapper;

public class C03_ConditionalOperation {

	public static void main(String[] args) {
		

		
		System.out.println(5+3==8 || 6+5==10 || 7-2==3); //true
		System.out.println(5+3==8 && 6+5==10 && 7-2==3); //false
		
		int a=10 ;
		int b=20 ;
		int c=30 ;
		
		boolean sonuc= a>b || b >c || a+b >=c ; //mantiksal ifadelerin sonucu her zaman true ya da false olur
												//dolayisiyla mantiksal ifadeler boolean variable ile ifade edilir
		
		
		System.out.println(sonuc); //true
		
		//&& isareti yerine bir tane & de kullanilabilir ancak arada bir nuans var.
		//&& isareti bu islemin sonucunun false olacagini bilir ve geriye kalan islemleri kontrol etmeden
		// sonucu false yazdirir.
		//& isareti ise once tum islemleri bitirir ve sonucu false olarak yazdirir.
		
		
		
		System.out.println(5+3==8 && 6+5==10 && 7-2==3) ; //false--) java ilk false görür ve diger islemlere bakmaz
		
		System.out.println(5+3==8 & 6+5==10 & 7-2==3) ; // false--) java ilk false görür ve diger islemlere de bakar.
		
														// java biraz fazla calisir ama yine de devamindaki islemlere bakar
		
		
		
	 int yas=50 ;
	 int boy=180 ;
	 char cinsiyet='M';
	 System.out.println(yas<30 && boy>170 && cinsiyet=='M');
		
		
	 
	 
	 
	 
	 
	}

}
