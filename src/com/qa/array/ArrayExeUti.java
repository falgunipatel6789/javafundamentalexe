package com.qa.array;

public class ArrayExeUti {

	int getsumofarray(int[] numbers) {

		int sum = 0;

		for (int index = 0; index < numbers.length; index++) {

			sum = sum + numbers[index];

		}
		return sum;
	}

	int getmaxofarray(int[] numbers) {
		int max = 0;
		for (int num : numbers) {
			if (num > max) {
				max = num;
			}

		}
		return max;
	}

	int getminofarray(int[] numbers) {
		int min = 0;
		for (int num : numbers) {
			if (num < min) {
				min = num;
			}

		}
		return min;
	}

}
