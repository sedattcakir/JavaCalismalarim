import java.util.Scanner;

public class BuyuktenKucugeSiralama {

	public static void main(String[] args) {
		// a > b > c veya a > c > b
		// b > a > c veya b > c > a
		// c > a > b veya c > b > a
		
		int a,b,c;
		
		Scanner scan = new Scanner(System.in);
		
		
		System.out.print("Bir a sayısı giriniz: ");
		a = scan.nextInt();
		System.out.print("Bir b sayısı giriniz: ");
		b = scan.nextInt();
		System.out.print("Bir c sayısı giriniz: ");
		c = scan.nextInt();
		
		if(a>b && b>c) {
			System.out.println("Sıralama: a>b>c");
		}else if(a>c && c>b){
			System.out.println("Sıralama: a>c>b");
			
		}else if(b>a && a>c) {
			System.out.println("Sıralama: b>a>c");
		
		}else if(b>c && c>a) {
			System.out.println("Sıralama: b>c>a");
		}else if(c>a && a>b) {
			System.out.println("Sıralama: c>a>b");
		}else if(c>b && b>a) {
			System.out.println("Sıralama: c>b>a");
		}
		
		
		
		
		
		
		
		
		

	}

}
