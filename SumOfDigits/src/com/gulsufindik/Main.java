package com.gulsufindik;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = input.nextInt();

        int sum = 0;
        int digit;

        while (number > 0) {
            digit = number % 10;
            sum += digit;
            number /= 10;
        }

        System.out.println("The sum of the digits is: " + sum);
    }
}

	