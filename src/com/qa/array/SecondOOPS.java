package com.qa.array;


	class Car {

		int i = 20;

		void steeringWheel() {
			System.out.println("inside steering Wheel of Car..."+i);
		}
	}

	class Polo extends Car {

		int j = 10;
		Polo p1 =new Polo();

		void abs() {
			System.out.println("inside abs of Polo.."+i);
			
			System.out.println(j);//You can use variables of parent class anywhere in the child class...
		}
		
	}

	public class SecondOOPS {

		public static void main(String[] args) {
			
			Polo p = new Polo();
			Car c1 = new Polo();
			p.abs();
			p.steeringWheel();
			//c1.steeringWheel();

			
		}
	}




