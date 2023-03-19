package com.gulsufindik;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = scanner.nextInt();
        
        int sum = 0;
        int count = 0;
        for (int i = 0; i <= n; i++) {
            if (i % 3 == 0 && i % 4 == 0) {
                sum += i;
                count++;
            }
        }
        
        if (count == 0) {
            System.out.println("There are no numbers divisible by 3 and 4 in the entered range.");
        } else {
            double average = (double) sum / count;
            System.out.println("Average of numbers divisible by 3 and 4 in the entered range: " + average);
        }
    }
}
