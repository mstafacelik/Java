package day38_overridding;

public class Animals {

	public static void main(String[] args) {
	

	}
	
	// burda hareket methodu Overridden ( gecersiz kilinmis) cumku child class ta da ayni isimde method var
	public void hareket() {
        System.out.println("Tum hayvanlar hareket eder");
    }
    
    public void beslenme() {
        System.out.println("Tum hayvanlar beslenir");
    }
    
    public void solunum() {
        System.out.println("Tum hayvanlar nefes alir");
    }
}