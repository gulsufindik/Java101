package com.gulsufindik;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter Your Year of Birth: ");
		int birthYear = input.nextInt();
		int zodiacIndex = birthYear % 12;
		
		String[] zodiacs = { "Monkey", "Cockerel", "Dog", "Pig", "Mouse", "Ox", "Tiger", "Rabbit", "Dragon", "Snake",
				"Horse", "Sheep" };
		String zodiac = zodiacs[zodiacIndex];
		System.out.println("Chinese Zodiac Sign: " + zodiac);
	}

}
