package sub1;


/*
 * 날짜 : 2024-07-15
 * 이름 : 조수빈
 * 내용 : 자바 Object 클래스 실습하기
 */

public class ObjectTest {
	public static void main(String[] args) {
		Apple a1 = new Apple("한국" , 3000);
		Apple a2 = new Apple("일본" , 2000);
		
		//1. 객체 정보 조회 - toString
		System.out.println(a1); // toString() 호출
		System.out.println(a2); // toString() 호출
		
		
		
		//2. 객체 비교 : equals()
		if (a1 == a2) {
			System.out.println("a1 , a2가 주소값(참조값)이 같다");
		}else {
			System.out.println("a1 , a2가 주소값(참조값)이 다르다");
		}
		
		// 위 객체 예시와 동일
		if (a1.equals(a2)) {
			System.out.println("a1 , a2가 객체가 같다");
		}else {
			System.out.println("a1 , a2가 객체가 다르다");
		}
		
		//3. 객체 해시값
		
		System.out.println(a1.hashCode());
		System.out.println(a2.hashCode());
		
		
	}
}
