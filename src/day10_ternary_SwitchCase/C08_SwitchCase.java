package day10_ternary_SwitchCase;

public class C08_SwitchCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// gun numarasina gore hafta ici veya haftasonu yazdiralim
		
        int gunNo=1;
		
		switch(gunNo) {
		
		case 1 :			//hepsini tek tek yazmaya gerek yok. case 1 den sonra asagi dogru gidip
							// case 5 e kadar gider
		case 2 :
		case 3 :
		case 4 :
		case 5 :
			System.out.println("Haftaici");
			break ;
		case 6 :
		case 7 : 
			System.out.println("Haftasonu");
			break;
	
			default:
			System.out.println("Lutfen gecerli bir gun numarasi yaziniz");
			
			//break komutu yapacagimiz islem bittiginde switch statement’in sonuna gitmemizi
			//saglar.Java istenen case’e gittikten sonra break komutunu gorene kadar tum case’leri calistirir.
		}
	}

}
