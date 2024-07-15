package sub2;

import java.util.Scanner;




/*
 * 날짜 : 2024-07-15
 * 이름 : 조수빈
 * 내용 : 예외 던지기
 */


public class ThrowsTest {
	public static void main(String[] args) {

		int num1 = 1;
		try {
			//method1에서 예외가 발생하면 예외처리
			method1(num1);
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("프로그램 종료");
	}
	//method1에서 예외가 발생하면 method1를 호출하는 곳으로 예외 던지기	
	public static void method1(int num1) throws Exception {
		method2(num1);
	}
	
	//method2에서 예외가 발생하면 method2를 호출하는 곳으로 예외 던지기
	public static void method2 (int num1) throws Exception {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("num2 입력 : ");
		
		int num2 = sc.nextInt(); //InputMissmatchException 발생
		int result = num1 / num2;//ArithmeticException 발생
		
		System.out.println("result : " + result);
	}
}
