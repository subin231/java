package ch06.sec08.exam03;

public class CarExample {
	public static void main(String[] args) {
		
		Car car = new Car();
		
		car.setGas(5);
		
		if(car.isLeftGas()) {
			System.out.println("출발합니다.");
			
			car.run();
		}
		System.out.println("가스 넣으세요");
	}
}
