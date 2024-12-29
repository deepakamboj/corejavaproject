package com.dk.interfaces;

interface InterfVariable {
	int x = 10;

	public void m1();

	public default void m2() {
		System.out.println("interface default method");
	};
}

public class Test1 implements InterfVariable {

	public static void main(String[] args) {
		Test1 test1 =new Test1();

		test1.m2();

		System.out.println();

	}

	@Override
	public void m1() {
		// TODO Auto-generated method stub

	}

}
