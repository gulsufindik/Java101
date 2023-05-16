package com.gulsufindik;

public class KlasikPizza extends Pizza {
    public KlasikPizza(String boyutu, double fiyati, String hamurTipi, Tur tur) {
        super(boyutu, fiyati, hamurTipi, tur);
    }

    @Override
    public void hazirla() {
        System.out.println("Klasik pizza hazırlanıyor...");
    }
}
