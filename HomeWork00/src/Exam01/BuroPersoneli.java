package Exam01;

public class BuroPersoneli extends Personel {
	private String birim;

	public BuroPersoneli(int personelID, String ad, String soyad, int tcNo, int telefon, String adres, String birim) {
		super(personelID, ad, soyad, tcNo, telefon, adres);
		this.birim = birim;
	}

	public String getBirim() {
		return birim;
	}

	public void setBirim(String birim) {
		this.birim = birim;
	}

}
