import java.util.Scanner;

public class DoWhileOrnek1 {

	public static void main(String[] args) {

	
		Scanner scan = new Scanner(System.in);
	
		int input, toplam=0;
		do {
			System.out.print("Lütfen bir sayı giriniz: "); 
			input = scan.nextInt();
			if(input % 2 == 1) {
					toplam += input;
			}
		}while(input>0);
		
		System.out.println("Girilen tek sayıların toplamı: " + toplam);
		
		
		
		
	}

}
