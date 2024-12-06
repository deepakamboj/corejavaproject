package com.dk.flowcontrol;

import java.util.Scanner;

public class SumOfDigitsOfNumber {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		System.out.println("Please enter the number to add its digits");
		int number = s.nextInt();

		if (number <= 9) {
			System.out.println("you have entered only single digit the sum will be same =" + number);
		} else {

			int result = sumOfDigits(number);
			System.out.println("Sum of the digits of the given number=" + result);

			if (result > 9) {
				int last = sumOfDigits(result);
				result = last;
			}
			System.out.println("The sum until one digit " + result);
		}
		s.close();
	}

	public static int sumOfDigits(int number) {

		int sum = 0;

		for (int i = number; i > 0; i = i / 10) {

			int r = i % 10;
			sum = sum + r;

		}

		// Through while loop
		/*
		 * while(number>0) { int r=number%10; sum=sum+r; number=number/10;
		 * 
		 * }
		 */

		return sum;
	}

}
