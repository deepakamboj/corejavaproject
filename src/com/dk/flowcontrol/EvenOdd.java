package com.dk.flowcontrol;

public class EvenOdd {

	public static void main(String[] args) {
		String result ;
		
		EvenOdd eo = new EvenOdd();
		
		result = eo.checkNumber(105);  //holding the returned result
		
		System.out.println(result);

	}

	public  String checkNumber(int i) { //returning string value(instance method)
		
		if (i % 2 == 0) {

			return "The number is even";
		} else {
			return "The number is odd";

		}

	}

}