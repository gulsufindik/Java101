package com.gulsufindik;

import java.util.Scanner;

public class PizzaSiparis {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Pizza turunu girin (Peynirli/Mantarli/Vejetaryen): ");
        String tur = scanner.nextLine().toUpperCase(); // Kullanıcının girdisini büyük harflere dönüştürüyoruz

        System.out.print("Pizza boyutunu girin (Kucuk/Orta/Buyuk): ");
        String boyutu = scanner.nextLine().toLowerCase(); // Kullanıcının girdisini küçük harflere dönüştürüyoruz

        if (!isValidTur(tur)) {
            System.out.println("Geçersiz pizza türü girdiniz!");
            return; // Programı sonlandırıyoruz
        }

        if (!isValidBoyutu(boyutu)) {
            System.out.println("Geçersiz pizza boyutu girdiniz!");
            return; // Programı sonlandırıyoruz
        }

        Pizza pizza = PizzaFactory.pizzaSec(tur, boyutu);
        System.out.println("Siparişiniz alındı. Pizza hazırlanıyor...");

        pizza.hazirla();

        System.out.println("Pizza hazır! Afiyet olsun!");
    }

    private static boolean isValidTur(String tur) {
        try {
            Tur.valueOf(tur);
            return true;
        } catch (IllegalArgumentException e) {
            return false;
        }
    }

    private static boolean isValidBoyutu(String boyutu) {
        return boyutu.equals("kucuk") || boyutu.equals("orta") || boyutu.equals("buyuk");
    }
}
