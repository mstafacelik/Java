package day11_stringManupilations;

public class C02_EqualsIgnorCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// equalsIgnorecase iki stringi karsilastirirken case sensitive olmadan kiyaslama yapar.
		
		
		String str1= "ali" ;
		String str2= "can" ;
		String str3= "Ali Can" ;
		String str4= str1 + " " + str2;
		   
		System.out.println(str4);   //ali can
		System.out.println(str3==str4); // false, hem degerler hem de referanslar farkli
		System.out.println(str3.equals(str4)); //false
		
		System.out.println(str3.equalsIgnoreCase(str4)); 
		//equalsIgnorecase buyuk harf kucuk harf farkini ortadan kaldiriyor. 
		//yani case sentive degil. Ancak bunun disinda arada bosluk vs olursa yine false olur. Ali den sonra bosluk olmasi gibi
	    // bu durumda deger ayni oluyor ve output true olur.
		
		
		
	}

}
