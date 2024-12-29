package com.dk.oops;

public class Test {

	public static void main(String [] args) {
		
MySingleton mysingleton1 = MySingleton.getInstance();
System.out.println(mysingleton1.hashCode());

MySingleton mysingleton2 = MySingleton.getInstance();
System.out.println(mysingleton2.hashCode());


}
}