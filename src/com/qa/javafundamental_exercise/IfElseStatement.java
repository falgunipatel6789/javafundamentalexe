package com.qa.javafundamental_exercise;

public class IfElseStatement {

	public static void main(String[] args) {
		int num1;
		num1 = 60;
		if (num1 % 2 == 0) {
			System.out.println(num1 + "is even");
		} else {
			System.out.println(num1 + "is odd");
		}
		/*
		 * decide increment percentage based on the experience if experience is greater
		 * than 2 years and department is development then increment 10% if experience
		 * is greater than 5 years and department is sales then increment 8% else
		 * increment 5%
		 * 
		 */
		float salary;
		salary = 3800.50f;
		byte experience;
		experience = 8;
		char department;
		department = 'O';
		byte incrementPercentage;
		if (experience > 2 && department == 'D') {
			incrementPercentage = 10;
			System.out.println("1");

		} else if (experience > 5 && department == 'S') {
			incrementPercentage = 8;
			System.out.println("2");
		} else {
			incrementPercentage = 5;
			System.out.println("3");
		}
		salary = salary + (salary * incrementPercentage / 100);
		System.out.println(salary);

	}

}
