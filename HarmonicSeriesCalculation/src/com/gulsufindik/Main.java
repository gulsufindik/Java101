package com.gulsufindik;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// Harmonic Series Formula: 1+ (1/2) + (1/3)+ (1/4)+ (1/n)

		Scanner input = new Scanner(System.in);

		System.out.print("Enter number N: ");
		double n = input.nextDouble();
		double result = 0;

		for (int i = 1; i <= n; i++) {

			result += (1.0 / i);
		}

		System.out.println("The harmonic series of the entered number: " + result);

	}

}
