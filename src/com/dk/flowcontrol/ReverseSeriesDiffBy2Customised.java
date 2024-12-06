package com.dk.flowcontrol;
import java.util.Scanner;

public class ReverseSeriesDiffBy2Customised {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		System.out.println("enter the starting number of the series");
		int start = s.nextInt();
		// System.out.println("your series starting from "+start+" decresed by 2 will be
		// ");
		System.out.println("How many elements you want to print");
		int limit = s.nextInt();
		reversing(start, limit);

	}

	public static void reversing(int start, int limit) {

		for (int i = 1; i <= limit; i++) {

			System.out.print(start + " ");
			start = start - 2;
		}
	}
}
