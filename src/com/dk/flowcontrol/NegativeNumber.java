package com.dk.flowcontrol;

public class NegativeNumber {
	
	
	public static void checkNumber(int j) {

		int i = j;

		if (j<0) {
			System.out.println("Number is negative");
		} 
		
		else {
			System.out.println("Number is positive");
		}

	}


	public static void main(String[] b) {

		NegativeNumber.checkNumber(-100); // static function called by class name
		
		
		
	}

	
}