package com.qa.array;

public class StringExe3 {

	public static void main(String[] args) {
		// String str1 ="abdrgh1234_.";

		String[] str = { "abc_gmail.com", "abcd*()@gmail.com", "abcd@gmail.com", "test_123@gmail.com",
				"1234@#$@gmail.com" };
		int count = 0;

		for (String s : str) {
			System.out.println(s);
		
			boolean match = s.matches("[a-zA-Z0-9_.]+");
			System.out.println(" match password  is " + match);

			System.out.println(match);
			if (match == true)

				count++;
		

		}
		

	}

}

