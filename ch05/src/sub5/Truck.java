package sub5;

public class Truck extends Car {
	
	private int capacity; // 변수 선언 (적재량)
	
	public Truck(String name, String color, int speed, int capacity) {
		super(name, color, speed); //부모클래스 생성자 상속
		this.capacity = capacity; // 초기화
	}
	
	
	@Override
	public void speedUp(int speed) {
		// Truck에 맞게 speedUp 메서드 재정의
		
		this.speed += speed / capacity;
	}
	
	
	
	public void show() {
		// 부모클래스에 private -> protected 로 변경 필요
		System.out.println("차량명 : " 		+ name);
		System.out.println("차량색 : " 		+ color);
		System.out.println("현재속도 : " 	+ speed);
		System.out.println("차량용량 : " 	+ capacity);
	}
}
