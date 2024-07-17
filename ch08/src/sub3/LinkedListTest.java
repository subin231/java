package sub3;

import java.util.LinkedList;

/**
 * 날짜 : 2024-07-17
 * 이름 : 조수빈
 * 내용 : LinkedList 실습하기
*/
// 객체끼리 연결되므로 first, last 메소드 있음

public class LinkedListTest {
	public static void main(String[] args) {
		
		LinkedList<String> cities = new LinkedList<String>();
		
		cities.add("서울");
		cities.add("대전");
		cities.add("대구");
		cities.add("부산");
		cities.add("광주");
		System.out.println(cities);
		
		
		cities.add(1, "수원");
		System.out.println(cities);
		
		
		cities.addFirst("인천");
		System.out.println(cities);
		
		
		cities.addLast("울산");
		System.out.println(cities);
	}
}
