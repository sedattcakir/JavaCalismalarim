import java.util.Scanner;

public class SinifAtlama {

	public static void main(String[] args) {
	//Türkçe, matematik, fen bilgisi, sosyal bilgisi,beden eğitimi notları girilsin.
	//notların ortalaması hesaplansın
	//ortalama 50'den büyükse geçer küçükse kalır

	int turkce, matematik, fenBilgisi,sosyalBilgisi,bedenEgitimi;
	double ortalama;
	Scanner scan = new Scanner(System.in);
	
	System.out.print("Lütfen Türkçe notunu giriniz: ");
		turkce = scan.nextInt();
	System.out.print("Lütfen Matematik notunu giriniz: ");
		matematik = scan.nextInt();
	System.out.print("Lütfen Fen Bilgisi notunu giriniz: ");
		fenBilgisi = scan.nextInt();
	System.out.print("Lütfen Sosyal Bilgiler notunu giriniz: ");
		sosyalBilgisi = scan.nextInt();
	System.out.print("Lütfen Beden eğitimi notunu giriniz: ");
		bedenEgitimi = scan.nextInt();
		
		ortalama = (turkce + matematik + fenBilgisi + sosyalBilgisi + bedenEgitimi) / 5;
		
		System.out.println("Ortalamanız: " + ortalama);
		
		if(ortalama >= 50) {
			System.out.print("\n Sınıfı geçtiniz. Başarılar...");
		}else {
			System.out.println("Sınıfta kaldınız. Geçmiş olsun...");
		}
				
		
		
		
		
	}

}
