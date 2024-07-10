package ch06.sec08.exam04;

public class CalculatorExample {
	
	public static void main(String[] args) {
		Calculator ca = new Calculator();
		
		System.out.println("정사각형 넓이 : "+ca.areaRectangle(10));
		System.out.println("직사각형 넓이 : "+ca.areaRectangle(10, 20));
		
	}
}
