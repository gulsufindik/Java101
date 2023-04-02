package com.gulsufindik;

import java.util.Scanner;

import java.util.Scanner;

public class GcdLcmWhile {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num1, num2, gcd = 1, lcm;

        System.out.print("Enter the first number: ");
        num1 = input.nextInt();
        System.out.print("Enter the second number: ");
        num2 = input.nextInt();

        int i = 1;
        while (i <= num1 && i <= num2) {
            if (num1 % i == 0 && num2 % i == 0) {
                gcd = i;
            }
            i++;
        }

        lcm = (num1 * num2) / gcd;

        System.out.println("The GCD of " + num1 + " and " + num2 + " is: " + gcd);
        System.out.println("The LCM of " + num1 + " and " + num2 + " is: " + lcm);
    }
}
