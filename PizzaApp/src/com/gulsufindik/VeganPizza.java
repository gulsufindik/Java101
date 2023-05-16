package com.gulsufindik;

public class VeganPizza extends Pizza {
    public VeganPizza(String boyutu, double fiyati, String hamurTipi, Tur tur) {
        super(boyutu, fiyati, hamurTipi, tur);
    }

    @Override
    public void hazirla() {
        System.out.println("Vegan pizza hazırlanıyor...");
    }
}