package Exam01;

public class TeknikPersonel extends Personel {
    private String görev;

    public TeknikPersonel(String ad, String soyad, String tcNo, String telefon, String adres, String görev) {
    	super(ad, soyad, tcNo, telefon, adres);
    	this.görev = görev;
    	}
    
    public String getGörev() {
        return görev;
    }

    public void setGörev(String görev) {
        this.görev = görev;
    }
}  