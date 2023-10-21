import java.util.Scanner;

public class KullaniciGirisi {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		String k_adi,parola;
		System.out.print("Kullanıcı adınızı giriniz: ");
		k_adi = scan.nextLine();
		System.out.print("Parolanızı giriniz: ");
		parola = scan.nextLine();
		
		if(k_adi.equals("sedatenes")&& parola.equals("1234")) {
			System.out.println("Başarılı bir giriş yaptınız.");
		}else {
			System.out.println("Kullanıcı adınız veya parolanız hatalı.");
		}
		
	}

}


//string için if else değişkeni kullanacaksak örnekteki gibi yapmamız gerekiyor.