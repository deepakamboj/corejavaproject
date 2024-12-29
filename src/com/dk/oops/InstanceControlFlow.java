package com.dk.oops;


	public class InstanceControlFlow {
	    int x = 10;
	    
	    {
	        m1();
	        System.out.println("FIIB");
	        System.out.println(x);
	       
	        
	    }

	    public InstanceControlFlow() {                    //constructor
	        System.out.println("Parent Constructor");
	    }

	    public static void main(String[] args) {
	    	
	        InstanceControlFlow icf = new InstanceControlFlow();
	        System.out.println("Main Method");
	        
	    }// main

	    public void m1() {
	        System.out.println(y);
	    }

	    {
	        System.out.println("SIIB");
	    }
	    int y = 20;
	   
	}


