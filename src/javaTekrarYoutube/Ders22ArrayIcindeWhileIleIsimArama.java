package javaTekrarYoutube;

public class Ders22ArrayIcindeWhileIleIsimArama {

	public static void main(String[] args) {

		String[] isimler = { "Ali", "Veli", "Ahmet", "Serkan", "Can" };

		int index = 0;
		while (index < isimler.length) {

			if (isimler[index].equals("Ahmet")) {
				System.out.println("Ahmet ismi Array icinde var");

			}
			index++;

		}

	}

}
