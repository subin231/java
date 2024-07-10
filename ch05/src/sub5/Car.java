package sub5;

public class Car {
	
	protected String name;
	protected String color;
	protected int speed;
	
	
	public Car(String name, String color, int speed) {
		this.name = name;
		this.color = color;
		this.speed = speed;
	}
	
	public void setColor(String color) {
		this.color = color;
	}
	
	public String getColor() {
		return color;
	}
	
	public void speedUp(int speed) {
		this.speed += speed; //this -> 클래스를 치칭 
		
		
	}
	
	public void speedDown(int speed) {
		this.speed -= speed;
	}
	
	public void show() {
		System.out.println("차량명 : "+ this.name);
		System.out.println("차량색 : "+ this.color);
		System.out.println("현재속도 : "+ this.speed);
	}
	
}