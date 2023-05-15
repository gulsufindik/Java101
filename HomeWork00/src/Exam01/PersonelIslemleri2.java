package Exam01;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PersonelIslemleri2 implements PersonelIslemleri {
    private Map<Integer, Personel> personeller;

    public PersonelIslemleri2() {
        personeller = new HashMap<>();
    }

    public void personelEkle(Personel personel) {
        personeller.put(personel.getPersonelID(), personel);
        System.out.println(personel.getPersonelID() + " ID'li personel eklendi.");
    }

    public void personelSil(Personel personel) {
        personeller.remove(personel.getPersonelID());
        System.out.println(personel.getPersonelID() + " ID'li personel silindi.");
    }

    public void personelGüncelle(Personel personel) {
        personeller.put(personel.getPersonelID(), personel);
        System.out.println(personel.getPersonelID() + " ID'li personel güncellendi.");
    }

    public List<Personel> findAll() {
        List<Personel> personelList = new ArrayList<>(personeller.values());
        return personelList;
    }

    public Personel findById(int id) {
        Personel personel = personeller.get(id);
        return personel;
    }

    public void deleteById(int id) {
        personeller.remove(id);
        System.out.println(id + " ID'li personel silindi.");
    }
}