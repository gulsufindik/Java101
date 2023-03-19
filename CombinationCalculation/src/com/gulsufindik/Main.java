package com.gulsufindik;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		int n, r;
		double combination;

		System.out.print("Enter the value of n: ");
		n = input.nextInt();

		System.out.print("Enter the value of r: ");
		r = input.nextInt();

		combination = factorial(n) / (factorial(r) * factorial(n - r));

		System.out.println("C(" + n + "," + r + ") = " + combination);
	}

	public static double factorial(int num) {
		double result = 1;
		for (int i = 1; i <= num; i++) {
			result *= i;
		}
		return result;
	}
}
