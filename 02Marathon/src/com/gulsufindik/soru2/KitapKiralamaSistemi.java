package com.gulsufindik.soru2;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class KitapKiralamaSistemi {
	
	List<Kitap> kitaplar = new ArrayList<>();
	// Kitapların listesi burada oluşturulacak
	
	public static String kitapKimTarafindanKiralanmis(List<Kitap> kitaplar, int kitapId) {
	    return kitaplar.stream()
	            .filter(k -> k.getId() == kitapId)
	            .findFirst()
	            .map(Kitap::getKiralandigiKisi)
	            .orElse(null);
	}
	
	public static List<String> kitapDahaOnceKimlerTarafindanKiralamis(List<Kitap> kitaplar, String kitapAdi) {
	    return kitaplar.stream()
	            .filter(k -> k.getAdi().equals(kitapAdi))
	            .map(Kitap::getKiralandigiKisi)
	            .collect(Collectors.toList());
	}
	
	public static List<String> ahmIleBaslayanMusterilerinListesi(List<Musteri> musteriler) {
	    return musteriler.stream()
	            .filter(m -> m.getAdi().startsWith("ahm"))
	            .map(m -> m.getAdi() + " " + m.getSoyadi())
	            .collect(Collectors.toList());
	}
	
	public static List<String> musteriKiraladigiKitaplarinListesi(List<Kitap> kitaplar, int musteriId) {
	    return kitaplar.stream()
	            .filter(k -> k.getKiralandigiKisi() != null && k.getKiralandigiKisi().equals(String.valueOf(musteriId)))
	            .map(Kitap::getAdi)
	            .collect(Collectors.toList());
	}
  
}