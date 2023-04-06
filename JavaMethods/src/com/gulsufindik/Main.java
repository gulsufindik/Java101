package com.gulsufindik;

public class Main {
	
	static int power(int base, int exp) {
		
		int result = 1;

		for (int i = 0; i <= exp; i++) {
			result *= base;
		}
		return result;
	}

	public static void main(String[] args) {
		// f(x) = 2x + 5
		// f(6) = 2 * 6 + 5 = 17
		// f(x,y,z) = 3x + 2y +5z
		// f(2,3,4) = 3*2 + 2*3 + 5*4 = 26

		System.out.println(power(2, 3));
		System.out.println(power(4, 2));

	}

}
