package day36_inheritance;

// asagida 2 class var.(ikiden fazla da yapmak da mumkun) ama sadece bir tanesi public olabilir.

class Derived {
	public Derived(String temp) {
	System.out.println("Derived Class : " + temp);
}
}



public  class Test01 extends Derived{

	public Test01(String temp) {
		super(temp);
		System.out.println("Test Class : " + temp);
	}
	public static void main(String[] args) {
		Test01 obj=new Test01("Esra");
	}
		
	}
