package assignment1.ques5;

public class PersonalLoan {

	private String customerName;
	private int loanAmount, numberofMonths;
	private float loanPercentage;

	public PersonalLoan(String customerName, float loanPercentage, int loanAmount, int numberofMonths) {

		this.customerName = customerName;
		this.loanPercentage = loanPercentage;
		this.loanAmount = loanAmount;
		this.numberofMonths = numberofMonths;
	}

	public String getCustomerName() {
		return customerName;
	}

	public float getLoanPercentage() {
		return loanPercentage;
	}

	public int getLoanAmount() {
		return loanAmount;
	}

	public int getNumberofMonths() {
		return numberofMonths;
	}

}
