package com.dk.method;

public class Addition {
	public static void main(String[] args) {
		int c;
		c = sum(10, 20);
		System.out.println("Addition of two numbers " + c);

	}

	public static int sum(int a, int b) {
		int c = a + b;
		return c;
	}
}