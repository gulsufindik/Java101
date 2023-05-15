package Exam01;

public class Departman {
	private String ad;
	private String aciklama;
	private String lokasyon;

	public Departman(String ad, String aciklama, String lokasyon) {
		super();
		this.ad = ad;
		this.aciklama = aciklama;
		this.lokasyon = lokasyon;
	}

	public String getAd() {
		return ad;
	}

	public void setAd(String ad) {
		this.ad = ad;
	}

	public String getAciklama() {
		return aciklama;
	}

	public void setAciklama(String aciklama) {
		this.aciklama = aciklama;
	}

	public String getLokasyon() {
		return lokasyon;
	}

	public void setLokasyon(String lokasyon) {
		this.lokasyon = lokasyon;
	}

}
