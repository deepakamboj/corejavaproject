package com.dk.flowcontrol;

import java.util.Scanner;

public class ForLoopReverseSeriesDiffBy2 {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		System.out.println("enter the starting number of the series");
		int start = s.nextInt();
		System.out.println("your series started with"+" " +start+" "+"decresed by 2 is = ");	
		
		reversing(start);
	}

	public static void reversing(int start) {

		for (int i = start; i > 0; i -= 2) { 

			System.out.print(" "+i); 

		}
	}
}
