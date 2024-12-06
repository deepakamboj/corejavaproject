package com.dk.custom;

public class EmployeeClient {
	
	public static void main(String[] args) {
		
		Employee e1 =new Employee(101,"abc");
		Employee e2 =new Employee(102,"bcd");
		Employee e3 =new Employee(103,"cde");
		Employee e4 =new Employee(104,"def");
		Employee e5 =new Employee(105,"efg");
		
		Employee [] employees = new Employee[5];
		
		employees[0] = e1;
		employees[1] = e2;
		employees[2] = e3;
		employees[3] = e4;
		employees[4] = e5;
		
		for(int i =0; i<employees.length;i++) {
			System.out.println(" The list of employees is ="+employees[i]);
		}
			
	}

}
