package com.dk.modifiers;

public class StaticInstanceDemo {
	int x = 10;
	static int y = 20;

	void m1() {
		System.out.println(y);
		System.out.println(x);

	}
	static void m2() {
		System.out.println(y);
		StaticInstanceDemo si = new StaticInstanceDemo();
		System.out.println(si.x);	
		
	}

	public static void main(String[] args) {

		StaticInstanceDemo si = new StaticInstanceDemo();
		si.x = 888;
		si.y = 999;
		System.out.println(si.x + " " + si.y);

		StaticInstanceDemo si2 = new StaticInstanceDemo();

		System.out.println(si2.x + " " + si2.y);
	}

}
