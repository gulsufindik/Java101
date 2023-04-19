package com.gulsufindik.soru2;

public class Musteri {
    private String adi;
    private String soyadi;
    private int id;

    public Musteri(int id, String adi, String soyadi) {
        this.id = id;
        this.adi = adi;
        this.soyadi = soyadi;
    }

    public String getAdi() {
        return adi;
    }

    public String getSoyadi() {
        return soyadi;
    }

    public int getId() {
        return id;
    }
}