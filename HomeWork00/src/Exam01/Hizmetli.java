package Exam01;

public class Hizmetli extends Personel {
	private String departman;
	private int maas;

	public Hizmetli(int personelID, String ad, String soyad, int tcNo, int telefon, String adres, String departman,
			int maas) {
		super(personelID, ad, soyad, tcNo, telefon, adres);
		this.departman = departman;
		this.maas = maas;
	}

	public String getDepartman() {
		return departman;
	}

	public void setDepartman(String departman) {
		this.departman = departman;
	}

	public int getMaas() {
		return maas;
	}

	public void setMaas(int maas) {
		this.maas = maas;
	}

}