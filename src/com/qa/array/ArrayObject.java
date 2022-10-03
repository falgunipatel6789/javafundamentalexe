package com.qa.array;

public class ArrayObject {

	public static void main(String[] args) {
		Product[] product;
		product = new Product[5];

		product[0] = new Product(1, "computer", 1200.00f, "asdf", (byte) 5, 10, true);
		product[1] = new Product(2, "mouse", 50.00f, "asdf", (byte) 6, 10, true);
		product[2] = new Product(3, "webcam", 100.00f, "asdf", (byte) 7, 20, false);
		product[3] = new Product(4, "ram", 12.00f, "asdf", (byte) 8, 10, true);
		product[4] = new Product(5, "cpu", 15.00f, "asdf", (byte) 9, 10, true);
		ArrayExeUti arrayexeuti = new ArrayExeUti();

		System.out.println("product max price is  " + arrayexeuti.productMostPrice(product));
		//System.out.println("product min price is " + arrayexeuti.productLeastPrice(product));
		//System.out.println("product highest rating is " + arrayexeuti.productHighestRating(product));

	}

}
