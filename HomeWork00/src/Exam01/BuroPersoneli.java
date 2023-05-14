package Exam01;

public class BuroPersoneli extends Personel {
    private String birim;

    public BuroPersoneli(String ad, String soyad, String tcNo, String telefon, String adres, String birim) {
        super(ad, soyad, tcNo, telefon, adres);
        this.birim = birim;
    }

    public String getBirim() {
        return birim;
    }

    public void setBirim(String birim) {
        this.birim = birim;
    }
}
