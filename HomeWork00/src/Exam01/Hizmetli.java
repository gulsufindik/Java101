package Exam01;

public class Hizmetli extends Personel implements Calisabilir {
    private String temizlikGorevi;

    public Hizmetli(String ad, String soyad, String tcNo, String telefon, String adres, String temizlikGorevi) {
        super(ad, soyad, tcNo, telefon, adres);
        this.temizlikGorevi = temizlikGorevi;
    }

    public String getTemizlikGorevi() {
        return temizlikGorevi;
    }

    public void setTemizlikGorevi(String temizlikGorevi) {
        this.temizlikGorevi = temizlikGorevi;
    }

	@Override
	public void calis() {
		
	}
}