package Exam01;

public abstract class Personel {
	private int PersonelID;
	private String ad;
	private String soyad;
	private int tcNo;
	private int telefon;
	private String adres;

	public Personel(int personelID, String ad, String soyad, int tcNo, int telefon, String adres) {
		super();
		PersonelID = personelID;
		this.ad = ad;
		this.soyad = soyad;
		this.tcNo = tcNo;
		this.telefon = telefon;
		this.adres = adres;
	}

	public int getPersonelID() {
		return PersonelID;
	}

	public void setPersonelID(int personelID) {
		PersonelID = personelID;
	}

	public String getAd() {
		return ad;
	}

	public void setAd(String ad) {
		this.ad = ad;
	}

	public String getSoyad() {
		return soyad;
	}

	public void setSoyad(String soyad) {
		this.soyad = soyad;
	}

	public int getTcNo() {
		return tcNo;
	}

	public void setTcNo(int tcNo) {
		this.tcNo = tcNo;
	}

	public int getTelefon() {
		return telefon;
	}

	public void setTelefon(int telefon) {
		this.telefon = telefon;
	}

	public String getAdres() {
		return adres;
	}

	public void setAdres(String adres) {
		this.adres = adres;
	}

}