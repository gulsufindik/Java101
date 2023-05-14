package Exam02;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

public class Main {
	public static void main(String[] args) {
		ArrayList<Personel> personelListesi = new ArrayList<>();

		personelListesi.add(new Personel("Gülsu", 25));
		personelListesi.add(new Personel("Hülya", 30));
		personelListesi.add(new Personel("Efe", 40));
		personelListesi.add(new Personel("Berk", 27));
		personelListesi.add(new Personel("Doruk", 32));
		personelListesi.add(new Personel("Emre", 29));
		personelListesi.add(new Personel("Sefa", 38));
		personelListesi.add(new Personel("Berkcan", 26));
		personelListesi.add(new Personel("Sinan", 31));
		personelListesi.add(new Personel("Ali", 35));
		personelListesi.add(new Personel("Veli", 36));
		personelListesi.add(new Personel("Gamze", 28));
		personelListesi.add(new Personel("Cemal", 33));
		personelListesi.add(new Personel("Gül", 41));
		personelListesi.add(new Personel("Ayhan", 24));
		personelListesi.add(new Personel("Amelie", 37));
		personelListesi.add(new Personel("Yasin", 26));
		personelListesi.add(new Personel("Hakkı", 29));
		personelListesi.add(new Personel("Seda", 39));
		personelListesi.add(new Personel("Hasan", 34));

		System.out.println("Personel Listesi:");
		personelListesi.forEach(p -> System.out.println(p.getAd() + " - " + p.getYas()));

		Comparator<Personel> isimSiralayici = Comparator.comparing(Personel::getAd);

		Collections.sort(personelListesi, isimSiralayici);

		System.out.println("Isme göre alfabetik sıralanmış Personel Listesi:");
		personelListesi.forEach(p -> System.out.println(p.getAd() + " - " + p.getYas()));

		long buyuk30 = personelListesi.stream().filter(p -> p.getYas() > 30).count();

		System.out.println("Yaşı 30'dan büyük olan personellerin sayısı: " + buyuk30);

		long aHarfiIleBaslayanPersonelSayisi = personelListesi.stream().filter(p -> p.getAd().startsWith("A")).count();

		System.out.println("A harfi ile başlayan personel sayısı: " + aHarfiIleBaslayanPersonelSayisi);

		Personel enBuyukYasliPersonel = personelListesi.stream().max(Comparator.comparing(Personel::getYas))
				.orElse(null);

		if (enBuyukYasliPersonel != null) {
			System.out.println("Yaşı en büyük personelin adı: " + enBuyukYasliPersonel.getAd());
		} else {
			System.out.println("Personel listesi boş!");
		}

		Optional<Personel> ali = personelListesi.stream().filter(p -> p.getAd().equals("Ali")).findFirst();

		if (ali.isPresent()) {
			System.out.println("Ali'nin yaşı: " + ali.get().getYas());
		} else {
			System.out.println("Personel listesinde Ali yok!");
		}

		List<String> enKucukUc = personelListesi.stream().sorted(Comparator.comparingInt(Personel::getYas)).limit(3)
				.map(Personel::getAd).collect(Collectors.toList());

		System.out.println("Yaşı en küçük olan 3 personelin isimleri: " + enKucukUc);

		long yas2535 = personelListesi.stream().filter(p -> p.getYas() >= 25 && p.getYas() <= 35).count();
		System.out.println("Yaşı 25 ile 35 arasında olan personellerin sayısı: " + yas2535);

		personelListesi.stream().filter(p -> p.getAd().length() > 4).forEach(p -> System.out.println(p.getAd()));

		personelListesi.stream().sorted(Comparator.comparingInt(Personel::getYas).reversed()).limit(2)
				.forEach(p -> System.out.println(p.getAd()));

		personelListesi.stream().filter(p -> p.getAd().endsWith("a")).map(p -> p.getAd().toUpperCase())
				.forEach(System.out::println);

		double ortalama = personelListesi.stream().mapToInt(p -> p.getAd().length()).average().orElse(0.0);

		System.out.println("İsimlerin uzunluğunun ortalaması: " + ortalama);

		int yas = personelListesi.stream().max(Comparator.comparingInt(p -> p.getAd().length())).map(Personel::getYas)
				.orElseThrow();

		System.out.println("İsmi en uzun olan personelin yaşı: " + yas);

		boolean varMi = personelListesi.stream().anyMatch(p -> p.getAd().toLowerCase().contains("ahmet"));
		System.out.println("Herhangi bir Ahmet var mı? " + varMi);

		List<String> isimlerTers = personelListesi.stream().map(Personel::getAd)
				.map(s -> new StringBuilder(s).reverse().toString()).sorted(Comparator.naturalOrder()).toList();
		System.out.println("İsimlerin ters çevirilmiş hali:");
		isimlerTers.forEach(System.out::println);

		List<String> eHarfiGecenler = personelListesi.stream().filter(p -> p.getAd().contains("e")).map(Personel::getAd)
				.collect(Collectors.toList());
		System.out.println("İsimlerinde 'e' harfi geçen personeller: " + eHarfiGecenler);

		Map<String, Integer> EnKucukYas = personelListesi.stream().min(Comparator.comparingInt(Personel::getYas))
				.map(personel -> Map.of(personel.getAd(), personel.getYas())).orElse(Collections.emptyMap());

		System.out.println("Yaşı en küçük olan personelin adı ve yaşı: " + EnKucukYas);

	}
}