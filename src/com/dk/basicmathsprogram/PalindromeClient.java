package com.dk.basicmathsprogram;
import java.util.Scanner;
public class PalindromeClient {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("The eneter the number to check Palindrome");
		int number = sc.nextInt();
		
		Utility p = new Utility();
		p.palindromeNumber(number);

	}

}
