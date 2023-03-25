package com.gulsufindik;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		String userName, password;
        Scanner input = new Scanner(System.in);
        int right = 3;
        int balance = 1500;
        int select;
        
        while (right > 0) {
            System.out.print("Enter your username: ");
            userName = input.nextLine();
            System.out.print("Enter your password: ");
            password = input.nextLine();

            if (userName.equals("patika") && password.equals("dev123")) {
                System.out.println("Hello, Welcome to the We Are Kodluyoruz Bank!");
                do {
                    System.out.println("1-Amount of money\n" +
                            "2-Deposit money into account\n" +
                            "3-Balance Inquiry\n" +
                            "4-Exit");
                    System.out.print("Please select the action you want to do: ");
                    select = input.nextInt();

                    switch (select) {
                        case 1:
                            System.out.print("Enter the amount of money: ");
                            int price = input.nextInt();
                            balance += price;
                            break;
                        case 2:
                            System.out.print("Enter the amount of money: ");
                            price = input.nextInt();
                            if (price > balance) {
                                System.out.println("Insufficient balance.");
                            } else {
                                balance -= price;
                            }
                            break;
                        case 3:
                            System.out.println("Balance : " + balance);
                            break;
                        case 4:
                            break;
                        default:
                            System.out.println("Invalid operation. Please try again.");
                    }
                } while (select != 4);
                System.out.println("See you again.");
                break;
            } else {
                right--;
                System.out.println("Wrong username or password. Try again.");
                if (right == 0) {
                    System.out.println("Your account has been blocked, please contact the bank.");
                } else {
                    System.out.println("Your Remaining Rights : " + right);
                }
            }
        }
    }
}


