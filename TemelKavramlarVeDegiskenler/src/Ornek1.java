import java.util.Scanner;

public class Ornek1 {

	public static void main(String[] args) {


		int vize,but,quiz;
		double ortalama;
		
		
		Scanner scan = new Scanner(System.in);
	
		
	System.out.print("Vize notunu giriniz: ");
			vize = scan.nextInt();
	
	System.out.print("Bütünleme notunu giriniz: ");
			but = scan.nextInt();
	
	System.out.println("Quiz notunu giriniz: ");
			quiz = scan.nextInt();
			
	ortalama = (quiz * 0.2) + (vize * 0.35) + (but * 0.45);
	
	System.out.println("Not ortalaması: " + ortalama);
	
	String sonuc = (ortalama >= 50) ? "Geçtiniz" : "Kaldınız";
	
	System.out.println(sonuc);
	
		
		
	}

}
