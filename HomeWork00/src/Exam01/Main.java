package Exam01;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        PersonelIslemleri2 personelIslemleri = new PersonelIslemleri2();

        Personel personel1 = new Personel(1, "Şirin", "Baba", 1234667,5326985, "Karşıyaka");
        Personel personel2 = new Personel(2, "Sindirella", "Paris", 1234667,5326985, "Karşıyaka");
        Personel buroPersoneli1 = new BuroPersoneli( "Aylin", "Bulut",12345678 ,5559012, "Bolu", "A-101");
        Personel buroPersoneli2 = new BuroPersoneli( "Fatma", "Köşk", 1236487, 5553456, "Edirne", "B-202");

        personelIslemleri.personelEkle(personel1);
        personelIslemleri.personelEkle(personel2);
        personelIslemleri.personelEkle(buroPersoneli1);
        personelIslemleri.personelEkle(buroPersoneli2);

        List<Personel> personeller = personelIslemleri.findAll();
        System.out.println("Tüm personeller:");
        for (Personel personel : personeller) {
            System.out.println(personel.toString());
        }

        Personel arananPersonel = personelIslemleri.findById(3);
        if (arananPersonel != null) {
            System.out.println("Aranan personel:");
            System.out.println(arananPersonel.toString());
        } else {
            System.out.println("Aranan personel bulunamadı.");
        }

        personelIslemleri.deleteById(2);

        buroPersoneli1.setTcNo("C-303");
        personelIslemleri.personelGuncelle(buroPersoneli1);

        personeller = personelIslemleri.findAll();
        System.out.println("Tüm personeller (güncelleme ve silme işlemleri yapıldıktan sonra):");
        for (Personel personel : personeller) {
            System.out.println(personel.toString());
        }
    }
}
