package com.gulsufindik.soru1;

public class Musteri {
    private String ad;
    private String soyad;
    private String adres;
    private int musteriID;

    public Musteri(String ad, String soyad, String adres, int musteriID) {
        this.ad = ad;
        this.soyad = soyad;
        this.adres = adres;
        this.musteriID = musteriID;
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

    public String getAdres() {
        return adres;
    }

    public void setAdres(String adres) {
        this.adres = adres;
    }

    public int getMusteriID() {
        return musteriID;
    }

    public void setMusteriID(int musteriID) {
        this.musteriID = musteriID;
    }
}