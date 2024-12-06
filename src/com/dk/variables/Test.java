package com.dk.variables;

public class Test {
	int x=10;         //Different for all the objects
	static int y =20;//shared by all the objects

	public static void main(String[] args) {

		//System.out.println("This is a test class");
		Test t1 = new Test();
		t1.x =888;
		t1.y = 999;
		Test t2 = new Test();
		System.out.println("The vaule for the first object t1 ="+t1.x+" "+t1.y);
		System.out.println("The value for the second object t2 ="+t2.x+" "+t2.y);
		System.out.println("सर्वे भवन्तुः सुखिन:");
		
	}

}
