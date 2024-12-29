package com.dk.oops;



	public class IChild extends IParent {
	    int x = 100;
	    {
	        m1();
	        System.out.println("CIIB");
	    }

	    public IChild() {
	        System.out.println("Child Constructor");
	    }

	    public static void main(String[] args) {
	    	
	        IChild icf = new IChild();
	        System.out.println("Child Main Method");
	    }

	    public void m1() {
	        System.out.println(y);
	    }

	    {
	        System.out.println("CSIB");
	    }
	    int y = 200;
	}
