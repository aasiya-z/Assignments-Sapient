package assignment3.ques8;

public class MyThread implements Runnable {
	public void run() {
		try {
			for (int i = 0; i < 10; i++) {
				System.out.println("Excecutes code by " + Thread.currentThread().getName());
				Thread.sleep(2000);
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

	}

}
