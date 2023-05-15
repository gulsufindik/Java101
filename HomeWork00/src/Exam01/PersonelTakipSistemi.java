package Exam01;

import java.util.*;

public class PersonelTakipSistemi {

	private List<Personel> personelListesi;
	private Map<String, List<Personel>> departmanlar;
	private Map<Personel, Double> maaslar;

	public PersonelTakipSistemi() {
		personelListesi = new ArrayList<>();
		departmanlar = new HashMap<>();
		maaslar = new HashMap<>();
	}

	public void personelEkle(Personel personel, String departman) {
		personelListesi.add(personel);
		if (departmanlar.containsKey(departman)) {
			departmanlar.get(departman).add(personel);
		} else {
			List<Personel> yeniDepartman = new ArrayList<>();
			yeniDepartman.add(personel);
			departmanlar.put(departman, yeniDepartman);
		}
	}

	public void personelListesi() {
		if (personelListesi.size() == 0) {
			System.out.println("Personel listesi boş.");
		} else {
			for (Personel personel : personelListesi) {
				System.out.println(personel);
			}
		}
	}

	public void personelDuzenle(Personel eskiPersonel, Personel yeniPersonel) {
		if (personelListesi.contains(eskiPersonel)) {
			personelListesi.set(personelListesi.indexOf(eskiPersonel), yeniPersonel);
		} else {
			System.out.println("Personel bulunamadı.");
		}
	}

	public void departmanEkle(String departman) {
		if (!departmanlar.containsKey(departman)) {
			departmanlar.put(departman, new ArrayList<>());
		} else {
			System.out.println("Departman zaten var.");
		}
	}

	public void departmanListesi() {
		if (departmanlar.size() == 0) {
			System.out.println("Departman listesi boş.");
		} else {
			for (String departman : departmanlar.keySet()) {
				System.out.println(departman + ":");
				for (Personel personel : departmanlar.get(departman)) {
					System.out.println("\t" + personel);
				}
			}
		}
	}

	// 2.1. Maaş Personel Tanımlama
	public void maasPersonelTanımlama(Personel personel, double maas) {
		if (personelListesi.contains(personel)) {
			maaslar.put(personel, maas);
		} else {
			System.out.println("Personel bulunamadı.");
		}
	}

	// 2.2. Ödeme Listesi
	public void odemeListesi() {
		if (maaslar.size() == 0) {
			System.out.println("Ödeme listesi boş.");
		} else {
			for (Personel personel : maaslar.keySet()) {
				System.out.println(personel.getAd() + " " + personel.getSoyad() + ": " + maaslar.get(personel));
			}
		}
	}
}
