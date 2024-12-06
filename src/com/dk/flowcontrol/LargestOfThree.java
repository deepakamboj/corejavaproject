package com.dk.flowcontrol;

public class LargestOfThree {

	public static String largest(int i, int j, int k) {
		
		
	if(i>j) {
		
		if(i>k) 
		return(i+" "+"is largest");
		
	 else 
		return(k+" "+"is largest");
	 
	
	}
	else { 
		if(j>k) {
			
			return(j+" "+"is largest");
		}else 
			return(k+" "+"is largest");
		
		}
	}
	

	public static void main(String[] args) {
		
		String result;
		result= largest(600,599,300);
		System.out.println(result);

	}

}
