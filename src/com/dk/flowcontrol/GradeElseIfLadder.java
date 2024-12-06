package com.dk.flowcontrol;

public class GradeElseIfLadder {

	public String checkGrade(int percentage) {
		
		String grade = null;     // we have to intialize local variable
		if (percentage > 100) {

			grade = "Not a correct percentage";

		} else if (percentage >= 85) {
			grade = "You got A grade";

		} else if (percentage < 85 && percentage >= 75) {
			grade = "You got B grade";

		} else if (percentage < 75 && percentage >= 55) {
			grade = "You got C grade";

		} else if (percentage < 55 && percentage >= 40) {
			grade = "You got D grade";

		} else if (percentage < 40) {
			grade = "You got E grade";

		}

		return grade;
	}

	public static void main(String[] args) {

		String result;

		GradeElseIfLadder g = new GradeElseIfLadder();
		result = g.checkGrade(71);

		System.out.println(result);

	}
}
