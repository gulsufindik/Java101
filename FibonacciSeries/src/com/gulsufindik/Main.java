package com.gulsufindik;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		int n, i, fib1 = 0, fib2 = 1, fib3;
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter the number of elements in the Fibonacci series: ");
		n = input.nextInt();

		System.out.print(fib1 + " " + fib2 + " ");

		for (i = 3; i <= n; i++) {
			fib3 = fib1 + fib2;
			System.out.print(fib3 + " ");
			fib1 = fib2;
			fib2 = fib3;

		}

	}
}
