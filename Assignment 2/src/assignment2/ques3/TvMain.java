package assignment2.ques3;

public class TvMain {

	public static void main(String[] args) {

		TvRemote bpl=new BPLTv();
		bpl.switchOn();
		bpl.switchOff();
		bpl.changeChannel();
		bpl.changeVolume();
		bpl.switchOff();
		System.out.println("=================");
		TvRemote sony=new SonyTv();
		sony.switchOn();
		sony.switchOff();
		sony.changeChannel();
		sony.changeVolume();
		sony.switchOff();
		System.out.println("=================");
		TvRemote panasonic=new PanasonicTv();
		panasonic.switchOn();
		panasonic.switchOff();
		panasonic.changeChannel();
		panasonic.changeVolume();
		panasonic.switchOff();

	}

	}

}
