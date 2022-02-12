package day40_Exception;

import java.util.Scanner;

public class C08_IllegalArgumentException {

	public static void main(String[] args) {
		// Kullanicidan yasini girmesini isteyin
		// Kodunuzu kullanici 0 dan kucuk sayi girerse Exception verecek sekilde yazin

		Scanner scan = new Scanner(System.in);
		System.out.println("Lutfen yasinizi giriniz");

		int yas = scan.nextInt();

		try {

			if (yas < 0) {
				throw new IllegalArgumentException();
			} else {
				System.out.println(yas);
			}

		} catch (IllegalArgumentException e) {
			System.out.println(e);
			System.out.println("YAs o dan kucuk olamaz!");
		}

	}

}
