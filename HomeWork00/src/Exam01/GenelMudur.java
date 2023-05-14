package Exam01;

public class GenelMudur extends Personel {
	private String şirket;

	public GenelMudur(String ad, String soyad, String tcNo, String telefon, String adres, String şirket) {
		super(ad, soyad, tcNo, telefon, adres);
		this.şirket = şirket;
	}

	public String getŞirket() {
		return şirket;
	}

	public void setŞirket(String şirket) {
		this.şirket = şirket;
	}

}
