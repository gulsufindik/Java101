package Exam01;

public class InsanKaynaklariPersoneli extends Personel {
	private int sicilNo;
	private int maas;

	public InsanKaynaklariPersoneli(int personelID, String ad, String soyad, int tcNo, int telefon, String adres,
			int sicilNo, int maas) {
		super(personelID, ad, soyad, tcNo, telefon, adres);
		this.sicilNo = sicilNo;
		this.maas = maas;
	}

	public int getSicilNo() {
		return sicilNo;
	}

	public void setSicilNo(int sicilNo) {
		this.sicilNo = sicilNo;
	}

	public int getMaas() {
		return maas;
	}

	public void setMaas(int maas) {
		this.maas = maas;
	}

}