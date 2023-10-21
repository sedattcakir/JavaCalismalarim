 	import java.util.Scanner;
public class Ornek3 {

	public static void main(String[] args) {

		int r;
		double alan, hacim, pi = 3.14;
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Lütfen Dairenin yarı çapını giriniz: ");
			
			r = input.nextInt();
			
			alan = 2 * pi * r;
			hacim = pi * (r*r);
			
			System.out.println("Dairenin alanı: " + alan);
		    System.out.println("Dairenin hacmi: " + hacim);
			
	}

}
