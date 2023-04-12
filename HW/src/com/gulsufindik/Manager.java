package com.gulsufindik;
import java.util.Random;

public class Manager {
	
	private Random random = new Random();

    public void Menu() {
        for (EGun gun : EGun.values()) {
            ECorba corba = ECorba.values()[random.nextInt(ECorba.values().length)];
            EIcecek icecek = EIcecek.values()[random.nextInt(EIcecek.values().length)];
            EYemek yemek = EYemek.values()[random.nextInt(EYemek.values().length)];
            ETatli tatli = ETatli.values()[random.nextInt(ETatli.values().length)];

            System.out.println(gun + " Menüsü:");
            System.out.println("Çorba: " + corba);
            System.out.println("İçecek: " + icecek);
            System.out.println("Yemek: " + yemek);
            System.out.println("Tatlı: " + tatli);
            System.out.println();
        }
    }
}


