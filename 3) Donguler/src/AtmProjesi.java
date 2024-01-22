import java.util.Scanner;

public class AtmProjesi {

	public static void main(String[] args) {

		
		Scanner scan = new Scanner(System.in);
		
		int bakiye = 20000, input, miktar;
		
		System.out.println("Çakır Bankasına Hoşgeldiniz!!!");
		System.out.println("Güncel bakiyeniz: " + bakiye + "TL");
		
		while (bakiye >0) {
			System.out.println();
			System.out.println("1) Para Yatırma");
			System.out.println("2) Para Çekme");
			System.out.println("3) Bakiye Sorgulama");
			System.out.println("4) Çıkış");
			System.out.print("Lütfen yapmak istediğiniz işlemi giriniz:");
			input = scan.nextInt();
			
			if(input==1) {
				System.out.println("Lütfen yatırmak istediğiniz tutarı giriniz: ");
				miktar = scan.nextInt();
				bakiye += miktar;
			}else if(input==2) {
				System.out.println("Lütfen çekmek istediğiniz miktarı giriniz: ");
				miktar = scan.nextInt();
				if(miktar > bakiye) {
					System.out.println("Yetersiz Bakiye");
				}else {
					bakiye-=miktar;
				}
			}else if(input==3) {
				System.out.println("Güncel bakiyeniz: "  + bakiye);
			
			}else if(input==4) {
				System.out.println("Çıkış yapılıyor!!!");
				
			}else {
				System.out.println("Geçersiz tuş basımı gerçekleşti!!!");
			}
			
			
			System.out.println("Tekrar bekleriz!!!");
			
			
			
			
			
		}
		
		
		
		
		
		
		
		
	}

}
