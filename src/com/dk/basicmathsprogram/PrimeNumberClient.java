package com.dk.basicmathsprogram;

import java.util.Scanner;

public class PrimeNumberClient {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the number to check");
		int number = scanner.nextInt();
		Utility.primeNumber(number);
	}

}
