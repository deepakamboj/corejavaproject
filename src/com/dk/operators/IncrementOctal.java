package com.dk.operators;

public class IncrementOctal {

	public static void main(String[] args) {

		int x = 001, y = 010, z = 100;
		System.out.println("x=" + x);
		System.out.println("y=" + y);
		System.out.println("z=" + z);

		int i = --x + y++ - z-- - --z + ++y - --x + y-- - --x;

		System.out.println();
		System.out.println("x=" + x);
		System.out.println("y=" + y);
		System.out.println("z=" + z);
		System.out.println("i=" + i);

	}

}
