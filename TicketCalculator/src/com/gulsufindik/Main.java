package com.gulsufindik;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		int distance, age, travelType;
		double ticketPrice, discountRate = 0, totalPrice;

		System.out.print("Enter the distance in kilometers: ");
		distance = input.nextInt();

		System.out.print("Enter your age: ");
		age = input.nextInt();

		System.out.print("Enter trip type (1 => One Way, 2 => Round Trip): ");
		travelType = input.nextInt();

		if (distance > 0 && age > 0 && (travelType == 1 || travelType == 2)) {
			ticketPrice = distance * 0.10;

			if (age < 12) {
				discountRate = 0.50;
			} else if (age >= 12 && age <= 24) {
				discountRate = 0.10;
			} else if (age >= 65) {
				discountRate = 0.30;
			}

			if (travelType == 2) {
				discountRate += 0.20;
			}

			totalPrice = ticketPrice - (ticketPrice * discountRate);
			System.out.println("Total Ticket Price: " + totalPrice + " TL");

		} else {
			System.out.println("You Entered Wrong Data!");
		}

		input.close();
	}

}
