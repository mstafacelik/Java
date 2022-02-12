package java_GrupCalismasi;

import java.util.Scanner;

public class C01 {

	public static void main(String[] args) {
		
		// Write a Java Program to reverse a string without using String inbuilt
				// function reverse().
				// bir dizeyi tersine çevirmek için bir Java Programı yazın, for ile.

				Scanner scan=new Scanner (System.in);
				
				System.out.println("lutfen bir cumle giriniz");
				
				String cumle=scan.nextLine();
				
				for (int i = cumle.length()-1; i>=0; i--) {
					
					// System.out.print(cumle.charAt(i));  ----> 1. yontem
					System.out.print(cumle.substring(i, i+1)); //----->2. yontem
					
				}
				

			}

		}
