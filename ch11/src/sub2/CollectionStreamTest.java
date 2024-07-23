package sub2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;


/*
 * 날짜 : 2024-07-23
 * 이름 : 조수빈
 * 내용 : 자바 컬렉션 스트림 실습하기
 * 
 * 스트림 종류 2개인것 구분 필수
 * 		- 파일 등 의 스트림
 * 		- 리스트 또는 배열의 스트림
 * 
 */

class Person {
	private String name;
	private int age;
	
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + "]";
	}
	
}




public class CollectionStreamTest {
	
	public static void main(String[] args) {
		
		List<Integer> nums = new ArrayList<Integer>();
		
		nums.add(1);
		nums.add(2);
		nums.add(3);
		nums.add(4);
		nums.add(5);
		
		//외부 반복자를 활용한 출력
		for(int num : nums) {
			System.out.print(num + ", ");
		}
		
		System.out.println();
		
			//Iterator를 활용한 반복문
		Iterator<Integer> it = nums.iterator();
		
		while(it.hasNext()) {
			System.out.print(it.next() + ", ");
		}
		
		
		System.out.println();
		//내부 반복자를 활용한 출력
			//defalt stream
		nums.stream().forEach((num)->{
			System.out.print(num + ", ");
		});
		
		
		
		
		//-------------------------------------------------------------------
		
		List<Person> people = new ArrayList<>();
		
		people.add(new Person("김유신", 23));
		people.add(new Person("김춘추", 21));
		people.add(new Person("장보고", 33));
		people.add(new Person("강감찬", 43));
		people.add(new Person("이순신", 53));
		
		// 외부 반복자 출력
		for(Person person : people) {
			System.out.println(person);
		}
		
		people.stream().forEach((person)->{
			System.out.println(person);
		});
		
		people.stream().forEach(System.out::println);
		
		//Hashmap 생성
		Map<String, Integer> scores = new HashMap<>();
		
		scores.put("김유신", 92);
		scores.put("김춘추", 90);
		scores.put("장보고", 82);
		scores.put("강감찬", 72);
		scores.put("이순신", 98);
		
		//외부 반복자를 이용한 출력
		System.out.println("외부반복자");
		for(String key : scores.keySet()) {
			System.out.println("key : "+ key + ", value : " + scores.get(key));
		}
		System.out.println();
		
		
		
		
		System.out.println("내부반복자");
		// 내부 반복자를 이용한 출력
		scores.keySet().stream().forEach((key)->{
			System.out.println("key : "+ key + ", value : " + scores.get(key));
		});
		
		scores.entrySet().stream().forEach((entry)->{
			System.out.println("key : "+ entry.getKey() + ", value : " + entry.getValue());
		});
		
		
	}
	
}
