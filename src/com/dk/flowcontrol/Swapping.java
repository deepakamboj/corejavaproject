package com.dk.flowcontrol;

public class Swapping {

	public static void main(String[] args) {
		int a = 10;
		int b = 30;
		int c = 0;
		System.out.println("before swapping a =" + a + " and b=" + b);
		c = a;
		a = b;
		b = c;
		System.out.println("after swapping a =" + a + " and b=" + b);

		// swapping without third variable
		
		int i = 5;
		int j = 7;
		System.out.println("befor swapping i =" + i + " and j=" + j);
         // logic 1
		 i=i+j;      // 5+7 = 12,i=12
		 j=i-j;      //12-7 = 5 ,j=5
		 i=i-j;      // 12-5 =7 ,i=7
		// logic 2
		i = i * j;  //7*5=35, i=35
		j = i / j;  //35/7=5 ,j=5
		i = i / j;  // 35/5=7, i=7

		System.out.println("after swapping i =" + i + " and j=" + j);
	}

}
