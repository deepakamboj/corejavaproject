package com.dk.operators;

public class BitwiseOperator {

	public static void main(String[] args) {

		int x = 10;
		int y = 20;
		if (++x > 10 & ++y < 20) { // bitwise AND operator
			++x;
		} else {
			++y;

		}
		System.out.println(x + "   " + y);

		int i = 10;
		int j = 20;
		if (++i > 10 | ++j < 20) { // bitwise OR operator
			++i;
		} else {
			++j;

		}
		System.out.println(i + "   " + j);

	}

}
