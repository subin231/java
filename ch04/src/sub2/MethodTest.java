package sub2;

/*
 * 날짜 : 2024-07-02
 * 이름 : 조수빈
 * 제목 : 자바 메서드 실습하기
 */

public class MethodTest {
	static int total = 0; // 전역변수
	
	// main 메서드 - 프로그램 진입점
	public static void main(String[] args) {
		
		// 메서드 호출(call)
		int y1 = f(1);	 //인자값 1을 전달해서 f함수 호출
 		int y2 = f(2);
		int y3 = f(3);
		
		System.out.println("y1 : " + y1);
		System.out.println("y1 : " + y2);
		System.out.println("y1 : " + y3);
		
		int a = sum(1,2);
		System.out.println("a : "+ a);
		
	}
	
	//함수정의 메서드 정의(Define)
	public static int f(int x) { // 전달되는 인자값을 매개변수 x로 받아서 메서드 실행
//접근권한, 반환타입
		
		int y = 2 * x + 3;
		return y; //메서드를 호출한 쪽으로 반환된 값을 전달(Return)
	}
	
	public static int sum(int start, int end) {
		
		//int total = 0; //지역변수 : 메서드에 선언된 변수
		
		for(int k=start; k<=end; k++) {
			
			total +=k;
			
		}
			
		return total;
	}
	
}
