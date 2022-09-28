package com.qa.javafundamental_exercise;

public class WhileStatement {

	public static void main(String[] args) {
		int num = 1;
		while (num <= 1000) {
			if (num % 2 != 0) {

				System.out.println(num + "is odd number");
			}
			num++;

		}
	}
}
