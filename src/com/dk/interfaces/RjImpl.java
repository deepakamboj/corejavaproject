package com.dk.interfaces;

public class RjImpl implements Rajasthan{

	
	public void wish() {
		System.out.println("You are in Rajasthan");
		
	}
	public static void main(String[] args) {
		Rajasthan rajasthan = new RjImpl();
		rajasthan.wish();

	}

}
