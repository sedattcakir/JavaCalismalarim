
public class Giris {

	public static void main(String[] args) {
		
		// f(x) = (x + 2) * 6
		
		/*
		f(4);
		System.out.println("İkinci metot:");
		f(8);
		*/
		
		power(2,3);
		power(6,2);
		
		
		
		
	}

	static void f(int x) {
		
		int result = (x + 2) * 6;
		System.out.println(result);
		
	}
	
	static void power(int number1, int number2) {
		int result = 1;
		
		for(int i=1; i <= number2; i++) {
			result *= number1;
		}
		System.out.println("Cevap: " + result);
	}
	
	
	
	
	
}
