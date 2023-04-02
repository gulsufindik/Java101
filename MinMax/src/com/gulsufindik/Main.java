package com.gulsufindik;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n, number, max = Integer.MIN_VALUE, min = Integer.MAX_VALUE;
        System.out.print("How many numbers will you enter? ");
        n = input.nextInt();
        for (int i = 1; i <= n; i++) {
            System.out.print("Enter the " + i + ". number: ");
            number = input.nextInt();
            if (number > max) {
                max = number;
            }
            if (number < min) {
                min = number;
            }
        }
        System.out.println("The largest number is: " + max);
        System.out.println("The smallest number is: " + min);
    }
}
