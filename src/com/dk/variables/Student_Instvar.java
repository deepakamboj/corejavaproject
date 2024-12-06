package com.dk.variables;

public class Student_Instvar {
	int id;
	String name;
	
	public Student_Instvar(int id,String name) {
		this.id=id;
		this.name=name;
		
	}
	public static void main(String[] args) {
		Student_Instvar s1 = new Student_Instvar(101,"Deepa");
		Student_Instvar s2 = new Student_Instvar(102,"Kamboj");
		System.out.println(s1.id);
		//System.out.println(s1);//instance variable name is not used here
		System.out.println(s2.id);
		System.out.println(s2.name);
		
	}

}
