package Exam01;

public class TeknikPersonel extends Personel {
	private String alan;
	private int maas;

	public TeknikPersonel(int personelID, String ad, String soyad, int tcNo, int telefon, String adres, String alan,
			int maas) {
		super(personelID, ad, soyad, tcNo, telefon, adres);
		this.alan = alan;
		this.maas = maas;
	}

	public String getAlan() {
		return alan;
	}

	public void setAlan(String alan) {
		this.alan = alan;
	}

	public int getMaas() {
		return maas;
	}

	public void setMaas(int maas) {
		this.maas = maas;
	}

}