package com.dk.oops;

public class MySingleton {
	
	private static MySingleton mySingleton; //variable to hold an object of MySingleton type
	
	private MySingleton() {            // private constructor
		
	}
		public static MySingleton getInstance() {  // factory method
			
			if(mySingleton==null) {
			mySingleton= new MySingleton();
			}
			return mySingleton;
		}
	

}
