package assignment3.ques7;

public class PrintWorker implements Runnable {
	private Resource res;
	private String message;

	public PrintWorker(Resource res, String message) {
		this.res = res;
		this.message = message;
	}

	@Override
	public void run() {
		synchronized (res) {

			res.printMessage(message);
		}
	}

}
