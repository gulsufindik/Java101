package Exam01;

import java.util.List;
import java.util.ArrayList;

public abstract class Personel {
    private String ad;
    private String soyad;
    private String tcNo;
    private String telefon;
    private String adres;
    private List<Departman> departmanlar;

    public Personel(String ad, String soyad, String tcNo, String telefon, String adres) {
        this.ad = ad;
        this.soyad = soyad;
        this.tcNo = tcNo;
        this.telefon = telefon;
        this.adres = adres;
        departmanlar = new ArrayList<>();
    }

    public String getAd() {
        return ad;
    }

    public void setAd(String ad) {
        this.ad = ad;
    }

    public String getSoyad() {
        return soyad;
    }

    public void setSoyad(String soyad) {
        this.soyad = soyad;
    }

    public String getTcNo() {
        return tcNo;
    }

    public void setTcNo(String tcNo) {
        this.tcNo = tcNo;
    }

    public String getTelefon() {
        return telefon;
    }

    public void setTelefon(String telefon) {
        this.telefon = telefon;
    }

    public String getAdres() {
        return adres;
    }

    public void setAdres(String adres) {
        this.adres = adres;
    }
	
	public List<Departman> getDepartmanlar() {
        return departmanlar;
    }

    public void setDepartmanlar(List<Departman> departmanlar) {
        this.departmanlar = departmanlar;
    }

    public void departmanEkle(Departman departman) {
        departmanlar.add(departman);
    }
}