package Exam01;

public class MuhasebePersoneli extends Personel {
	private String vergiNo;
	private int maas;

	public MuhasebePersoneli(int personelID, String ad, String soyad, int tcNo, int telefon, String adres,
			String vergiNo, int maas) {
		super(personelID, ad, soyad, tcNo, telefon, adres);
		this.vergiNo = vergiNo;
		this.maas = maas;
	}

	public String getVergiNo() {
		return vergiNo;
	}

	public void setVergiNo(String vergiNo) {
		this.vergiNo = vergiNo;
	}

	public int getMaas() {
		return maas;
	}

	public void setMaas(int maas) {
		this.maas = maas;
	}

}
