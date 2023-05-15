package Exam01;

import java.util.*;

public class PersonelDepolamaOrnek {
    public static void main(String[] args) {
      
        List<Personel> personelListesi = new ArrayList<>();

        Map<Integer, Personel> personelHaritasi = new HashMap<>();

        Set<Personel> personelKumesi = new HashSet<>();

        Personel personelEkle = new Personel();
        personelEkle.setPersonelID(1);
        personelEkle.setAd("Aslı");
        personelEkle.setSoyad("Güler");
        personelEkle.setAdres("İstanbul");
        personelEkle.setTelefon("555-1234");
        personelEkle.setEmail("asli.güler@example.com");

        personelListesi.add(personelEkle);

        personelHaritasi.put(personelEkle.getPersonelID(), personelEkle);

        personelKumesi.add(personelEkle);

        System.out.println("Personel Listesi:");
        for (Personel personel : personelListesi) {
            System.out.println(personel.getAd() + " " + personel.getSoyad());
        }

        System.out.println("Personel Haritası:");
        for (int personelID : personelHaritasi.keySet()) {
            Personel personel = personelHaritasi.get(personelID);
            System.out.println(personel.getAd() + " " + personel.getSoyad());
        }

        System.out.println("Personel Kümesi:");
        for (Personel personel : personelKumesi) {
            System.out.println(personel.getAd() + " " + personel.getSoyad());
        }
    }
}
