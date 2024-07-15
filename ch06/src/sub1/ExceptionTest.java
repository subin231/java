package sub1;


import java.lang.reflect.Constructor;

import javax.swing.JOptionPane;;
/*
 * 날짜 : 2024-07-15
 * 이름 : 조수빈
 * 내용 : 예외처리 실습하기
 * 
 * 
 *   이슈사항● : exception 사용 시 통합적으로 Exception을 사용하여도 되나 되도록이면 맞는 문구 사용
 */
public class ExceptionTest {
	public static void main(String[] args) {
		
		// 실행예외(runtime, 프로그램 실행 중 발생 예외)
		// 예외상황 1 : 어떤 수를 0으로 나눌 때
		int num1 = 1;
		int num2 = 0;
		
		int r1 = num1 + num2;
		int r2 = num1 - num2;
		int r3 = num1 * num2;
		int r4 = 0;
		
		try {
			//예외가 발생 할 코드
			//r4 = num1 / num2;
		} catch (ArithmeticException e) {
			//예외가 발생 했을 때
			System.out.println();
			
			e.printStackTrace(); //예외출력
		}
		
		
		System.out.println("r1 : "+r1);
		System.out.println("r1 : "+r2);
		System.out.println("r1 : "+r3);
		System.out.println("r1 : "+r4);
	
		// 예외상황 2 : 배열의 인덱스 참조가 잘못되었을 때
		int[] arr = {1,2,3,4,5};

		try {
			for(int i = 0; i < 10; i++) {
				System.out.println("arr[" +i +"} :" +  arr[i]);
			}	
		} catch (ArrayIndexOutOfBoundsException e) {
			e.printStackTrace();
		}
		
		// 예외상황 3 : 객체 생성 없이 메서드 호출
		// 동적으로 null을 넣어서 정의하기도 함.
		Animal ani = null;
		
		try {
			ani.move();
		} catch (NullPointerException e) {
			e.printStackTrace();
		}
		
		
		// 예외상황 4 : 잘못된 캐스팅
	
		Animal a1 = new Tiger();
		Animal a2 = new Eagle();
		Animal a3 = new Shark();
		
		
		try {
			Tiger tiger = (Tiger) a1;
			Shark shark = (Shark) a2;
			
			tiger.move();
			shark.move();
		} catch (ClassCastException e) {
			e.printStackTrace();
		}
		
		
		// 일반예외(Comfile, 프로그램 실행 전 발생 예외)
		// 동적 객체 생성
		try {
			//예외가 발생한 코드
			Class clazz = Class.forName("sub1.Eagle"); //문자열 정보를 가지고 클래스 정보 로드
			Constructor<?> constructor = clazz.getDeclaredConstructor();
			
		}catch (ClassCastException e) {
			e.printStackTrace();
		}catch (ClassNotFoundException e) {
			//예외가 발생 시 처리할 코드
			e.printStackTrace();
			JOptionPane.showMessageDialog(null, e.getMessage(),"테스트 ", JOptionPane.ERROR_MESSAGE);
			
		} catch (NoSuchMethodException e) {
			e.printStackTrace();
			
		} catch (SecurityException e) {
			e.printStackTrace();
			
		} finally {
			//예외처리 발생 여부와 상관없이 무조건 실행
			System.out.println("finally 실행");
			
		}
		
		
		
		System.out.println("프로그램 종료");
		
		
	}
}
