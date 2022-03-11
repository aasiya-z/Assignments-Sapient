package assignment.jdbc.ques3;

import java.util.List;

public class MainCustomer {

	public static void main(String[] args) {
		CustomerDao details = new CustomerDaoImp();
		Customer c = details.findCustomerById(001);
		System.out.println(c);

		System.out.println(details.set(new Customer(101, "Aasi", "Moradabad", 86734578, 65000)));

		System.out.println(details.delete(5));

		List<Customer> lst = details.listAll();
		for (Customer cus : lst) {
			System.out.println(cus);
		}

	}

}
