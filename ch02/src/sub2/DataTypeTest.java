package sub2;

/*
 * 날짜 : 2024/06/28
 * 이름 : 조수빈 
 * 내용 : 변수 자료형 실습하기
 */


public class DataTypeTest {
	public static void main(String[] args) {
		
		// 정수형
		byte num1 = -128;
		short num2  = 32767;
		int num3 = 2147483647;
		long num4 = 999999999999L;
		
		System.out.println("num1 : " + num1);
		System.out.println("num2 : " + num2);
		System.out.println("num3 : " + num3);
		System.out.println("num4 : " + num4);
		
		
		// 실수형
		float var1 = 0.123456789f;
		double var2 = 0.1234567890123456789;
		
		System.out.println("var1 : " + var1);
		System.out.println("var2 : " + var2);
		
		
		// 논리형
		boolean data1 = false;
		boolean data2 = true;
		
		
		System.out.println("data1 : " + data1);
		System.out.println("data2 : " + data2);
		
		
		// 문자형
		char c1 = 'A';
		char c2 = 'B';
		
		System.out.println("c1 : " + c1);
		System.out.println("c2 : " + c2);
		
		
		// 문자열 (참조형)
		String str1 = "A";
		String str2 = "가";
		String str3 = "Apple";
		String str4 = "거울";
		
		System.out.println("str1 : " + str1);
		System.out.println("str2 : " + str2);
		System.out.println("str3 : " + str3);
		System.out.println("str4 : " + str4);
		
		
	}
}
