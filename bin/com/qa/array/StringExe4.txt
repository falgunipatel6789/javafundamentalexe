package com.qa.array;

public class StringExe4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] str = { "abc_gmail.com", "abcd*()@gmail.com", "abcd@gmail.com", "test_123@gmail.com",
				"1234@#$@gmail.com" };
		int count = 0;
		int count1 = 0;

		for (String s : str) {

			boolean match = s.matches("[a-zA-Z0-9_.]+");
			// System.out.println(" match password is " + match);
			// System.out.println(match);

			if (match == true) {

				count++;
				System.out.println(" valid password id  is " + s);
			} else {
				count1++;
				System.out.println(" Invalid password id  is " + s);
			}

		}
		System.out.println(" valid password is  " + count);
		System.out.println(" invalid password is " + count1);
	}

}
