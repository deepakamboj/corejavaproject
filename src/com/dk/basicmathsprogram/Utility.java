package com.dk.basicmathsprogram;

import java.util.Random;

public class Utility {

	public static void fibonacciSeries(int limit) {
		int n1 = 0;
		int n2 = 1;
		int sum = 0;
		for (int i = 0; i < limit; i++) { // 0 1 1 2 3 5 8 13 21
			System.out.print(n1 + " ");
			sum = n1 + n2;
			n1 = n2;
			n2 = sum;

		}
	}

// prime number

	public static void primeNumber(int number) {

		boolean flag = true;

		if (number < 0) {
			number = number * (-1);
		}
		if (number == 1 || number == 0) {
			flag = false;
		}
		for (int i = 2; i <= number / 2; i++) {
			if (number % i == 0) {
				flag = false;
			}

		}
		if (flag == false) {
			System.out.println("The number is not prime");
		} else {
			System.out.println("The number is prime");
		}

	}
	// palindrome 121

	public void palindromeNumber(int number) {
		int temp = number;
		int reverse = 0;
		while (number > 0) {
			int r = number % 10;
			reverse = reverse * 10 + r;// 121
			number = number / 10;

		}
		if (temp == reverse) {
			System.out.println("The number is a plindrome");
		} else {
			System.out.println("The number is not a plindrome");

		}

	}

// factorial

	public static void factorial(int number) {
		int factorial = 1;
		// 5=5*4*3*2*1
		for (int i = number; i >= 1; i--) {
			factorial = factorial * i;// 1*5=5,5*4

			System.out.print(i);
			if (i > 1)
				System.out.print("*");
		}

		System.out.println("=" + factorial);
	}

	// count the number of digits

	public static int countDigits(int number) {
		int count = 0;
		while (number > 0) {
			number = number / 10;
			count++;
		}
		return count;
	}

	// Armstrong number 153=3 digits, 1*1*1+5*5*5+3*3*3= 153

	public static void armstrong(int number) {
		int temp = number;
		int count = countDigits(number);// 3
		double armstrong = 0;

		for (int i = 1; i <= count; i++) {
			int last = number % 10;			
			armstrong += Math.pow(last, count);
			number /= 10;
		}
		if (temp == armstrong)
			System.out.println("Armstrong number");
		else {
			System.out.println(" Not a Armstrong number");
		}
	}

	public static void generateRandomNumbers() {

		double random = Math.random();           // Through math class
		System.out.println("Random number by maths Class= " + random);
		Random random2 = new Random();           // Through random class
		double nextDouble = random2.nextDouble();
		float nextFloat = random2.nextFloat(100);
		float nextFloat2 = random2.nextFloat(100, 200);
		System.out.println("random number double= " + nextDouble + "\n" + "Random number with boundry 100 = "
				+ nextFloat + "\n" + "Random number with lower limit 100 and and upper limit 200 =" + nextFloat2);
	}
	
	public static void asciiValuesOfCharacters(char ch,int i) {
		
		int ascii = ch;
		System.out.println("The ASCII value of given character = "+ascii);
		char ch1 = (char)i;
		System.out.println("The ASCII value of given integer = "+ch1);
		
	}
}
