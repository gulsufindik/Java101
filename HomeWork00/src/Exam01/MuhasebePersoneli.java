package Exam01;

public class MuhasebePersoneli extends Personel {
	private String unvan;

	public MuhasebePersoneli(String ad, String soyad, String tcNo, String telefon, String adres, String unvan) {
		super(ad, soyad, tcNo, telefon, adres);
		this.unvan = unvan;
	}

	public String getUnvan() {
		return unvan;
	}

	public void setUnvan(String unvan) {
		this.unvan = unvan;
	}
}