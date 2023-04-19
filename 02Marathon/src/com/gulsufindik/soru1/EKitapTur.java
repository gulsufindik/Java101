package com.gulsufindik.soru1;

public enum EKitapTur {
	ROMAN, 
	MACERA, 
	EGITIM, 
	BIYOGRAFI, 
	POZITIF_DUSUNCE;

	private String kitapAdi;
	private String yazarAdi;
	private EKitapTur kitapTur;

	public void Kitap(String kitapAdi, String yazarAdi, EKitapTur kitapTur) {
		this.kitapAdi = kitapAdi;
		this.yazarAdi = yazarAdi;
		this.kitapTur = kitapTur;
	}

}
