package com.gulsufindik.soru3;

public class Main {
	public static void main(String[] args) {
		
		Yolcu yolcu = new BusinessYolcu(1, "Jen", "Aniston", false);	
		Yolcu yolcu2 = new EkonomiYolcu(2, "Tom", "Tommy");	
		Yolcu yolcu3 = new BusinessYolcu(3, "Gülsu", "Fındık", true);	
		Yolcu yolcu4 = new BusinessYolcu(3, "Boost", "Java", true);
		
		System.out.println("Business Yolcu VIP\n");
		yolcu.biletAl(EFirmaAdi.ADJ);
		yolcu.biletAl(EFirmaAdi.THY);
		System.out.println("\n");
		yolcu.ucagaBin();
		yolcu.ucagaBin();
		yolcu.checkInYap();
		yolcu.checkInYap();
		yolcu.ucagaBin();
		System.out.println("\n");
		yolcu.yolcuBilgileriniGetir();
	
		yolcu3.biletAl(EFirmaAdi.ADJ);
		yolcu3.biletAl(EFirmaAdi.THY);
		System.out.println("\n");
		yolcu3.ucagaBin();
		yolcu3.ucagaBin();
		yolcu3.checkInYap();
		yolcu3.checkInYap();
		yolcu3.ucagaBin();
		System.out.println("\n");
		yolcu3.yolcuBilgileriniGetir();

		yolcu4.biletAl(EFirmaAdi.ADJ);
		yolcu4.biletAl(EFirmaAdi.THY);
		System.out.println("\n");
		yolcu4.ucagaBin();
		yolcu4.ucagaBin();
		yolcu4.checkInYap();
		yolcu4.checkInYap();
		yolcu4.ucagaBin();
		System.out.println("\n");
		yolcu4.yolcuBilgileriniGetir();
		System.out.println("_______________________\n");
		
		System.out.println("Ekonomi Yolcu\n");
		yolcu2.biletAl(EFirmaAdi.ADJ);
		yolcu2.biletAl(EFirmaAdi.THY);
		yolcu2.biletAl(EFirmaAdi.THY);
		yolcu2.biletAl(EFirmaAdi.THY);
		System.out.println("\n");
		yolcu2.ucagaBin();
		yolcu2.ucagaBin();
		yolcu2.checkInYap();
		yolcu2.checkInYap();
		yolcu2.ucagaBin();
		System.out.println("\n");
		yolcu2.yolcuBilgileriniGetir();	
	}
}