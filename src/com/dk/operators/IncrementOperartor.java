package com.dk.operators;

public class IncrementOperartor {

	public static void main(String[] args) {
		// https://javaconceptoftheday.com/quiz-on-increment-and-decrement-operators/
		int a = 11;
		a = a++ + ++a;

		/*
		 * Initially, i=11, i = i++ + ++i i = (i is used before increment) + (i is used
		 * after increment) i = 11(i=12) + 13(i=13) i = 11 + 13 = 24
		 */
		/*
		 * System.out.println(a); IncrementOperartor.question1();
		 * IncrementOperartor.question2(); IncrementOperartor.question4();
		 */

		/*
		 * float m = 1010, n = 1010;
		 * 
		 * System.out.println(m++ / ++n * n-- / --m);
		 */
		int ch = 'A';
		char ch1 = 'A';

		/*
		 * System.out.println(ch++);// ch is interger output 65
		 * System.out.println(ch);// 66 System.out.println(ch1++);// ch1 is character
		 * output A System.out.println(ch1);// B
		 */
		/*
		 * char c = "123".charAt(1);
		 * 
		 * System.out.println(c++ + ++c);
		 */
		/*
		 * String s1 = "123"; char c = s1.charAt(1);// unicode of 0 index is 50 of "123"
		 * System.out.println(c); int r = c; System.out.println(r);
		 * System.out.println(c++ + ++c);// 50+52=102
		 */		
		char t = 'A',T  = 'a';
		int i =T;
        System.out.println(i);
        System.out.println(t++ * ++T);
		
		
		
		
	}

	public static void question1() {
		int a = 11, b = 22, c;

		c = a + b + a++ + b++ + ++a + ++b;
		/*
		 * Given, a=11, b=22 c = a + b + a++ + b++ + ++a + ++b c = 11 + 22 + (a is used
		 * before increment) + (b is used before increment) + (a is used after
		 * increment) + (b is used after increment) c = 11 + 22 + 11(a=12, b=22) +
		 * 22(a=12, b=23) + 13(a=13, b=23) + 24(a=13, b=24) c = 11 + 22 + 11 + 22 + 13 +
		 * 24 = 103 and a=13, b=24
		 */

		System.out.println("a=" + a);
		System.out.println("b=" + b);
		System.out.println("c=" + c);
	}

	public static void question2() {

		System.out.println("\nOutput of question2");
		int i = 0;

		i = i++ - --i + ++i - i--;
		// 0 - 0 + 1 - 1
		System.out.println(i);
	}

	public static void question3() {

		boolean b = true;

		// b++; (No. ++ or — can’t be applied to boolean types)

		System.out.println(b);
	}

	public static void question4() {
		int i = 1, j = 2, k = 3;

		int m = i-- - j-- - k--; // 1-2-3

		System.out.println("i=" + i);
		System.out.println("j=" + j);
		System.out.println("k=" + k);
		System.out.println("m=" + m);
	}

	/*
	 * int r = 11;
	 * 
	 * int s = --(r++);//nesting of increment and decrement operator is not allowed
	 */

}
