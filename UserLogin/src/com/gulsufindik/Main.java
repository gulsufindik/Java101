package com.gulsufindik;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		String userName, password;

		Scanner input = new Scanner(System.in);

		System.out.print("Please enter your username: ");
		userName = input.nextLine();

		System.out.print("Please enter your password: ");
		password = input.next();

		if (userName.equals("patika") && password.equals("java123")) {
			System.out.println("Signed in !");
		} else {
			System.out.println("Your information is wrong !");
			System.out.println("Reset your password (1-Yes / 0-No)");
			int choice = input.nextInt();

			switch (choice) {
			case 0:
				System.out.println("The transaction has been cancelled.");
				break;
			case 1:
				System.out.println("Enter your new password");
				String newPassword = input.next();
				if ((newPassword.equals(password))) {
					System.out.println("New password cannot be the same as the old one.");
				} else {
					System.out.println("The password has been changed succesfully.");
				}
				break;
			default:
				System.out.println("Invalid value entered.");

			}

		}
		input.close();

	}

}
