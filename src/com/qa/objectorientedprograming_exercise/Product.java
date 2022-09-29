package com.qa.objectorientedprograming_exercise;

public class Product {
	int id;
	String name;
	double price;
	String category;
	byte rating;
	double discountPercentage;
	boolean isAvailable;

	static String SELLERNAME = "falguni";
	static int CONTACTNO = 0123456;
	static String EMAIL = "patel_sarin@yahoo.co.uk";

	Product() {

		id = 2;
		name = "mouse";
		price = 201.50f;
		category = "asdf";
		rating = 5;
		isAvailable = true;

	}

	public Product(int id, String name, double price, String category, byte rating, double discountPercentage,
			boolean isAvailable) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
		this.category = category;
		this.rating = rating;
		this.discountPercentage = discountPercentage;
		this.isAvailable = isAvailable;
	}

	static void productclass() {

		System.out.println("seller name is  "+ SELLERNAME);
		System.out.println("seller contact is  " + CONTACTNO );
		System.out.println("seller email is  " + EMAIL);

	}

	void productdetail() {
		System.out.println(" product id is " + id);
		System.out.println(" product name is " + name);
		System.out.println(" product category is " + category);

	}

	double productdiscountprice() {
		return (price * discountPercentage / 100);

	}

	/*
	 * Calculate the total salary after the increment
	 */

	double productfinalprice() {
		return price - productdiscountprice();
	}

}
