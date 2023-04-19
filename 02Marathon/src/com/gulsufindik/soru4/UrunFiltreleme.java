package com.gulsufindik.soru4;
import java.util.ArrayList;
import java.util.HashMap;

public class UrunFiltreleme {
    public static void main(String[] args) {
        ArrayList<Urun> urunler = new ArrayList<>();
        urunler.add(new Urun("Bebe bisküvisi", 20.0));
        urunler.add(new Urun("Nesquik", 30.0));
        urunler.add(new Urun("Süpriz yumurta", 40.0));
        urunler.add(new Urun("NUTELAAAA", 50.0));
        urunler.add(new Urun("Krep", 60.0));
        
        double minFiyat = 25.0;
        double maxFiyat = 55.0;
        
        HashMap<String, Double> filtrelenmisUrunler = new HashMap<>();
        
        for (Urun urun : urunler) {
            if (urun.getFiyat() >= minFiyat && urun.getFiyat() <= maxFiyat) {
                filtrelenmisUrunler.put(urun.getAd(), urun.getFiyat());
            }
        }
        
        for (String ad : filtrelenmisUrunler.keySet()) {
            System.out.println("Ürün adı: " + ad + ", Fiyatı: " + filtrelenmisUrunler.get(ad));
        }
    }
}