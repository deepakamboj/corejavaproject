package com.dk.interfaces;

public class AbstractChild extends AbstractClassConstructor {

	public AbstractChild(int x, String name) {
		super(x, name);
		//System.out.println("I am from Child");
	}

	public static void main(String[] args) {
		AbstractChild abs = new AbstractChild(101, "Deepa");
		abs.abstractMethod();
		abs.simple();

	}

	@Override
	public void abstractMethod() {
		System.out.println("I am abstract method");
	}
}
