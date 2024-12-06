package com.dk.flowcontrol;

import java.util.Scanner;

public class GradeBySwitch {
	
	public static void main(String[] args) {    //main function
		
		Scanner s = new Scanner(System.in);     // input from console
		System.out.println("Please enter marks of five subjects");
		System.out.println("Please enter marks of Hindi");
		int hindi = s.nextInt();

		System.out.println("Please enter marks of English");
		int english = s.nextInt();

		System.out.println("Please enter marks of Maths");
		int math = s.nextInt();

		System.out.println("Please enter marks of SST");
		int sst = s.nextInt();

		System.out.println("Please enter marks of Science");
		int science = s.nextInt();
		
		// calling all of functions
		
		float total = total(hindi, english, math, sst, science);
		float percentage = percentage(total);
		grade((int) percentage);
		s.close();

	}

	public static float total(int h, int e, int m, int s, int sc) { //  function to calculate total of marks
		float sum = h + e + m + s + sc;
		System.out.println("Sum of all subjects " + sum);
		return sum;

	}

	public static float percentage(float sum) {      // function to calculate percentage
		float per = (sum * 100) / 500;
		System.out.println("Your percentage is " + per);
		return per;

	}

	public static void grade(int p) {     // function to calculate grade

		switch (p / 10) {
		case 10:
			System.out.println("You got A grade");
			break;
		case 9:
			System.out.println("You got A grade");
			break;
		case 8:
			System.out.println("You got B grade");
			break;
		case 7:
			System.out.println("You got B grade");
			break;
		case 6:
			System.out.println("You got C grade");
			break;
		default:
			System.out.println("You got D grade");
			break;

		}

	}

}
