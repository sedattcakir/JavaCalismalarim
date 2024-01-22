
public class ReturnMetotlar {
	
	static int power(int number1, int number2) {
		int result = 1;
		
		for(int i=1; i <= number2; i++) {
			result *= number1;
		}
		return result;
	}

		// Döndüreceğimiz verinin tipine göre void yerine döndüreceğimiz verinin tipini yazmamız gerekiyor.
	public static void main(String[] args) {
		
		int r2 = power(10,2);
		
		System.out.println(r2);
	
		
		

	}

}
