package sub2;

/*
 * 날짜 : 2024-07-16
 * 이름 : 조수빈
 * 내용 : 자바 String 클래스 실습하기
 */

public class StringTest {
	public static void main(String[] args) {
		
		//문자열 생성
		
		String str = "Hello";
		String str1 = new String("Hello");
		
		
		System.out.println(str);
		System.out.println(str1);
		
		System.out.println(str.equals(str1));
		
		if (str == str1) {
			System.out.println("str, str1이 같다");
		}else {
			System.out.println("str, str1이 다르다");
		}
		
		
		if (str.equals(str1)) {
			System.out.println("str, str1이 같다");
		}else {
			System.out.println("str, str1이 다르다");
		}
		
		
		// 문자열 길이
		
		String Message = "Hello,Korea";
		System.out.println("message 길이는 : "+Message.length());
		
		
		
		// 문자열 추출
		
		char c1 = Message.charAt(0);
		char c2 = Message.charAt(6);
		
		System.out.println("1번째 문자 : "+ c1);
		System.out.println("6번째 문자 : "+ c2);
		
		
		// 문자열 자르기
		
		String sub1 =  Message.substring(0,5);
		String sub2 =  Message.substring(6);
		
		System.out.println("문자열 1~6번까지 " + sub1);
		System.out.println("문자열 6번에서 끝까지 " + sub2);
		
		
		// 문자열 인덱스
		
		int idx1 = Message.indexOf("e");
		int idx2 = Message.lastIndexOf("e");
		System.out.println(idx1);
		System.out.println(idx2);
		
		
		
		
		// 문자열 분리
		
		String[] sp1 =  Message.split(",");
		
		for(String string : sp1) {
			System.out.println("str : " +sp1);
		}
		
		
		// 문자열 교체
		
		String rp1 = Message.replace("Korea", "Busan");
		String rp2 = Message.replace("Hello", "Welcome");
		
		System.out.println(rp1);
		System.out.println(rp2);
		System.out.println(rp1 +" "+rp2);
		
		
		// 문자열 반환
		int var1 = 1;
		double var2 = 3.14;
		boolean var3 = true;
		
					//정적 메소드 , static메소드
		String s1 = String.valueOf(var1);
		String s2 = String.valueOf(var2);
		String s3 = ""+var3;
		
		System.out.println("s1 : "+s1);
		System.out.println("s2 : "+s2);
		System.out.println("s3 : "+s3);
		
		
		
		
		
		
	}

}
