package day40_Exception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class C05_ParentChildExceptions {

	public static void main(String[] args) {
		try {
			FileInputStream fis = new FileInputStream("src\\day40\\yazi1.txt");
		} catch (FileNotFoundException e) {

			e.printStackTrace();
		}
		System.out.println("Gorev tamamlandi");
	}

}
