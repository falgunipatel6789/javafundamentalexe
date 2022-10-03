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

	Product productHighestRating(Product[] product) {
		byte count = 0;
		Product prodinfo = null;
		for (Product prod : product) {
			if (prod.rating > count) {
				count = prod.rating;

			}
			prod.rating = count;
			prodinfo = prod;
		}
		return prodinfo;
	}

	Product productLeastPrice(Product[] product) {
		double count = 0.0f;
		Product prodinfo = null;
		for (Product prod : product) {
			if (prod.price > count) {
				count = prod.price;

			}
			prod.price = count;
			prodinfo = prod;

		}
		return prodinfo;

	}

	Product productMostPrice(Product[] product) {
		double count = 0.0f;
		Product prodinfo = null;
		for (Product prod : product) {
			if (prod.price > count) {
				count = prod.price;
				prodinfo = prod;
				System.out.println("count   " + count);
			}

			prod.price = count;
		}

		System.out.println(prodinfo.name + prodinfo.price);

		return prodinfo;

	}
}
