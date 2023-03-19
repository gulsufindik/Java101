package com.gulsufindik;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		int number;

		System.out.print("Enter a number: ");
		number = scanner.nextInt();

		for (int i = 1; i <= number; i++) {
			System.out.println("4 to the power of " + i + " = " + Math.pow(4, i));
			System.out.println("5 to the power of " + i + " = " + Math.pow(5, i));
		}
	}

}
