
public class RecursiveİleFibonacci {
	
		static int fibo(int n) {
			if(n == 1 || n == 2)
				return 1;
				
			return fibo(n-1) + fibo(n-2);

		}
	
	

	public static void main(String[] args) {

		// 	1 1 2 3 5 8 13 21 ...
		
		
		System.out.println(fibo(7));
		
		
		
		
		
		
		
	}

}
