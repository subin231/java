package sub2;

/*
 * 날짜 : 2024-07-16
 * 이름 : 조수빈
 * 내용 : 자바 StringBuilder 클래스 실습하기
 */

public class StringBuilderTest {
	public static void main(String[] args) {
		
		String str = "java";
		
		System.out.println("str 주소 : " + System.identityHashCode(str));
		
		str += "programming";
		System.out.println("str 주소 : " + System.identityHashCode(str));
				
		
		// String 분변 특성을 개선한 Stringbuilder
		StringBuilder sb = new StringBuilder("java");
		
		System.out.println("sb 주소 : " + System.identityHashCode(sb));
		
		sb.append(" programming");
		System.out.println("sb 주소 : " + System.identityHashCode(sb));
		System.out.println("sb : " + sb);
		
		
		
	}
}
