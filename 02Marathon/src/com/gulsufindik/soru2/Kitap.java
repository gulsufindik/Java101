package com.gulsufindik.soru2;

public class Kitap {
    private int kitapID;
    private String adi;
    private String kiralandigiKisi;

    public Kitap(int id, String adi, String kiralandigiKisi) {
        this.kitapID = id;
        this.adi = adi;
        this.kiralandigiKisi = kiralandigiKisi;
    }

    public int getId() {
        return kitapID;
    }

    public String getAdi() {
        return adi;
    }

    public String getKiralandigiKisi() {
        return kiralandigiKisi;
    }

	public boolean kiralanmisMi() {
	
		return false;
	}

	public int kitapID() {
		
		return 0;
	}
}

