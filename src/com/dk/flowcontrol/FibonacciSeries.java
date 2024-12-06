package com.dk.flowcontrol;

import java.util.Scanner;

public class FibonacciSeries {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		System.out.println("enter the length of the series");
		int limit = s.nextInt();

		fibonocci(limit);

	}

	private static void fibonocci(int limit) { // 1 1 2 3 5 8 13 21 34.....

		int n1 = 0;
		int n2 = 1;
		int sum = 0;
		//System.out.print(n1 + " " + n2); // logic 1
		 System.out.println(n1);          //logic 3
		for (int i = 1; i <= limit; i++) {
			 
			//System.out.print(" " +n1);    //logic 2...10 times printing
			System.out.println(" " + n2);   // logic 3...printing 11 times
			sum = n1 + n2;
			//System.out.print(" " +sum);   // logic 1...printing 12 times
			n1 = n2;
			n2 = sum;

		}

	}

}