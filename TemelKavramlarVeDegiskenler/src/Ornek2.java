	import java.util.Scanner;

public class Ornek2 {

	public static void main(String[] args) {

		double tutar, kdvliFiyat, kdv = 0.18;
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Ürünün fiyatını giriniz: ");
		
		tutar = input.nextDouble();
		kdvliFiyat = tutar + (tutar * kdv);
		System.out.println("Fiyat: " + kdvliFiyat);
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}

}
