package com.dk.flowcontrol;

public class ArrayIntCharStringDemo {

	public static void main(String[] args) {
		System.out.print("The array of integers = ");
		ArrayInt();
		System.out.println();
		System.out.print("The array of Characters = ");
		ArrayChar();
		System.out.println();
		System.out.print("The array of String = ");
		ArrayString();

	}

	public static void ArrayInt() {

		int a[] = { 10, 20, 30, 40, 50 };

		for (int i = 0; i < a.length; i++) {

			System.out.print(" " + a[i]);

		}

	}

	public static void ArrayChar() {

		char a[] = { 'a', 'i', 'o', 'u', 'e' };

		for (int i = 0; i < a.length; i++) {
			
			System.out.print(" " + a[i]);

		}

	}

	public static void ArrayString() {

		String a[] = { "Ram", "Ravi", "Golu", "Monu", "Ramesh" };
		//String a = "Avinash";

		for (int i = 0; i < a.length; i++) {
		//char ch	= a.charAt(i);
			//System.out.print(" " +ch);
			System.out.print(" "+a[i]);

		}

	}
}
