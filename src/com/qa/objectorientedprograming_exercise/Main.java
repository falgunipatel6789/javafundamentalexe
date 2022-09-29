package com.qa.objectorientedprograming_exercise;

public class Main {

	public static void main(String[] args) {
		Product product;
		product = new Product(4, "webcam", 20.0, "asdf", (byte) 5, 10.0, true);
		/*
		 * product.id = 1;
		 * 
		 * product.name = "computer"; product.price = 1200.0f;
		 * 
		 * product.category = "class A"; product.rating = 5; product.isAvailable = true;
		 * 
		 * System.out.println(" product id is " + product.id);
		 * System.out.println(" product name is " + product.name);
		 * System.out.println(" product category is " + product.category);
		 * 
		 */
		product.productdetail();
		double productdiscprs = product.productdiscountprice();
		System.out.println(" product discount price is " + productdiscprs);

		System.out.println(" Product final price is " + product.productfinalprice());
		
		Product.productclass();

	}

}
