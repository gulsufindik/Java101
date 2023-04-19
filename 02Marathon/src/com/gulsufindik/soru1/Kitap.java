package com.gulsufindik.soru1;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Kitap {
    private String kitapAdi;
    private String yazar;
    private String yayinevi;
    private int kitapID;
    private boolean kiradaMi;

    public Kitap(String kitapAdi, String yazar, String yayinevi, int kitapID) {
        this.kitapAdi = kitapAdi;
        this.yazar = yazar;
        this.yayinevi = yayinevi;
        this.kitapID = kitapID;
        this.kiradaMi = false;
    }

    public String getKitapAdi() {
        return kitapAdi;
    }

    public void setKitapAdi(String kitapAdi) {
        this.kitapAdi = kitapAdi;
    }

    public String getYazar() {
        return yazar;
    }

    public void setYazar(String yazar) {
        this.yazar = yazar;
    }

    public String getYayinevi() {
        return yayinevi;
    }

    public void setYayinevi(String yayinevi) {
        this.yayinevi = yayinevi;
    }

    public int getKitapID() {
        return kitapID;
    }

    public void setKitapID(int kitapID) {
        this.kitapID = kitapID;
    }

    public boolean isKiradaMi() {
        return kiradaMi;
    }

    public void setKiradaMi(boolean kiradaMi) {
        this.kiradaMi = kiradaMi;
    }
}