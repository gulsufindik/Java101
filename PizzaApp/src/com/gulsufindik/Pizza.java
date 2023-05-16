package com.gulsufindik;
/*
 * Boyutu
 * fiyatı
 * hamurtipi
 * tur
 * 
 * 2 tane alt sınıf oluşturalım VeganPizza KlasikPizza gibi
 * daha sonra bir factory sınıf oluşturacağız
 * pizza seç metodunda yaptığımız seçimlere göre factory sınıfı bize bir pizza oluşturacak
 * 
 * Pizza sipariş sınıfı oluşturacağız burda kullanıcıdan pizzanın özelliklerini seçmesini isteyeceğiz
 * 
 * bu bilgilerle beraber bize bir pizza hazırlanıcak
 */

public abstract class Pizza {
    protected String boyutu;
    protected double fiyati;
    protected String hamurTipi;
    protected Tur tur;

    public Pizza(String boyutu, double fiyati, String hamurTipi, Tur tur) {
        this.boyutu = boyutu;
        this.fiyati = fiyati;
        this.hamurTipi = hamurTipi;
        this.tur = tur;
    }

   public abstract void hazirla();

    public String getBoyutu() {
        return boyutu;
    }

    public double getFiyati() {
        return fiyati;
    }

    public String getHamurTipi() {
        return hamurTipi;
    }

    public Tur getTur() {
        return tur;
    }
}
