package com.gulsufindik;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		int num1, num2, num3, num4;

		System.out.print("Enter the 1st number: ");
		num1 = input.nextInt();

		System.out.print("Enter the 2nd number: ");
		num2 = input.nextInt();

		System.out.print("Enter the 3rd number: ");
		num3 = input.nextInt();

		System.out.print("Enter the 4th number: ");
		num4 = input.nextInt();

		int smallest = num1;
		int biggest = num1;

		if (num2 < smallest) {
			smallest = num2;
		} else if (num2 > biggest) {
			biggest = num2;
		}

		if (num3 < smallest) {
			smallest = num3;
		} else if (num3 > biggest) {
			biggest = num3;
		}

		if (num4 < smallest) {
			smallest = num4;
		} else if (num4 > biggest) {
			biggest = num4;
		}

		int mediumLarge, mediumLarge2;

		if (num1 != smallest && num1 != biggest) {
			mediumLarge = num1;
		} else {
			mediumLarge = num2;
		}

		if (num3 != smallest && num3 != biggest) {
			mediumLarge2 = num3;
		} else {
			mediumLarge2 = num4;
		}

		if (mediumLarge > mediumLarge2) {
			System.out.println(smallest + " " + mediumLarge2 + " " + mediumLarge + " " + biggest);
		} else {
			System.out.println(smallest + " " + mediumLarge + " " + mediumLarge2 + " " + biggest);
		}
	}

}
