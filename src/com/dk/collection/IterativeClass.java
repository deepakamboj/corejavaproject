package com.dk.collection;

import java.util.ArrayList;
import java.util.Iterator;

public class IterativeClass {

	public static void intIteration() {
		ArrayList<Integer> arrayList = new ArrayList<Integer>();

		arrayList.add(10);
		arrayList.add(30);
		arrayList.add(20);
		arrayList.add(40);
		arrayList.add(null);
		arrayList.add(10);
		arrayList.add(null);

		System.out.println("Fetch arrayList elements using itr :");
		Iterator<Integer> itr = arrayList.iterator();

		while (itr.hasNext()) {
			System.out.println(itr.next());
		}

	}

	public static void floatIteration() {
		ArrayList<Float> arraylist = new ArrayList<>();
		arraylist.add(10.5f);
		arraylist.add(null);
		arraylist.add(14.6f);
		arraylist.add(14.6f);
		arraylist.add(11.7f);
		System.out.println("Fetch arrayList elements using itr :");
		Iterator<Float> itr = arraylist.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
	}

	public static void stringIteration() {

		ArrayList<String> arraylist = new ArrayList<>();
		arraylist.add("support system");
		arraylist.add("beginner");
		arraylist.add("Java language");
		arraylist.add(null);
		System.out.println("Fetch arrayList elements using itr :");

		Iterator<String> itr = arraylist.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}

	}

	public static void main(String[] args) {
		IterativeClass.intIteration();
		IterativeClass.floatIteration();
		IterativeClass.stringIteration();
	

//		System.out.println("Fetch arrayList elements using normal for loop");
//
//		for (int i = 0; i < arrayList.size(); i++) {
//			System.out.println(arrayList.get(i));
//		}
//
//		System.out.println("Fetch arrayList elements using for each loop");
//		for (Integer i : arrayList) {
//			System.out.println(i);
//		}
//
//		System.out.println("Fetch arrayList elements using java 8 for each");
//
//		arrayList.forEach((e1) -> {
//			System.out.println(e1);
//		});
//
}

}
