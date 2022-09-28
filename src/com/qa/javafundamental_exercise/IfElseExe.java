package com.qa.javafundamental_exercise;

public class IfElseExe {

	public static void main(String[] args) {

		double salary = 35000f;

		byte jobYear = 7;
		if (jobYear > 6) {
			double increment;
			increment = salary + (salary * 10) / 100;
			salary = increment;
			System.out.println(" new salary is " + salary);
		}

	}

}
