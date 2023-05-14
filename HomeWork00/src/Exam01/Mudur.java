package Exam01;

public class Mudur extends Personel {
	private String departman;

	public Mudur(String ad, String soyad, String tcNo, String telefon, String adres, String departman) {
		super(ad, soyad, tcNo, telefon, adres);
		this.departman = departman;
	}

	public String getDepartman() {
		return departman;
	}

	public void setDepartman(String departman) {
		this.departman = departman;
	}

}