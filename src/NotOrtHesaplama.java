import java.util.Scanner;

public class NotOrtHesaplama {
	public static void main(String[] args) {
		int matematik, fizik, kimya, turkce, tarih, muzik;
		
		Scanner klavye = new Scanner(System.in);
		
		System.out.println("Matematik notunuzu giriniz: ");
		matematik = klavye.nextInt();
		
		System.out.println("Fizik notunuzu giriniz: ");
		fizik = klavye.nextInt();
		
		System.out.println("Kimya notunuzu giriniz: ");
		kimya = klavye.nextInt();
		
		System.out.println("Turkce notunuzu giriniz: ");
		turkce = klavye.nextInt();
		
		System.out.println("Tarih notunuzu giriniz: ");
		tarih = klavye.nextInt();
		
		System.out.println("Muzik notunuzu giriniz: ");
		muzik = klavye.nextInt();
		
		int toplam = (matematik+fizik+kimya+turkce+tarih+muzik);
		double sonuc= toplam / 6;
		
		System.out.println("Ortalamaniz: " + sonuc);
		
		boolean gecti = (sonuc>=60);
		boolean kaldi = (sonuc<60);
		
		String sınıfGecmeDurumu = (gecti)? "Sinifi gecti":"Sinifta kaldi";
		System.out.println("Sinifi Gecme Durumu: " +sınıfGecmeDurumu);
		
				
	}

}
