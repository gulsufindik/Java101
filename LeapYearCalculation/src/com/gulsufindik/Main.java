package com.gulsufindik;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.print("Enter year: ");
		int year = input.nextInt();

		boolean leapYear = false;

		if (year % 4 == 0) {
			if (year % 100 == 0) {
				if (year % 400 == 0) {
					leapYear = true;
				}
			} else {
				leapYear = true;
			}
		}

		if (leapYear) {
			System.out.println(year + " a leap year !");
		} else {
			System.out.println(year + " not a leap year!");
		}
	}

}
