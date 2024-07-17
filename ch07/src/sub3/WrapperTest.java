package sub3;
/*
 * 날짜 : 2024-07-16
 * 이름 : 조수빈
 * 내용 : 자바 Wrapper 클래스 실습하기
 */
public class WrapperTest {

	
	public static void main(String[] args) {
		
		//기본타입 (Primitive type)
		int 	var1 = 1;
		double 	var2 = 3.14;
		boolean var3 = true;
		
		//Wrapper 포장 (Boxing)
		Integer box1 = var1;
		Double  box2 = var2;
		boolean box3 = var3;
		
		
		System.out.println("box1 : " + box1);
		System.out.println("box1 : " + box2);
		System.out.println("box1 : " + box3);
		
		// 문자열 -> 기본타입 변환
		String str1 = "1";
		String str2 = "2.12";
		String str3 = "false";
		
		int 	value1 = Integer.parseInt(str1);
		double 	value2 = Double.parseDouble(str2);
		boolean value3 = Boolean.parseBoolean(str3);
		
		System.out.println("str1 : " + str1);
		System.out.println("str2 : " + str2);
		System.out.println("str3 : " + str3);
		
		
		
		// 문자열 -> Wrapper 변환
		Integer v1 = Integer.valueOf(str1);
		Double  v2 = Double.valueOf(str2);
		Boolean v3 = Boolean.valueOf(str3);
		
		System.out.println("v1 : " + v1);
		System.out.println("v2 : " + v2);
		System.out.println("v3 : " + v3);
		
		
		// Wrapper -> 문자열 변환
		String s1 = v1.toString();
		String s2 = v2.toString();
		String s3 = v3.toString();
		
		System.out.println("s1 : " + s1);
		System.out.println("s2 : " + s2);
		System.out.println("s3 : " + s3);
		
		
		
		// Wrapper -> 기본타입 변환
		int 	r1 = v1;
		double 	r2 = v2;
		boolean r3 = v3;
		
		System.out.println("r1 : " + v1);
		System.out.println("r2 : " + v2);
		System.out.println("r3 : " + v3);
		
		
		// 기본타입 -> Wrapper 변환 auto Unboxing
		Integer wr1 = r1;
		Double 	wr2 = r2;
		Boolean wr3 = r3;
		
		System.out.println("wr1 : " + r1);
		System.out.println("wr2 : " + r2);
		System.out.println("wr3 : " + r3);
		
		
		
	}
	
	
}
