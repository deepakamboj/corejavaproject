package com.dk.basicmathsprogram;

//public class Test {
//
//	public static void main(String[] args) {
//		int num = 123456;
//		int sum = 0;
//		// System.out.println(null);
//		while (num > 0) {
//			int r = num % 10;// =r
//			sum = sum * 10 + r; 
//			num = num / 10;// =q
//			//System.out.println();
//			System.out.print(sum);
//			System.out.println(" ");
//		}
		
		
		
		
//	}
//}


import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows you want to print: ");
        int rows = sc.nextInt();
        int i, j, k;
        for (i = 1; i <= rows; i++) {
            for (j = rows; j > i; j--) {
                System.out.print(" ");
            }
            System.out.print("*");
            for (k = 1; k < 2 * (i - 1); k++) {
                System.out.print(" ");
            }
            if (i == 1) {
                System.out.println("");
            } else {
                System.out.println("*");
            }
        }
//        for (i = rows - 1; i >= 1; i--) {
//            for (j = rows; j > i; j--) {
//                System.out.print(" ");
//            }
//            System.out.print("*");
//            for (k = 1; k < 2 * (i - 1); k++) {
//                System.out.print(" ");
//            }
//            if (i == 1)
//                System.out.println("");
//            else
//                System.out.println("*");
//        }
    }
}