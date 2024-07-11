package sub8;

public class Cable implements Socket {

	
	private Bulb bulb;
	
	
	//하단의 전구에서 끌어오기위해 생성자 생성 및 초기화 필요
	public Cable(Bulb bulb) {
		this.bulb = bulb;
	}
	
	@Override
	public void switchOn() {
		bulb.lightOn();
	}

	@Override
	public void switchOff() {
		bulb.lightOff();
	}
	
}
