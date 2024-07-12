package ch08.sec02;

public class RemoteControlExample {
	public static void main(String[] args) {
		RemoteControl rc = new Television();
		rc.trunOn();
		
		RemoteControl rc1 = new Radio();
		rc1.trunOn();
	}
}
