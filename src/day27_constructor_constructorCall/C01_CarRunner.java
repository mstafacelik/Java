package day27_constructor_constructorCall;

import day26_forEachLoop_Constructer.Car;

public class C01_CarRunner {

	public static void main(String[] args) {
		// Dunku car class indan bir obje olusturmak istedimizde
		// Java Car class ini icinde bulunduguz class
		// 
		
		Car car=new Car();
		
		System.out.println(car.yil);
		
		/// ancak baska package da oldugu ucun icinde oldugumuz class tan
		// Car class ndaki variab lara ulasabilmem icin variable larin axcess modifier i 
		// public olmalidir
		
		Car1 car1=new Car1();
		System.out.println(car1.km + " " + car1.model + " " + car1.renk + " " + car1.yil + " " + car1.satilikMi); 
		// 0 null null 2000 false
		
		
		car1.km=75000;
		car1.model="Corolla";
		car1.renk= "Kirmizi";

		System.out.println(car1.km + " " + car1.model + " " + car1.renk + " " + car1.yil + " " + car1.satilikMi);
		//75000 Corolla Kirmizi 2000 false
		
		Car1 car2=new Car1();
		
		System.out.println(car2.km + " " + car2.model + " " + car2.renk + " " + car2.yil + " " + car2.satilikMi);
		//0 null null 2000 false
		
		// objeler farkli olunca ozellikler sifirdan baslar. yani yeni obje eski kalip(Car1 class i)
		
		Car1 car3=new Car1();
		
		car3.km=40000;
		car3.satilikMi=true;
		
		System.out.println(car3.km + " " + car3.model + " " + car3.renk + " " + car3.yil + " " + car3.satilikMi);
		// 40000 null null 2000 true
		
		
		
		
		
	}

}
