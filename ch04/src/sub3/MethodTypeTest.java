package sub3;

/*
 * 날짜 : 2024-07-02
 * 이름 : 조수빈
 * 제목 : 자바 메서드 타입 실습하기
 */

public class MethodTypeTest {
	
	public static void main(String[] args) {
		//인스턴스 생성 해서 줄여 사용
		MethodTypeTest MTT = new MethodTypeTest();
		
		double a = type1(5);
		
		System.out.println(a);
		
		MTT.type2(false);
		
		System.out.println(MTT.type3());
		
		MTT.type4();
	}
	
	// 1번 타입 : 매개변수는 O 리턴값이 O
	public static double type1(double x) {
		
		double y = (x * x) + Math.PI;
		
		return y;
		
	}
	
	// 2번 타입 : 매개변수는 O 리턴값이 X
	public static void type2(boolean status) {
		
		if(status == true) {
			System.out.println("참 입니다.");
		}else {
			System.out.println("거짓 입니다.");
		}
		
	}
	
	// 3번 타입 : 매개변수는 X 리턴값이 O
	public static boolean type3() {
		
		int num1 = 1;
		int num2 = 2;
		
		if(num1 > num2) {
			return true;
		}else {
			return false;
		}
	}
	
	// 4번 타입 : 매개변수는 X 리턴값이 X
	public static void type4() {
		double result = type1(5);
		System.out.println("result : " + result);
		
	}
	
	
}
