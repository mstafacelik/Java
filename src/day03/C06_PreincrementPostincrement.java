package day03;

public class C06_PreincrementPostincrement {

	public static void main(String[] args) {
		
		//preIncrement ve postIncrement sadece sayi ++ veya sayi -- yazimi icin gecerlidir
		int sayi=10 ; 
		
		sayi++;
		sayi++;
		sayi++;
		
		System.out.println(sayi); //13

		
		System.out.println(sayi++); // bu satirda iki islem var
									//bir artirma var, bir de yazdirma 
		
		System.out.println(sayi);
		
		//once artirmak sonra yazdirmak isterseniz ++sayi yazmaliyiz
		//once yazdirmak sonra yazdirmak isterseniz sayi++
		
		
		System.out.println(++sayi);//15
		
		
	}

}
