package day24_arrayList;

import java.util.ArrayList;
import java.util.List;

public class C01_ArrayList {

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		
		//list olusturalim
		
		ArrayList<String> isimList = new ArrayList<>();
		ArrayList<String> isimList2 = new ArrayList<String>();
		
		// bazen esitligin sag tarafindaki elmas icine data turu yazilmazsa sorun cikabiliyor
		// ama genelde sorun cikmaz. biz de list olustururken sag tarafta data turunu yazmayiz
		
		// List<String> isimList3 = new List<>();
		// esitligin sag tarafinda List<> yazamayiz
		
		List<Integer> sayilar=new ArrayList<>(); 
		// Integer yerine ornegin int, boolean yazamayiz. Wrapper yaptik
		// List data turu olarak primitiv leri kabul etmez.


	}

}
