package com.qa.array;

public class ArrayExe {

	public static void main(String[] args) {

		int[] numbers;
		numbers = new int[8];

		numbers[0] = 1;
		numbers[1] = 6;
		numbers[2] = 2;
		numbers[3] = 8;
		numbers[4] = 3;
		numbers[5] = 9;
		numbers[6] = 15;
		numbers[7] = 0;

		for (int arr : numbers) {

			System.out.println(arr);

		}
		ArrayExeUti arrayexeuni = new ArrayExeUti();
		int sum = arrayexeuni.getsumofarray(numbers);
		System.out.println( " sum of array is "+ sum);
		
		int max = arrayexeuni.getmaxofarray(numbers);
		System.out.println( " max of array is "+ max);
		
		int min = arrayexeuni.getminofarray(numbers);
		System.out.println( " max of array is "+ min);
		
		
		// Accessing array elements
		// manipulating array elements

	}

}
