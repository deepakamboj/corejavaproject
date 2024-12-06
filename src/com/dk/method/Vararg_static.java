package com.dk.method;

public class Vararg_static {
	
	public static void sum(int...a) {
		
		int total = 0;
		for(int x: a) {
			total= total+x;
		}
		System.out.println("Sum is:"+total);
	}

	
	public static void main(String[] args) {
		sum();
		sum(10,20);
		sum(10,20,30);
		sum(10,20,30,40);
		sum(10,20,30,40,50);
	}
}
