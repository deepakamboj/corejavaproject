package com.dk.flowcontrol;

public class SumOfDigits {

	public static void main(String[] args) {

		int result = sumOfDigits(245);
		System.out.println("The sum of the digits of given number =" + result);
	}

	public static int sumOfDigits(int number) {

		int sum = 0;
		while (number > 0) {
			int r = number % 10;
			sum = sum + r;// 5+4+2
			number = number / 10;

		}
		return sum;
	}

}
