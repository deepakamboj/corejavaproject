package com.dk.flowcontrol;

import java.util.Scanner;

public class ReverseCounting {

	public static void reversing() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please insert integer number");
		int i = sc.nextInt();
		if (i > 0) {
			while (i > 0) {
				System.out.println(i);
				i--;
			}
		} else {
			System.out.println("you entered invalid number.Please enter a positive number");
			// String[] a = new String[4];
			// a[0]= "string";
			// main(a);
			//Scanner c = new Scanner(System.in);
			//int y = c.nextInt();
			reversing();
			//main(null);
		}

	}

	public static void main(String[] args) {

		//System.out.println(args[0]+ " " + args[1]);
		
		reversing();
			}

}