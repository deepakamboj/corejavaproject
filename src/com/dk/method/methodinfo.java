package com.dk.method;

public class methodinfo {
	
	public static void add() {
		
		System.out.println("i have nothing to add");

	}
	
	public static void add(int a , int b) {
		
		int sum = a+b;
		
		System.out.println("===Method with two arguments===");
		System.out.println(sum +" is the sum of" +a +" "+b );
			
		
	}

     public static void add(int a , int b, int c) {
    	 
    	 int sum = a+b+c;
		
		System.out.println("===Method with three arguments===");
		System.out.println("sum of three numbers= "+sum);
	}
     
     public static void add(int a , int b, int c, int d) {
    	 
    	 int sum = a+b+c+d;
 		
 		System.out.println("===Method with four arguments===");
 		System.out.println("sum of four numbers= "+sum);
 	}
	
	public static void main(String[] args) {
		
		add();
		add(10,20);
		add(10,20,30);
		add(10,20,30,40);
	}
}
