package day40_Exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class C03_Exception {

	public static void main(String[] args) {
		// verilen bir int array icin
		// kullanicidan bir sayi isteyin ve girilen sayiyi index kabul edip
		// o index deki elementi yazdrin

		int arr[] = { 2, 3, 4, 5, 8, 3, 9 };
		// ArrayIndexOutOfBoundsException
		// InputMismatchException

		try {

			Scanner scan = new Scanner(System.in);

			System.out.println("Lutfen elementi yazdrimak icin index giriniz");

			int index = scan.nextInt();

			System.out.println("Girdiginiz indexdeki element : " + arr[index]);

		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Girdiginiz index array de yok");
		} catch (InputMismatchException e) {
			System.out.println("Girdiginiz index pozitif tam sayi olmali");
		}

	}

}
