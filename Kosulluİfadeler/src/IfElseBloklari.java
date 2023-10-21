
public class IfElseBloklari {

	public static void main(String[] args) {

		int a = 70;
		int b = 60;
		int c = 50;
		
		/*
		if(a==b) {
			
			System.out.println("A ile B eşittir.");
			
		}
		
		else if (a>c) {
			System.out.println("A sayısı C'den büyüktür.");
		}
		
		else {
			
			System.out.println("C sayısı en büyüktür.");
		}
		
		*/
		
		if((a<b)&&(a<c)) {
			
			System.out.println("A en küçük sayıdır.");
		}
		else if((b<a)&&(b<c)) {
			
			System.out.println("B en küçük sayıdır.");
		}
		
		else {
			System.out.println("C en küçük sayıdır.");
		}
		
		
		
		
		
		
		
		
		
	}

}
