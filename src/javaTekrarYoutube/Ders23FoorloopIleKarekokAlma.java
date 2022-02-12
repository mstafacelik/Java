package javaTekrarYoutube;

public class Ders23FoorloopIleKarekokAlma {

	public static void main(String[] args) {
		// for loop ile bir sayinin karekokunu hesaplayan bir program yaziniz

		// normalde bu ve benzeri matematiksel islem gerektiren sorularda Math. class
		// dan methodlar cagirilarak yapilir

		// 1.yol-->> Math. class i ile

		int sayi1 = 9;
		System.out.println(Math.sqrt(sayi1));

		// 2.yol--->> for loop ile

		int sayi2 = 16;
		double karekok = 1;

		for (double i = 0.0001; i * i <= sayi2; i += 0.01) {
			karekok = i;

		}
		System.out.println(karekok); // 3.990099999999959
		
		String format=String.format("%.3f", karekok); // %.3 -->>virgulden sonraki kismi yuvarlar
		System.out.println(format);
		
		

	}

}
