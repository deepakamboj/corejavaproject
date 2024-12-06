package com.dk.custom;

public class Student {

	private int id;
	private String name;

	public void setId(int id) {
		this.id = id;

	}

	public int getId() {
		return id;
	}

	public void setName(String name) {
		this.name = name;

	}

	public String getName() {
		return name;
	}

	public Student(int id, String name) {

		this.id = id;
		this.name = name;
	}

	@Override
	public String toString() {

		return "Student : " + id + " , " + name;
	}
}
