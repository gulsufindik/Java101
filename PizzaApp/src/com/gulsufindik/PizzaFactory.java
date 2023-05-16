package com.gulsufindik;

class PizzaFactory {
    public static Pizza pizzaSec(String tur, String boyutu) {
        Tur pizzaTur = Tur.valueOf(tur.toUpperCase());

        if (pizzaTur == Tur.VEJETARYEN) {
            return new VeganPizza(boyutu, 15.0, "İnce", pizzaTur);
        } else {
            return new KlasikPizza(boyutu, 20.0, "Kalın", pizzaTur);
        }
    }
}