package com.dk.basicmathsprogram;
import java.util.Scanner;
public class AsciiClient {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter any character a-z,A-Z");
		char ch =sc.next().charAt(0);
		System.out.println("Please enter any integer from range 0-65535");
		int i =sc.nextInt();
		Utility.asciiValuesOfCharacters(ch,i);
	}

}
