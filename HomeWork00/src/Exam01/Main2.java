package Exam01;
import java.util.Scanner;

public class Main2 {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        PersonelTakipSistemi takipSistemi = new PersonelTakipSistemi();
        
        while (true) {
            System.out.println("Personel Takip Sistemi");
            System.out.println("1. Personel İşlemleri");
            System.out.println("   1.1. Personel Ekleme");
            System.out.println("   1.2. Personel Listesi");
            System.out.println("   1.3. Personel Düzenleme");
            System.out.println("   1.4. Departman Ekleme");
            System.out.println("   1.5. Departman Listesi");
            System.out.println("2. Muhasebe İşlemleri");
            System.out.println("   2.1. Maaş Personel Tanımlama");
            System.out.println("   2.2. Ödeme Listesi");
            System.out.println("3. Raporlamalar");
            System.out.println("   3.1. Departman Personel Listesi");
            System.out.println("   3.2. En Çok Personel Bulunan Departman");
            System.out.println("   3.3. Departmanlara Göre Maaş Ortalamaları");
            System.out.println("   3.4. Müdürlerin Sorumlu Olduğu Departman Listesi");
            System.out.println("   3.5. Kayıt Tarihlerine Göre Personellerin Sıralı Listesi");
            System.out.println("   3.6. Aynı Gün İçinde İşe Başlayan Personellerin Listesi");
            System.out.println("ÇIKIŞ");
            
        }
	}
}
