package com.dk.oops;

public class Employee {
	
public static void main(String[] args) {
	EncapsulationEmployee employee1= new EncapsulationEmployee(100,"Ashish");
	//System.out.println(employee1.getName());
	
	employee1.setId(102);
	employee1.setName("Ashish Singh");
	System.out.println(employee1.getId());
	System.out.println(employee1.getName());
}
	
}
