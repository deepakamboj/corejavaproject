package com.dk.custom;
import java.util.Scanner;
public class StudentClient {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("How many student you want to insert");
		int numOfStudent = sc.nextInt();
		
		Student[] s = new Student[numOfStudent];
		for(int i=0;i<s.length;i++) {
			
			System.out.println("Please insert id of the students "+(i+1));
			int id=sc.nextInt();
			
			System.out.println("Please insert name of the students "+(i+1));
			String name = sc.next();
			
			s[i]= new Student(id,name);
			
		}
          for(int i =0;i<s.length;i++) {
        	  s[1].setName("Deepa") ;  
        	 System.out.println(s[i]);
          }
        //s[1].setName("kamboj") ; 
          
	}
	

}
