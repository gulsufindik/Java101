package com.gulsufindik;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		/*
		 * Aries: 21 Mart - 20 Nisan
		 * 
		 * Taurus: 21 Nisan - 21 Mayıs
		 * 
		 * Gemini: 22 Mayıs - 22 Haziran
		 * 
		 * Cancer: 23 Haziran - 22 Temmuz
		 * 
		 * Leo: 23 Temmuz - 22 Ağustos
		 * 
		 * Virgo: 23 Ağustos - 22 Eylül
		 * 
		 * Libra: 23 Eylül - 22 Ekim
		 * 
		 * Scorpio: 23 Ekim - 21 Kasım
		 * 
		 * Sagittarius: 22 Kasım - 21 Aralık
		 * 
		 * Capricorn: 22 Aralık - 21 Ocak
		 * 
		 * Aquarius: 22 Ocak - 19 Şubat
		 * 
		 * Pisces: 20 Şubat - 20 Mart
		 */

		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter the month of your date of birth (1-12): ");
		int month = scanner.nextInt();

		System.out.print("Enter the day of your birthday (1-31): ");
		int day = scanner.nextInt();

		String horoscope = "";

		if ((month == 3 && day >= 21) || (month == 4 && day <= 20)) {
			horoscope = "Aries";
		} else if ((month == 4 && day >= 21) || (month == 5 && day <= 21)) {
			horoscope = "Taurus";
		} else if ((month == 5 && day >= 22) || (month == 6 && day <= 22)) {
			horoscope = "Gemini";
		} else if ((month == 6 && day >= 23) || (month == 7 && day <= 22)) {
			horoscope = "Yengeç";
		} else if ((month == 7 && day >= 23) || (month == 8 && day <= 22)) {
			horoscope = "Leo";
		} else if ((month == 8 && day >= 23) || (month == 9 && day <= 22)) {
			horoscope = "Virgo";
		} else if ((month == 9 && day >= 23) || (month == 10 && day <= 22)) {
			horoscope = "Libra";
		} else if ((month == 10 && day >= 23) || (month == 11 && day <= 21)) {
			horoscope = "Scorpio";
		} else if ((month == 11 && day >= 22) || (month == 12 && day <= 21)) {
			horoscope = "Sagittarius";
		} else if ((month == 12 && day >= 22) || (month == 1 && day <= 21)) {
			horoscope = "Capricorn";
		} else if ((month == 1 && day >= 22) || (month == 2 && day <= 19)) {
			horoscope = "Aquarius";
		} else if ((month == 2 && day >= 20) || (month == 3 && day <= 20)) {
			horoscope = "Pisces";
		}

		System.out.println("Your zodiac sign: " + horoscope);
	}

}
