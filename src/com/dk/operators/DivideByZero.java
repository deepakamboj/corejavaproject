package com.dk.operators;

public class DivideByZero {

	public static void main(String[] args) {
		int x = 10;
		if (++x > 10 & (x / 0 > 10)) {
			System.out.println("hi");
		} else {
			System.out.println("Hello");
		}

	}

}
