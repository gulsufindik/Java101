package com.gulsufindik;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		/*
		 * Aries: 21 Mar - 20 Apr
		 * 
		 * Taurus: 21 Apr - 21 May
		 * 
		 * Gemini: 22 May - 22 Jun
		 * 
		 * Cancer: 23 Jun - 22 Jul
		 * 
		 * Leo: 23 Jul - 22 Aug
		 * 
		 * Virgo: 23 Aug - 22 Sep
		 * 
		 * Libra: 23 Sep - 22 Oct
		 * 
		 * Scorpio: 23 Oct - 21 Nov
		 * 
		 * Sagittarius: 22 Nov - 21 Dec
		 * 
		 * Capricorn: 22 Dec - 21 Ocak
		 * 
		 * Aquarius: 22 Jan - 19 Feb
		 * 
		 * Pisces: 20 Feb - 20 Mar
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
			horoscope = "Cancer";
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
