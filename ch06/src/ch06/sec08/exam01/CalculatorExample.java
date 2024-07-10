package ch06.sec08.exam01;

public class CalculatorExample {
	
	public static void main(String[] args) {
		Calculator ca = new Calculator();
		
		ca.powerOn();
		
		
		int x = Math.round(5);
		int y = Math.round(6);
		
		
		System.out.println("plus : "+ ca.plus(5, 6));
		System.out.println("plus : "+ ca.minus(5, 6));
		System.out.println("plus : "+ ca.divide(x, y));
		
		
		ca.powerOff();
		
	}
}
