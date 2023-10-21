import java.util.Scanner;

public class SwitchCase {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		
		System.out.print("Bir sayı giriniz:");
		
		int sayi1 =input.nextInt();
		
		switch (sayi1) {
		
		case 1: 
			System.out.println("Sayı 1'e eşiittir.");
			break;
		case 2: 
			System.out.println("Sayı 2'ye eşittir.");
			break;
		case 3: 
			System.out.println("Sayı 3'e eşittir.");
			break;
		case 4:
			System.out.println("Sayı 4'e eşittir.");
			break;
		
		default:
			System.out.println("Geçersiz sayı girdiniz. Lütfen 1-4 arasında bir sayı giriniz.");
		// Hiçbir case seçilmez ise default ile ekrana düzeltilmesi için bildiri gönderebilirsin.
		
		
		}
		
		
		
		
		
	}

}
