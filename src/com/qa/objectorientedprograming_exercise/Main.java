package com.qa.objectorientedprograming_exercise;

public class Main {

	public static void main(String[] args) {
		Product product = new Product();
		product.id = 1;
		product.name = "computer";
		product.price = 1200.0f;

		product.category = "class A";
		product.rating = 5;
		product.isAvailable = 'y';
		System.out.println(" product id is " + product.id);
		System.out.println(" product name is " + product.name);
		System.out.println(" product category is " + product.category);

	}

}
