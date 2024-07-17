package sub4;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;


/**
 * 날짜 : 2024-07-17
 * 이름 : 조수빈
 * 내용 : SET 실습하기
*/

public class SetTest {
	public static void main(String[] args) {
		
		Set<Integer> set = new HashSet<Integer>();
		
		set.add(1);
		set.add(2);
		set.add(3);
		set.add(4);
		set.add(5);
		set.add(6);
		set.add(7);
		set.add(8);
		
		
		
		//반복자를 이용한 데이터 출력
		Iterator<Integer> it = set.iterator();
		
		while(it.hasNext()) {
			System.out.print(it.next() + ", ");
		}
		System.out.println();
		for(int num : set) {
			System.out.print(num + ", ");
		}
	}
}
