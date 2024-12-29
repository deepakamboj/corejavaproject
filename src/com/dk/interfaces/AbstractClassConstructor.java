package com.dk.interfaces;

public abstract class AbstractClassConstructor {

	int x;
	String name;
	public AbstractClassConstructor(int x, String name) {
	this.x=x;
	this.name=name;
	//System.out.println("I am parent");	
	}
	public void simple() {
		System.out.println("Simple method");	
	}
	
	abstract public  void abstractMethod();
}
