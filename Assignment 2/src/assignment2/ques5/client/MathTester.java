package assignment2.ques5.client;

import assignment2.ques5.tools.Calculator;

public class MathTester {

	public static void main(String[] args) {
		Calculator c = new Calculator(3, 4);
		System.out.println(c.add());
		System.out.println(c.multiply());
		System.out.println(c.subtract());

	}

}
