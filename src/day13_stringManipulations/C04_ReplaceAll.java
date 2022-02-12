package day13_stringManipulations;

public class C04_ReplaceAll {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		String str= "*Java 98ogrenmek c..ok k876olay" ;
		
		
		// replaceAll methodlari kullanarak Java ogenmek cok kolay yapalim
		
		
		
		
		str=str.replaceAll("\\d", "") ;  // *Java ogrenmek c..ok kolay
		
										//d --->>> digit yani rakam demekmis
		 
		str=str.replaceAll("\\s", "x");  // Javaxogrenmekxcokxkolay
		
					
		str=str.replaceAll("\\W", "");   // Javaxogrenmekxcokxkolay
	
		
		str=str.replace("x", " ") ; 
		System.out.println(str);       //Java ogrenmek cok kolay
		
		
		
		//    \\s space(bosluk) tusu,    			    \\S bosluk disindaki tum karakterler
		//	  \\w harfler ve rakamlar(a-z, A-Z, 0-9)    \\W harfler ve rakamlar disindaki tum karakterler
		//    \\d rakamlar(0-9)							\\D rakamlar disindaki tum karakterler
		
		
		
		
		// replace() methodunda char kullanilabilir, replaceAll()’da char kullanilamaz
		
		
		
		
		
	}

}
