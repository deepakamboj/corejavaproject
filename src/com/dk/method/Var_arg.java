package com.dk.method;

public class Var_arg {
	
	public void m1(int...a) {  // no static keyword is used bcoz we will use it by creating a object of the class.
		
		System.out.println("This is a vararg method");
	}
	public static void main(String[] args) {
		Var_arg v = new Var_arg();
		v.m1();
		v.m1(10);
		v.m1(10,20);
		
		
		
	}

}
