package assignment.jdbc.ques2;

import java.util.List;

public class JdbcMain {

	public static void main(String[] args) {
		JdbcDemo j = new JdbcDemo();

		// Inserting one customer
		j.insertCustomer(102, "John", "Delhi", 65732, 25000);

		// Inserting 5 customer
		j.insertCustomer(103, "Peter", "Gurgaon", 78943, 42000);

		j.insertCustomer(104, "Akash", "Jalandhar", 93643, 30000);

		j.insertCustomer(105, "Sanyam", "Ranchi", 90234, 65000);

		j.insertCustomer(106, "Shikha", "Pune", 45478, 38000);

		j.insertCustomer(107, "Priya", "Noida", 9034, 60000);

		// update the balance
		j.updateBalance(104, 65000);

		// Delete the Row
		j.delete(104);

		// List the Customer
		j.getCustomerDetails();

		// Get customer details with id
		j.getCustomerWithId(102);
	}

}
