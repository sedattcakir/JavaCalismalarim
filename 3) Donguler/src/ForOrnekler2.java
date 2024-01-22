	
public class ForOrnekler2 {

	public static void main(String[] args) {
		
		// Armstrong sayıları bulan program.
		
		int temp, yuzler, onlar, birler, toplam;
		
		for(int i =100; i <= 999; i++) {
			
			temp = i;
			
			birler = temp % 10;
			temp /= 10;
			
			onlar = temp % 10;
			temp /= 10;
			
			yuzler = temp % 10;
			temp /= 10;
			
			toplam = (birler * birler * birler) + (yuzler * yuzler * yuzler) + (onlar * onlar * onlar);
			
			if(toplam == i) {
				System.out.println(i + "bir Armstrong sayıdır.");
			}

			
		}
		
		
		
		
	}

}
