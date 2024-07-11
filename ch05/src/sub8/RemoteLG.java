package sub8;

public class RemoteLG implements RemoteControl {

	@Override
	public void powerOn() {
		System.out.println("LG powerOn...");
	}

	@Override
	public void powerOff() {
		System.out.println("LG powerOff...");
	}

	@Override
	public void chUp() {
		System.out.println("LG Chanel Up Change...");
	}

	@Override
	public void chDown() {
		System.out.println("LG Chanel Down Change...");
	}

	@Override
	public void soundUp() {
		System.out.println("LG soundUp...");
	}

	@Override
	public void soundDown() {
		System.out.println("LG soundDown...");
	}
	
	public void show() {
		this.powerOn();
		this.chUp();
		this.soundUp();
		this.powerOff();
	}
	
}
