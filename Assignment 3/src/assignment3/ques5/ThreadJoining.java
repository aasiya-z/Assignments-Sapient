package assignment3.ques5;

public class ThreadJoining extends Thread {
	public void run() {
		for (int i = 1; i <= 4; i++) {
			try {
				Thread.sleep(500);
			} catch (Exception e) {
				System.out.println(e);
			}
			System.out.println(i);
		}
	}

}
