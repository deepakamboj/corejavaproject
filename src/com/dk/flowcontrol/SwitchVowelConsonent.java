package com.dk.flowcontrol;
import java.util.Scanner;
public class SwitchVowelConsonent {

	/*
	 * public static void main(String[] args) {
	 * 
	 * char ch = 'E'; switch (ch) {
	 * 
	 * case 'A': System.out.println("This a vowel"); break; case 'E':
	 * System.out.println("This a vowel"); break; case 'I':
	 * System.out.println("This a vowel"); break; case 'O':
	 * System.out.println("This a vowel"); break; case 'U':
	 * System.out.println("This a vowel"); break; default:
	 * System.out.println("This is a consonent");
	 * 
	 * }
	 * 
	 * }
	 */
	
		    public static void main(String[] args) {
	    	
	        Scanner sc = new Scanner(System.in);
	        System.out.println("Enter the character : ");
	        
	        char ch = sc.next(".").toUpperCase().charAt(0);
	       // String s = sc.next(".").toUpperCase();
	        
	        System.out.println(ch);
	        
	        vowelsAndConsonant(ch);
	        sc.close();
	    }

	    private static void vowelsAndConsonant(char ch) {
	        // TODO Auto-generated method stub
	        switch (ch) {
	        case 'A':
	        case 'E':
	        case 'I':
	        case 'O':
	        case 'U':
	            System.out.println("Vowel");
	            break;
	        default:
	            System.out.println("Consonant");
	            break;

	        }
	    }
	}


	
	

