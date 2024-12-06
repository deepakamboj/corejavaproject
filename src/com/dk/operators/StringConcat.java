package com.dk.operators;

public class StringConcat {

	public static void main(String[] args) {
		int a = 10, b = 20, c = 30;
		String d = "sadhu";

		System.out.println(a + b + c + d);//60sadhu
		System.out.println(d + a + c + b);//sadhu103020
		System.out.println(b + d + c + a);//20sadhu3010

	}

}
