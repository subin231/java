package sub8;

public class RemoteSamsung implements RemoteControl{

	@Override
	public void powerOn() {
		System.out.println("samsung powerOn...");
	}

	@Override
	public void powerOff() {
		System.out.println("samsung powerOff...");
	}

	@Override
	public void chUp() {
		System.out.println("samsung Chanel Up Change...");
	}

	@Override
	public void chDown() {
		System.out.println("samsung Chanel Down Change...");
	}

	@Override
	public void soundUp() {
		System.out.println("samsung soundUp...");
	}

	@Override
	public void soundDown() {
		System.out.println("samsung soundDown...");
	}

	
	public void show() {
		this.powerOn();
		this.chDown();
		this.soundDown();
		this.powerOff();
	}
	
}
