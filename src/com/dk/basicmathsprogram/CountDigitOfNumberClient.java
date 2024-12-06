package com.dk.basicmathsprogram;

import java.util.Scanner;

public class CountDigitOfNumberClient {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter the number");
		int number = sc.nextInt();
		int count=Utility.countDigits(number);
		System.out.println("The number of digits of the given number="+count);

	}

}
