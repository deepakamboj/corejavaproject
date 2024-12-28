package com.dk.collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class EmployeeClient {

	public static void main(String[] args) {

		List<Employee> list = new ArrayList<>();

		list.add(new Employee(100, "abc", 10000.00));
		list.add(new Employee(101, "abc", 12000.00));
		list.add(new Employee(102, "bcd", 14000.00));
		list.add(new Employee(103, "def", 16000.00));
		list.add(new Employee(100, "efg", 18000.00));

		Iterator<Employee> itr = list.iterator();

		// Iteration through iterator
		System.out.println("Iteration through iterator");
		System.out.println("----------------------------");
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}

		// Iteration through for loop

		System.out.println("Iteration through for loop");
		System.out.println("----------------------------");
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}

		// Iteration through advanced for loop
		System.out.println("Iteration through advanced");
		System.out.println("----------------------------");
		for (Employee e : list) {
			System.out.println(e);
		}
		// Iteration through for each
		System.out.println("Iteration through for each");
		System.out.println("----------------------------");
		list.forEach(e -> {System.out.println(e);});
		

	}

}
