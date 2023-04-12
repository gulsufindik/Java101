package com.gulsufindik;
import java.util.Scanner;
import java.util.Stack;

public class PalindromStack {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
        System.out.print("Kelime giriniz: ");
        String kelime = scanner.nextLine();

        Stack<Character> karakterStack = new Stack<>();

        for (int i = 0; i < kelime.length()/2; i++) {
            karakterStack.push(kelime.charAt(i));
        }

        boolean palindrom = true;
        for (int i = 0; i < kelime.length(); i++) {
            if (karakterStack.pop() != kelime.charAt(i)) {
                palindrom = false;
                break;
            }
        }

        if (palindrom) {
            System.out.println(kelime + " kelimesi palindromdur.");
        } else {
            System.out.println(kelime + " kelimesi palindrom değildir.");
        }
    }
}