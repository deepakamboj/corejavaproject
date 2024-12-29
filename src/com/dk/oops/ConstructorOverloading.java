package com.dk.oops;

public class ConstructorOverloading {
			ConstructorOverloading(double d)
	{
	this(10);
	System.out.println("double-args");
	}
		ConstructorOverloading (int i)
	{
	this();
	System.out.println("int-args");
	}
		ConstructorOverloading()
	{
	System.out.println("no-args");
	}
	public static void main(String [] args)
	{
		ConstructorOverloading t1= new ConstructorOverloading(10.5);  // no-args,int args,double args
		ConstructorOverloading t2= new ConstructorOverloading(10);   //  no args,int-args
		ConstructorOverloading t3= new ConstructorOverloading();    // no-args
	}
	}


