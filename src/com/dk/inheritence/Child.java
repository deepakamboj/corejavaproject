package com.dk.inheritence;

import java.io.IOException;

class Parent {
	public void m1(int i) throws IOException {
		System.out.println("m from parent");
	}
	

}

public abstract class Child extends Parent {
	
	public void m1(int i)
	{
	}
	

	//public abstract void m1();	
//public static void main(String [] args) {
//	Parent c = new Parent();
//	c.m1();
}
	
