package com.dk.collection;

public class Employee {
	private int id;
	private String name;
	private double salary;

	public Employee(int id, String name, double salary) {
		this.id = id;
		this.name = name;
		this.salary = salary;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getId() {
		return id;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getname() {
		return name;
	}

	public void setSalary(float salary) {
		this.salary = salary;
	}

	public double getSalary() {
		return salary;
	}
	@Override 
	public String toString() {
		return " Employee Id := "+id+" Employee Name := "+name+" Employee Salary : ="+salary;
	}
}
