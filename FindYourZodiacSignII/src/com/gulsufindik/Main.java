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
		
		int month, day;
		String horoscope = "";
		
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the month of your date of birth (1-12): ");
		month = input.nextInt();
		
		System.out.print("Enter the day of your birthday (1-31): ");
		day = input.nextInt();
		
		switch (month) {
			case 1:
				if (day >= 1 && day <= 31) {
					if (day < 22) {
						System.out.print("Capricorn");
					} else {
						System.out.println("Aquarius");
					}
				} else {
					System.out.println("You entered an invalid day! ");
				}
				break;
				
			case 2:
				if (day >= 1 && day <=28) {
					if (day < 28) {
						System.out.println("Aquarius");
					} else {
						System.out.println("Pisces");
					}
				} else {
					System.out.println("You entered an invalid day! ");
				}
				break;
				
			case 3: 
				if (day >= 1 && day <= 31) {
					if (day <21) {
						System.out.println("Pisces");
					} else {
						System.out.println("Aries");
					}
				} else {
					System.out.println("You entered an invalid day! ");
				}
				break;
				
			case 4: 
				if (day >= 1 && day <= 30) {
					if (day <21) {
						System.out.println("Aries");
					} else {
						System.out.println("Taurus");
					}
				} else {
					System.out.println("You entered an invalid day! ");
				}
				break;
				
			case 5: 
				if (day >= 1 && day <= 31) {
					if (day <21) {
						System.out.println("Taurus");
					} else {
						System.out.println("Gemini");
					}
				} else {
					System.out.println("You entered an invalid day! ");
				}
				break;
				
			case 6: 
				if (day >= 1 && day <= 30) {
					if (day <22) {
						System.out.println("Gemini");
					} else {
						System.out.println("Cancer");
					}
				} else {
					System.out.println("You entered an invalid day! ");
				}
				break;
				
			case 7: 
				if (day >= 1 && day <= 31) {
					if (day <23) {
						System.out.println("Cancer");
					} else {
						System.out.println("Leo");
					}
				} else {
					System.out.println("You entered an invalid day! ");
				}
				break;
				
			case 8: 
				if (day >= 1 && day <= 30) {
					if (day <23) {
						System.out.println("Leo");
					} else {
						System.out.println("Virgo");
					}
				} else {
					System.out.println("You entered an invalid day! ");
				}
				break;
				
			case 9: 
				if (day >= 1 && day <= 31) {
					if (day <23) {
						System.out.println("Virgo");
					} else {
						System.out.println("Libra");
					}
				} else {
					System.out.println("You entered an invalid day! ");
				}
				break;
				
			case 10: 
				if (day >= 1 && day <= 30) {
					if (day <23) {
						System.out.println("Libra");
					} else {
						System.out.println("Scorpio");
					}
				} else {
					System.out.println("You entered an invalid day! ");
				}
				break;
				
			case 11: 
				if (day >= 1 && day <= 31) {
					if (day <23) {
						System.out.println("Scorpio");
					} else {
						System.out.println("Sagittarius");
					}
				} else {
					System.out.println("You entered an invalid day! ");
				}
				break;
				
			case 12: 
				if (day >= 1 && day <= 30) {
					if (day <22) {
						System.out.println("Sagittarius");
					} else {
						System.out.println("Capricorn");
					}
				} else {
					System.out.println("You entered an invalid day! ");
				}
				break;
				
				
				
				
			default:
				System.out.println("You entered a wrong month! ");
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
