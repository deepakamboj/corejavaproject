package com.dk.basicmathsprogram;
import java.util.Scanner;
public class FactorialClient {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter the number");
		int number = sc.nextInt();
		Utility.factorial(number);

	}

}
