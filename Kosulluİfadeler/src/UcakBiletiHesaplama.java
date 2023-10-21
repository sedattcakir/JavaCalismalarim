import java.util.Scanner;

public class UcakBiletiHesaplama {

	public static void main(String[] args) {
		// Km birim fiyatı: 0.10$
		//12 yaşından küçükse toplam fiyata %50 indirim.
		//12 ve 24 yaş aralığındaysa %10 indirim.
		//65 yaşından bütükse %30 indirim.
		//Gidiş dönüş alırsa %20 indirim.
		//Bu koşullara göre uçak bileti hesaplayan program.
		
		Scanner scan = new Scanner(System.in);
		
		int km,yas,tip;
		System.out.print("Mesafeyi giriniz(Km cinsinden): ");
		km = scan.nextInt();
		System.out.print("\nYaşınızı giriniz: ");
		yas = scan.nextInt();
		System.out.print("\nYolculuk tipinizi giriniz(1= Tek gidiş, 2= Gidiş-Dönüş): ");
		tip = scan.nextInt();
		
		double normalFiyat,yasİndirimi,tipİndirimi;

		
		if(km > 2 && yas > 0 && (tip == 1 ||tip == 2)) {
			normalFiyat = km * 0.10;
			if(yas<12) {
				yasİndirimi = normalFiyat * 0.5; //İndirim oranını hesaplıyoruz.
				
			}else if( yas>= 12 && yas<=24) {
					yasİndirimi = normalFiyat * 0.10;
			}else if(yas>=65) {
				yasİndirimi = normalFiyat * 0.30;
			}else {
				yasİndirimi = 0;
			}
			normalFiyat = normalFiyat - yasİndirimi; // Fiyattan indirimi düşüyoruz.
		
				if(tip == 2 ) {
					tipİndirimi = normalFiyat * 0.20;
					normalFiyat = (normalFiyat - tipİndirimi) * 2;
				}
		
				System.out.println("Bilet Tutarı: " + normalFiyat + "$");
		
		}else {
			System.out.println("Girdiler yanlış. Tekrar giriniz.");
		}
		
		
		
		
	}

}
