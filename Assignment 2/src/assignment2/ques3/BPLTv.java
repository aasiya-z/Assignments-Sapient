package assignment2.ques3;

public class BPLTv implements TvRemote {

	public void changeChannel() {
		System.out.println(getTvName() + " Channel changed");
	}

	public void changeVolume() {
		System.out.println(getTvName() + " Volume changed");
	}

	public void switchOn() {
		System.out.println(getTvName() + " turned on");
	}

	public void switchOff() {
		System.out.println(getTvName() + " turned off");
	}

	public String getTvName() {
		return "BPL Tv";
	}

}
