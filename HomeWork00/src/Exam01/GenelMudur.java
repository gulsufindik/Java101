package Exam01;

public class GenelMudur extends Mudur {
	private String sirket;
	private int maas;

	public GenelMudur(int personelID, String ad, String soyad, int tcNo, int telefon, String adres, String departman,
			int maas, String sirket, int maas2) {
		super(personelID, ad, soyad, tcNo, telefon, adres, departman, maas);
		this.sirket = sirket;
		maas = maas2;
	}

	public String getSirket() {
		return sirket;
	}

	public void setSirket(String sirket) {
		this.sirket = sirket;
	}

	public int getMaas() {
		return maas;
	}

	public void setMaas(int maas) {
		this.maas = maas;
	}

}
