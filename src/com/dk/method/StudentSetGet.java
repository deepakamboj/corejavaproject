package com.dk.method;

public class StudentSetGet {
	
	
	public static void main(String[] args) {
		SetGet s1 = new SetGet();//we have to create object of that class--- 
		                         //which have functions you want to call in this class.
		SetGet s2 = new SetGet();
		
		s1.setId(101);
		s1.setName("Deepa");
		
		
		System.out.println(s1.getId());
		System.out.println(s1.getName());
		
		s2.setId(102);
		s2.setName("kamboj");
		System.out.println(s2.getId());
		System.out.println(s2.getName());
		

	}

}
