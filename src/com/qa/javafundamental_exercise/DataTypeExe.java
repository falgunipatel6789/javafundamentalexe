package com.qa.javafundamental_exercise;

public class DataTypeExe {

	public static void main(String[] args) {
		int salary;
	    salary = 40000;
	    float productPrice;
	    productPrice = 200.5f;
	    salary = salary +(salary * 10 / 100); 
	    System.out.println(salary);
	    
	    float discount;
	    discount = (productPrice * 5 / 100);
	    System.out.println("discount is" + discount);
	    float finalPrice;
	    finalPrice = productPrice - discount;
	    System.out.println("final price is" + finalPrice);
	    byte num = 10;
	    System.out.println(num++);
	    System.out.println(num++);
	    System.out.println(++num);
	    System.out.println(++num);
	    /*
         * Logical Operators
         * && AND
         * || OR
         * ^ XOR
         */
        
        // (exp1) && (exp2) && (exp3)
        //Rule
        //If any of the expression is false, then the entire resultant is false
        /*
         *  T T -> T
         *  T F -> F
         *  F T -> F
         *  F F -> F
         */
        
        salary = 30435;
         byte age = 25;
        System.out.println((salary > 50000) && (age < 30));
        
        // (exp1) || (exp2) || (exp3)
                //Rule
                //If any of the expression is true, then the entire resultant is true
                /*
                 *  T T -> T
                 *  T F -> T
                 *  F T -> T
                 *  F F -> F
                 */
        salary = 30435;
        age = 25;
        System.out.println((salary < 50000) || (age > 30));
        
        // (exp1) ^ (exp2) ^ (exp3)
        //Rule
        //If both the expressions are evaluated to the same result, then the resultant is false
        /*
         *  T T -> F
         *  T F -> T
         *  F T -> T
         *  F F -> F
         */
	}
  
}
