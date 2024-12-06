package com.dk.flowcontrol;

public class LargestNumber {
	
	
	public static void main(String[] args) {
		
		
		LargestNumber l = new LargestNumber(); 
		l.checkNumber(1000,199);                  // instance function called

	}

	public void checkNumber(int i, int j) {       // instance function with parameters
		
		if (i > j) {
			System.out.println(i + " is greater than " + j);
		} else {
			System.out.println(j + " is greater than " + i);
		}

	}

}