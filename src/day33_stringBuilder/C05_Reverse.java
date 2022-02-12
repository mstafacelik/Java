package day33_stringBuilder;

public class C05_Reverse {

	public static void main(String[] args) {
		// verilen bir cumleyi tersten yazdiralim
		// reverse=umkehren
		
		StringBuilder sb=new StringBuilder("Java ne kadar kolay");
		
		sb.reverse();
		
		System.out.println(sb); // yalok radak en avaJ 
		
		
		//*** verilen bir seyi 3 sekilde tersten yazdirabiliriz***
		
		// 1- foor loop ile
		// 2- Array i split ederek(parcalara ayirarak)
		// 3- StringBuilder reverse ile

	}

}
