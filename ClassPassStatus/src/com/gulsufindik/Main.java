package com.gulsufindik;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		int maths, physical, turkish, chemistry, music;

		Scanner input = new Scanner(System.in);

		System.out.print("Your math grade: ");
		maths = input.nextInt();

		System.out.print("Your physical grade: ");
		physical = input.nextInt();

		System.out.print("Your turkish grade: ");
		turkish = input.nextInt();

		System.out.print("Your chemistry grade: ");
		chemistry = input.nextInt();

		System.out.print("Your music grade: ");
		music = input.nextInt();

		double avarage = ((maths >= 0 && maths <= 100) ? maths : 0) +
                ((physical >= 0 && physical <= 100) ? physical : 0) +
                ((turkish >= 0 && turkish <= 100) ? turkish : 0) +
                ((chemistry >= 0 && chemistry <= 100) ? chemistry : 0) +
                ((music >= 0 && music <= 100) ? music : 0);
		
		avarage /= 5;
		
		if (avarage <= 55) {
			System.out.println("You didn't pass the class !");

		} else {
			System.out.println("Congratulations, you passed the class !");

		}

		System.out.println("Avarage :" + avarage);

	}

}
