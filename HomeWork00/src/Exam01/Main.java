package Exam01;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        
        List<Personel> personelList = new ArrayList<Personel>();
        
        personelList.add(new Hizmetli("Gülsu", "Fındık", "12345678901", "555-1234567", "İstanbul", "Temizlik"));
        personelList.add(new BuroPersoneli("Efe", "Aksoy", "23456789012", "555-2345678", "Ankara", "Sekreter"));
        personelList.add(new InsanKaynaklariPersoneli("Hülya", "Martlı", "34567890123", "555-3456789", "İzmir", "İK Uzmanı"));
        personelList.add(new TeknikPersonel("Berk", "Aktaş", "45678901234", "555-4567890", "Bursa", "Teknik Destek"));
        personelList.add(new MuhasebePersoneli("Doruk", "Yıldız", "56789012345", "555-5678901", "Adana", "Muhasebe Müdürü"));
        personelList.add(new Mudur("Deniz", "Yaman", "67890123456", "555-6789012", "Antalya", "Pazarlama"));
        personelList.add(new GenelMudur("Aylin", "Koç", "78901234567", "555-7890123", "Eskişehir", "ABC Holding"));

        // Departman nesneleri oluşturuldu
        Departman pazarlama = new Departman("Pazarlama", "Betüş Yılmaz");
        Departman teknik = new Departman("Teknik", "Ayşin Özel");
        Departman muhasebe = new Departman("Muhasebe", "Dilara Korkmaz");
        
        // Departman bilgileri map'te saklandı
        Map<String, Departman> departmanlar = new HashMap<String, Departman>();
        departmanlar.put(pazarlama.getAd(), pazarlama);
        departmanlar.put(teknik.getAd(), teknik);
        departmanlar.put(muhasebe.getAd(), muhasebe);
        
        // Personel nesnelerinin departmanları set'e saklandı
        Set<Departman> departmanSet = new HashSet<Departman>();
        departmanSet.add(pazarlama);
        departmanSet.add(teknik);
        departmanSet.add(muhasebe);
        
        // Personel listesi, departmanlar map'i ve departmanlar set'i yazdırıldı
        System.out.println("Şirket çalışanları:");
        for (Personel personel : personelList) {
            System.out.println(personel.getAd() + " " + personel.getSoyad() + " - " + personel.getClass());
        }
        
        System.out.println("\nDepartmanlar:");
        for (Departman departman : departmanlar.values()) {
            System.out.println(departman.getAd() + " - Mudur: " + departman.getMudur());
        }
        
        System.out.println("\nPersonellerin çalıştığı departmanlar:");
        for (Personel personel : personelList) {
            System.out.println(personel.getAd() + " " + personel.getSoyad() + " - Departmanlar: " + personel.getDepartmanlar());
        }
    }
}