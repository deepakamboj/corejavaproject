package com.dk.interfaces;

public class WishInDiffStates  {

	public static void main(String[] args) {
		UttarPradesh up = () -> {
			System.out.println("Namste");

		};
		up.wish();

		Rajasthan rj = () -> {
			System.out.println("Ghadi khammba");
		};
		rj.wish();
	}
	


}
