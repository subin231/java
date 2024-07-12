package ch07.sec03;

public class SmartPhone extends Phone {
	
	public boolean wifi = true;
	
	public SmartPhone(String model, String color) {
		super(model, color);
		this.model = model;
		this.color = color;
	}

	
}
