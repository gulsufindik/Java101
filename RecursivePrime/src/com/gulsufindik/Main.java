package com.gulsufindik;

import java.util.Scanner;

public class Main {

    public static boolean isPrime(int number, int divisor) {
        if (number <= 2) {
            return (number == 2) ? true : false;
        }
        if (number % divisor == 0) {
            return false;
        }
        if (divisor * divisor > number) {
            return true;
        }
        return isPrime(number, divisor + 1);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number : ");
        int number = scanner.nextInt();
        boolean result = isPrime(number, 2);
        if (result) {
            System.out.println(number + " number is PRIME !");
        } else {
            System.out.println(number + " number is not PRIME !");
        }
    }
}
