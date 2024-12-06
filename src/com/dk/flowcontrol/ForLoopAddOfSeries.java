package com.dk.flowcontrol;

import java.util.Scanner;

public class ForLoopAddOfSeries {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		System.out.println("enter the limit of the series");
		int limit = s.nextInt();

		series(limit); // calling of the function

	} // end of main

	public static void series(int limit) { // method for 1+2+4+7+11+16+...series
		int x = 1;
		int ser = 0;
		int sum = 0;
		
		for (int i = 0; i <= limit; i++) {
			
			ser = x + i;
			System.out.print(ser);//1 + 2 + 4 + 7 
			
			if (i < limit) {       // 0 1 2 3
				System.out.print(" +  "); // + + +
			}
			
			x = ser;              // 1 2 4 7
			sum = sum + ser;      // 1 3 7 14 end of loop

		}
		System.out.print(" = " + sum); // = 14
	}

}
