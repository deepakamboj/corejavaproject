package com.dk.interfaces;

interface Add2Numbers {
	void add();

}

interface Add3Numbers {
	void add();

}

public class SameNameMethodWithDifferentWorking {

	public static void main(String[] args) {
		Add2Numbers numbers = () -> {
			int a = 10, b = 20, c = 0;
			c = a + b;
			System.out.println(c);
			System.out.println("Hi");
			System.out.println("-----------------");
		};
		numbers.add();
		Add3Numbers number = () -> {
			int a = 10, b = 20, c = 30, d = 0;
			d = a + b + c;
			System.out.println(d);
			System.out.println("Hello");

		};
		number.add();
	}

}
