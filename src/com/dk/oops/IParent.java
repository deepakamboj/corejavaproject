package com.dk.oops;


	public class IParent {
	    int x = 10;
	    {
	        m1();
	        System.out.println("IParent");
	    }

	    public IParent() {
	        System.out.println("Parent Constructor");
	    }

//	    public static void main(String[] args) {
//	    	
//	        IParent icf = new IParent();
//	        System.out.println("IParent Main Method");
//	    }

	    public void m1() {
	        System.out.println(y);
	    }

	    {
	        System.out.println("SIIB");
	    }
	    int y = 20;
	}


