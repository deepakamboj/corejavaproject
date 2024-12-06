package com.dk.basicmathsprogram;

import java.util.Scanner;

public class FibonacciSeriesClient {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the limit of the series");
		int limit = scanner.nextInt();
		
		Utility.fibonacciSeries(limit);

	}

}
