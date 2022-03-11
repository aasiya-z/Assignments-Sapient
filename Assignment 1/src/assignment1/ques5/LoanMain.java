package assignment1.ques5;

public class LoanMain {

	public static void main(String[] args) {
		PersonalLoan p1 = new PersonalLoan("dev", 6.7f, 10000, 8);

		System.out.println(p1.getLoanAmount());

		HomeLoan h1 = new HomeLoan("xyz", 7.3f, 9000, 12);

		System.out.println(h1.getLoanPercentage());

	}

}
