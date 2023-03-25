package com.gulsufindik;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		int heat;
		
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the temperature: ");
		heat = input.nextInt();

		if (heat < 5) {
			System.out.println("The weather is very cold! We recommend skiing.");
		} else if (heat >= 5 && heat < 15) {
			System.out.println("The weather is a bit cold! We recommend the cinema event.");
		} else if (heat >= 15 && heat < 25) {
			System.out.println("The weather is nice! We recommend having a picnic.");
		} else {
			System.out.println("The weather is very hot! We recommend the swimming activity.");
		}
	}
}
