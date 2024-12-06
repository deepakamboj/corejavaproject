package com.dk.operators;

public class instanceOfOperator {

	public static void main(String[] args) {
		Thread t1 = new Thread();
		System.out.println(t1 instanceof Thread);
		System.out.println(t1 instanceof Runnable);// Runnable is interface of Thread class
		System.out.println(t1 instanceof Object);// object is parent class of every class
		Object o = new Object();
		System.out.println(o instanceof String);// String is child of Object class

	}

}
