package ch06.sec10.exam01;

public class CalculatorExample {
	public static void main(String[] args) {
		double result = 10*10*Calculator.pi;
		int result2 = Calculator.plus(5, 6);
		int result3 = Calculator.minus(5, 6);
		
		System.out.println("result1 : "+result);
		System.out.println("result2 : "+result2);
		System.out.println("result3 : "+result3);
	}
}
