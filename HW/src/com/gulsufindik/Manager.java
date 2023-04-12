package com.gulsufindik;
import java.util.Random;
import java.util.Scanner;

public class Manager {
    private Random random = new Random();
    private Scanner scanner = new Scanner(System.in);

    public void Menu() {
        System.out.println("Hangi günün menüsünü görmek istersiniz?");
        String input = scanner.nextLine().toUpperCase();
        EGun gun = EGun.valueOf(input);

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
