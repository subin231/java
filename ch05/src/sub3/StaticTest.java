package sub3;

/*
 * 날짜 : 2024-07-09
 * 이름 : 조수빈
 * 내용 : 클래스 변수, 메서드 활용하기
 * 
 * 클래스 변수, 클래스 메소드(정적변수, 정적메소드)
 * 	- static 선언한 변수, Method Area에 생성 
 * 	- 별도의 객체 생성없이 클래스 타입으로 바로 참조
 * 	- 중요 : 객체간의 데이터 공유 목적으로 클래스변수, 메서드 사용(ex : 아래의 increment)
 * 	
 * 
 *  - 싱글톤 객체(singleton)
 *  	- 클래스 변수, 메서드를 활용한 개체 생성 방법
 * 		- 싱글톤 객체는 오직 하나의 인스턴스로 메모리(method area) 상에 생성
 * 		- 싱글톤 객체는 사용에서 메모리 절약과 성능 향상에 도움있음
 * 
 * 
 */

class Increment{
	private int num1;
	
	// static이 붙기때문에 따로 메모리 할당되어서 관린됨.
	private static int num2;
	
	public Increment() {
		num1++;
		num2++;
		
		System.out.println("num1 : " + num1);
		System.out.println("num2 : " + num2);
		System.out.println("");
	}
}

public class StaticTest {
	public static void main(String[] args) {
		
		// static 기본
		Increment inc1 = new Increment();
		Increment inc2 = new Increment();
		Increment inc3 = new Increment();
		
		Car sonata = new Car("소나타", "흰색", 0);
		Car avante = new Car("아반떼", "검정", 0);
		
		System.out.println("전체 차량 수 : " + (sonata.getTotalCount()+avante.getTotalCount()));
		sonata.show();
		avante.show();
		
		//싱글톤 객체 (나중에 많이사용)
		//객체 초기화 안됨 private를 사용했기때문에
		//Calc c1 = new Calc();
		Calc cl = Calc.getInstance();
		
		int r1 = cl.plus(1, 2);
		int r2 = cl.minus(1, 2);
		int r3 = cl.multi(3, 2);
		int r4 = cl.div(4, 2);
		
		System.out.println("r1 : "+r1);
		System.out.println("r2 : "+r2);
		System.out.println("r3 : "+r3);
		System.out.println("r4 : "+r4);
		
		
	}
}
