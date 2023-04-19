package com.gulsufindik.soru1;

public class Kasiyer {
    private String ad;
    private String soyad;
    private int kasiyerID;

    public Kasiyer(String ad, String soyad, int kasiyerID) {
        this.ad = ad;
        this.soyad = soyad;
        this.kasiyerID = kasiyerID;
    }

    // Getter ve setter metotları
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
 
    public int getKasiyerID() {
        return kasiyerID;
    }

    public void setKasiyerID(int kasiyerID) {
        this.kasiyerID = kasiyerID;
    }
    
}
    
    
    
    