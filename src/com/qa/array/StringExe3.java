package com.qa.array;

public class StringExe3 {


		int iq = 10;
		int height = 1;
		int mascularStrength = 23;

		public static void main(String[] args) {
		
			StringExe3 manit = new StringExe3();
			StringExe3 ali = new StringExe3();

			System.out.println(manit.iq);
			System.out.println(manit.mascularStrength);
			System.out.println(manit.height);

			System.out.println(ali.iq);
			System.out.println(ali.mascularStrength);
			System.out.println(ali.height);

			manit.playing();

			ali.gyming();
			ali.studying();

			System.out.println(manit.iq);
			System.out.println(manit.mascularStrength);
			System.out.println(manit.height);

			System.out.println(ali.iq);
			System.out.println(ali.mascularStrength);
			System.out.println(ali.height);

		}

		void studying() {

			iq = iq + 1;
		}

		void playing() {

			height = height + 1;
			mascularStrength++;
		}

		void gyming() {

			mascularStrength++;

		}
	}
