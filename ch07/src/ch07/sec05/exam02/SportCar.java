package ch07.sec05.exam02;
						
public class SportCar extends Car{
	@Override
	public void speedUp() {

		speed += 1;
	}
	
	/* 오버라이딩 안됨
	@Override
	public void stop() {
		// TODO Auto-generated method stub
		super.speedUp();
	}*/
}

