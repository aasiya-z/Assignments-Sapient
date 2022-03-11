package assignment3.ques7;

public class Main {

	public static void main(String[] args) throws InterruptedException {
		Resource r = new Resource();
		Thread t1 = new Thread(new PrintWorker(r, "Welcome!"));
		Thread t2 = new Thread(new PrintWorker(r, "Home"));
		Thread t3 = new Thread(new PrintWorker(r, "Aasi"));
		t1.start();
		t2.start();
		t3.start();

		t1.join();
		t2.join();
		t3.join();
		System.out.print("Thread Exit...");

	}

}
