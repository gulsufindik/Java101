package com.gulsufindik.soru2;

import java.util.List;
import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {

		Kitap kitap1 = new Kitap(1, "Kırmızı Balık", "Ayşe Güler");
		Kitap kitap2 = new Kitap(2, "Suç ve Ceza", "Dostoyevski");
		Kitap kitap3 = new Kitap(3, "Sefiller", "Hugo");

		List<Kitap> kitaplar = new ArrayList<>();
		kitaplar.add(kitap1);
		kitaplar.add(kitap2);
		kitaplar.add(kitap3);

		Musteri musteri1 = new Musteri(1, "gülsu", "fındık");
		Musteri musteri2 = new Musteri(2, "ahmet", "demir");
		Musteri musteri3 = new Musteri(3, "aslı", "güler");

		List<Musteri> musteriler = new ArrayList<>();
		musteriler.add(musteri1);
		musteriler.add(musteri2);
		musteriler.add(musteri3);


		System.out.println("Kitap 1 Kim Tarafından Kiralanmış? : "
				+ KitapKiralamaSistemi.kitapKimTarafindanKiralanmis(kitaplar, 1));
		System.out.println("Kırmızı Balık Daha Önce Kimler Tarafından Kiralanmış? : "
				+ KitapKiralamaSistemi.kitapDahaOnceKimlerTarafindanKiralamis(kitaplar, "Kırmızı Balık"));
		System.out.println("Ahm İle Başlayan Müşterilerin Listesi : "
				+ KitapKiralamaSistemi.ahmIleBaslayanMusterilerinListesi(musteriler));
		System.out.println("Müşteri 2'nin Kiraladığı Kitaplar : "
				+ KitapKiralamaSistemi.musteriKiraladigiKitaplarinListesi(kitaplar, 2));

	}

}
