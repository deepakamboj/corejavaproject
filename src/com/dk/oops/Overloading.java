package com.dk.oops;

public class Overloading {
	protected void sum(int a, int b) {
		int sum = a+b;
		System.out.println("sum is ="+sum);
	}
	public void sum(int a, float b) {
		float sum = a+b;
		System.out.println("sum is ="+sum);
	}
	private void sum(double a, double b) {
		double sum = a+b;
		System.out.println("sum is ="+sum);
	}
	public void sum(int a, int b,int c) {
		int sum = a+b+c;
		System.out.println("sum is ="+sum);
	}
	public float sum(float a, int b) {
		float sum = a+b;
		return sum;
		
	}
	
	public static void main(String[] args) {
		Overloading overloading = new Overloading();
		overloading.sum(2.5, 4.5);
		overloading.sum(3, 4);
		overloading.sum(2,4,5);
		overloading.sum(2, 4.5);
		overloading.sum('a',4.5);
		System.out.println(overloading.sum(2.0f, 3));
		
		
	}
}
