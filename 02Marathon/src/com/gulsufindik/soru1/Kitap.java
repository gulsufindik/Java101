package com.gulsufindik.soru1;

public class Kitap {
    private String adi;
    private String yazar;
    private int id;
    private EKategori kategori;
    private boolean kiradaMi;

    public Kitap(String adi, String yazar, int id, EKategori kategori) {
        this.adi = adi;
        this.yazar = yazar;
        this.id = id;
        this.kategori = kategori;
        this.kiradaMi = false;
    }

    public String getAdi() {
        return adi;
    }

    public void setAdi(String adi) {
        this.adi = adi;
    }

    public String getYazar() {
        return yazar;
    }

    public void setYazar(String yazar) {
        this.yazar = yazar;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public EKategori getKategori() {
        return kategori;
    }

    public void setKategori(EKategori kategori) {
        this.kategori = kategori;
    }

    public boolean isKiradaMi() {
        return kiradaMi;
    }

    public void setKiradaMi(boolean kiradaMi) {
        this.kiradaMi = kiradaMi;
    }
}