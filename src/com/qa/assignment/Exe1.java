package com.qa.assignment;

public class Exe1 {

	void multiplication(int num) {
		int mulnumber = 2;
		for (int i = 1; i <= 10; ++i) {
			mulnumber = num * i;
			System.out.println(mulnumber);
		}
	}

	public static void main(String[] args) {
		int sum = 0;
		int multi = 8;
		Exe1 e = new Exe1();
		for (int i = 1; i <= 10; ++i) {
			System.out.println(i);
			sum = sum + i;

		}
		System.out.println("sum of first 10 natural number is " + sum);
		System.out.println(" multiplication table of  " + multi + " is \n");
		e.multiplication(multi);

	}

}
