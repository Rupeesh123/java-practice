package com.tcs.practice.dhanunjay;

public class ControlStatementsDemo {

	public static void main(String[] args) {

		int mathsMarks = 35;
		int englishMarks = 6;
		int scienceMarks = 35;
		int teluguMarks = 5;
		int totalMarks = mathsMarks + englishMarks + scienceMarks + teluguMarks;
		int counter = 0;

		System.out.println("Total Marks are : " + totalMarks);

		if (totalMarks >= 140) {
			if (mathsMarks >= 35 && englishMarks >= 35 && scienceMarks >= 35 && teluguMarks >= 35)
				System.out.println("PASS");
			else
				System.out.println("FAIL");
		} else {
			if (mathsMarks >= 35) {

			} else {
				counter = counter + 1;
			}
			if (englishMarks >= 35) {

			} else {
				counter = counter + 1;
			}

			if (scienceMarks >= 35) {

			} else {
				counter = counter + 1;
			}
			if (teluguMarks >= 35) {

			} else {
				counter = counter + 1;
			}

			if (counter <= 1) {
				System.out.println("PASS");
			} else {
				System.out.println("FAIL");
			}

			//
		}

	}

}
