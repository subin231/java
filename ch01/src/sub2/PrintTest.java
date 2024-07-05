package sub2;

/*
 *	날짜 : 2024/06/28
 * 	이름 : 조수빈
 * 	내용 : 자바 출력 실습하기
 */

public class PrintTest {
	
	public static void main(String[] args) {
		
		// 기본출력
		System.out.println("Hello Java~");
		System.out.println("Hello Korea~");
		System.out.println("Hello Busan!");
		
		/* 한줄출력
		ln 처리가 안되었기 때문에 그대로 출력문이 이어서 출력됨 */ 
		System.out.print("Wellcome"); 
		System.out.print("Java~");
		
		// 개행처리
		System.out.println();// 출력 없이 ln라인으로 정리해서 문자열 정리(줄바꿈)
		System.out.print("Welcome\n"); // \n으로 줄바꿈 처리가능
		System.out.print("Korea\n");
		
		int a;
		int b;
		a = 1;
		b = 1;
		System.out.println(a+b);
	}
}
