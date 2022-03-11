package assignment2.ques5.tools;

public class Calculator {

	private int a, b;

	public Calculator(int a, int b) {
		this.a = a;
		this.b = b;
	}

	public int add() {
		return this.a + this.b;

	}

	public int multiply() {
		return this.a * this.b;

	}

	public int subtract() {
		return this.a - this.b;

	}

}
