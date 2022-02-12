package day40_Exception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class C04_FileInputStream {

	public static void main(String[] args) throws FileNotFoundException {
		// Javada bir dosyaya ulasmak istedigimizde FileInputStream class indan yardim aliriz.

		FileInputStream fis = new FileInputStream("src\\day40\\yazi.txt");
		
		// Java bu kodda olasi bir problem ongoruyor
		// ve bu probleme karsi ne yapmasi gerektigini bize soruyor
		// ( Yani alti cizilen her kod CTE degildir)
		
		// Bunun icin 2 durum sozkonusu : 
		// 1- try catch kullanarak bu problemi HANDLE edip javanin yoluna devam etmesini saglayabiliriz.
		// 2- Eger dosya okunamamiyorsa kod calismasin istiyorsaniz olayin farkinda oldugumuzu 
		// ve sorumlulugun bizde oldugunu java ya soylemeliyiz.
		
		System.out.println("Gorev tamamlandi");

	}

}
