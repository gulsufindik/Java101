package com.gulsufindik;

import java.util.Scanner;

public class Main {

	private static void menu() {
		System.out.println("*********************");
		System.out.println("*                   *");
		System.out.println("*    Calculator     *");
		System.out.println("*                   *");
		System.out.println("*********************");
		System.out.println("1. Addition");
		System.out.println("2. Subtraction");
		System.out.println("3. Multiplication");
		System.out.println("4. Division");
		System.out.println("5. Exit");
	}

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		boolean control = true;
		while (control == true) {
			menu();
			System.out.println("Please enter your selection(1-5): ");
			int secim = input.nextInt();

			switch (secim) {
			
			case 1:
				System.out.println("Addition: ");
				System.out.println("Please enter the 1st number");
				int num1 = input.nextInt();
				System.out.println("Please enter the 2nd number");
				int num2 = input.nextInt();
				System.out.println("Output = " + (num1 + num2));
				break;
				
			case 2:
				System.out.println("Çıkarma işlemi: ");
				System.out.println("Please enter the 1st number");
				int num3 = input.nextInt();
				System.out.println("Please enter the 2nd number");
				int num4 = input.nextInt();
				System.out.println("Output = " + (num3 - num4));
				break;
				
			case 3:
				System.out.println("Multiplication: ");
				System.out.println("Please enter the 1st number");
				int num5 = input.nextInt();
				System.out.println("Please enter the 2nd number");
				int num6 = input.nextInt();
				System.out.println("Output = " + (num5 * num6));
				break;
				
			case 4:
				System.out.println("Division: ");
				System.out.println("Please enter the 1st number");
				int num7 = input.nextInt();
				System.out.println("Please enter the 2nd number");
				int num8 = input.nextInt();
				System.out.println("Output = " + (num7 / num8));
				break;
				
			case 5:
				System.out.println("Have a nice day :) ");
				control = false;
				break;
				
			default:
				System.out.println("Please enter a value between 1 and 5");
				break;
			}
		}

	}

}