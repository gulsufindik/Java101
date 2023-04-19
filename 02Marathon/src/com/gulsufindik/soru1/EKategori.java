package com.gulsufindik.soru1;

public enum EKategori {
	ROMAN, 
	MACERA, 
	EGITIM, 
	BIYOGRAFI, 
	POZITIF_DUSUNCE;

	private String kitapAdi;
	private String yazarAdi;
	private EKategori kitapTur;

	public void Kitap(String kitapAdi, String yazarAdi, EKategori kitapTur) {
		this.kitapAdi = kitapAdi;
		this.yazarAdi = yazarAdi;
		this.kitapTur = kitapTur;
	}

}
