import java.util.Scanner;

public class WhileOrnek2 {

	public static void main(String[] args) {
 
		
		
		/* Örnek1
		 Scanner scan = new Scanner(System.in);
		int i = 1;
		while(i<=100) {
			
			if(i % 2 ==0 ) {
				System.out.println(i);
			}
			i++;
			
			
		}
*/
		

	    /* Örnek2
	    
	    Scanner scan = new Scanner(System.in);
		int toplam = 0;
		int input;
		
		while(true) {
			
			System.out.print("Lütfen bir sayı giriniz: ");
				
			input = scan.nextInt();
			
			
			if(input<0) {
				System.out.println("Program sonlandı. Negatif sayı girdiniz!!");
				System.out.println("Girilen tek sayıların toplamı: " + toplam );
				break;
			}
			
		
			if(input % 2 == 1) {
				
				toplam += input;
				System.out.println("");
				
			} 
			
			
		}
		
*/		
		/*
		 Örnek3
		Scanner scan = new Scanner(System.in);
		System.out.print("Bir sayı giriniz: ");
		int input = scan.nextInt();
		int k = 1;
		
		while(k <= input) {
			System.out.println(k);
			k = k * 2;
		}
		*/
			
	}

}
