package assignment3.ques5;

public class Main {

	public static void main(String[] args) throws Exception {
		System.out.println("Threads Started");
		ThreadJoining th1 = new ThreadJoining();
		ThreadJoining th2 = new ThreadJoining();
		ThreadJoining th3 = new ThreadJoining();
		th1.start();
		th2.start();
		th3.start();
		th1.join();
		th2.join();
		th3.join();
		System.out.println("Threads exit");

	}

}
