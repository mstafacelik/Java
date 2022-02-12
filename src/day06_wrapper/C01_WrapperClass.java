package day06_wrapper;

public class C01_WrapperClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int sayi1=10;
		
		Integer sayi2=20;
		
		
		//sayi1. yazdigimizda hicbir method cikmaz, cunku sayi bir int dir yani primitive dir.
		
		// sayi2. yazdigimizda ise bircok methot geliyor. cunku sayi int der yani wrapper class dir.
		
		
		
		String tel1="3578987" ;
		
		String tel2="3245434" ;  //35789873245434
		
		System.out.println(tel1 + tel2);
		
		
		//bu sayilari toplamak isterseniz
		
		System.out.println(Integer.valueOf(tel1)+ Integer.valueOf(tel2));
		
		//value deger demek. value of bir seyin degeri demek.orn: value of money=wert des Geldes gibi
		//Integer.valueOf(numerik ifade) methodu, string olarak kaydedilmis ifadeleri sayiyi cevirir.
		
		System.out.println(Integer.MIN_VALUE);  //-2147483648
		System.out.println(Integer.MAX_VALUE);  // 2147483647
		
		
		System.out.println(Double.MAX_VALUE); //1.7976931348623157E308 // E308--- E den sonra 308 tane sifir var demek
											  // yani 10 uzeri 308 demek	
		
		System.out.println(Short.MAX_VALUE);   // 32767
		
		//String caddeNo= "B203" ;
		String caddeNo="203"   ;
		String sokakNo="1564" ;
		
		System.out.println(Integer.valueOf(caddeNo)+ Integer.valueOf(sokakNo)); // java hata verir.
		
		//cunku B203 ifadesinde harf var.
		//Integer.valueOf(numerik ifade) methodu string olarak kaydedilmis ifadeleri sayiyi cevirir.
		//Ancak strig ifadede numerik olmayan bir karakter olursa
		//java NumberFormatException hatasi verir ve calismayi durdurur.
		//stops execution
		
		System.out.println("Hello World");	// üstteki hatadan dolayi java calismayi durdurur ve bundan sonra islem yapmaz
		
		
		
		
		
		
		
		/*String kimlikNo1="10";
		  String kimlikNo2="20" ;
		
		
		  System.out.println(Integer.valueOf(kimlikNo1)+ Integer.valueOf(kimlikNo2));
		*/
		
		
		
		
		
		
	}

}
