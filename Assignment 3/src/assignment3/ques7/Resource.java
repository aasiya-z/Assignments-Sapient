package assignment3.ques7;

public class Resource {

	public void printMessage(String message) {

		try {
			System.out.print("[" + message);
			Thread.sleep(5000);
			System.out.println("]");

		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

}
