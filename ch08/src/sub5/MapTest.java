package sub5;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MapTest {
	public static void main(String[] args) {
		HashMap<String, Integer> map = new HashMap<String, Integer>();
		HashMap<Character, String> map2 = new HashMap<Character, String>();
		
		map.put("country",	 1);
		map.put("apple", 	 2);
		map.put("banana", 	 3);
		map.put("kiwi", 	 4);
		map.put("people", 	 5);
		
		
		map2.put('A', "Apple");
		map2.put('B', "Banana");
		map2.put('C', "Cherry");
		
		
		System.out.println(map);
		System.out.println(map2);
		
		System.out.println(map.get("country"));
		System.out.println(map2.get('A'));
		
		
		System.out.println("-------------------------");
		
		//map 크기
		System.out.println("map size : " +map.size());
		
		
		
		
		
		System.out.println("-------------------------");
		//map 데이터 출력(키값으로 검색)
		System.out.println(map2.get('A'));
		System.out.println(map2.get('B'));
		System.out.println(map2.get('C'));
		
		
		
		
		
		//map 반복문
		for(char k : map2.keySet()) {
			System.out.println(k + ":" +map2.get(k));
		}
		
		
		
		
		
		System.out.println("-------------------------");
		//ArrayList응용
		Map<Integer, Apple> map3 = new HashMap<>();
		map3.put(101, new Apple("한국", 3000));
		map3.put(102, new Apple("중국", 2000));
		map3.put(103, new Apple("일본", 1000));
		
		Map<Integer, Apple> map4 = new HashMap<>();
		map4.put(201, new Apple("미국", 3000));
		map4.put(202, new Apple("영국", 2000));
		map4.put(203, new Apple("호주", 1000));
		
		Map<Integer, Apple> map5 = new HashMap<>();
		map5.put(301, new Apple("대만", 3000));
		map5.put(302, new Apple("태국", 2000));
		map5.put(303, new Apple("인도", 1000));
		
		List<Map<Integer, Apple>> applemaps = new ArrayList<>();
		
		applemaps.add(map3);
		applemaps.add(map4);
		applemaps.add(map5);
		
		
		//한국 사과 show
		Map<Integer, Apple> resultmap = applemaps.get(0); 
		Apple korApple = resultmap.get(101);
		korApple.show(applemaps.get(0).get(101));
		
		
		
		//호주 사과 show
		Map<Integer, Apple> resultmap2 = applemaps.get(1); 
		Apple ausApple = resultmap2.get(203);
		ausApple.show(applemaps.get(1).get(203));
		
		
		
		
		//태국 사과 show
		Map<Integer, Apple> resultmap3 = applemaps.get(2); 
		Apple xo = resultmap3.get(302);
		xo.show(applemaps.get(2).get(302));
		
		
		
		
		
	}

}
