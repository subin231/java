package sub5;

/*
 * 날짜 : 2024-07-10
 * 이름 : 조수빈
 * 내용 : 메서드 오버라이딩 실습하기
 */

class AAA{
	
	//오버라이딩 되어서 CCC로 가게됨
	public void method1() {
		System.out.println("AAA : method1....");
	}
	
	//오버라이딩 되어서 CCC로 가게됨
	
	public void method2() {
		System.out.println("AAA : method2....");		
	}
	
	public void method3() {
		System.out.println("AAA : method3....");
	}
}

class BBB extends AAA{
	@Override // @Override : 어노테이션 (자바에선 기능이 없음)
	public void method2() {
		System.out.println("BBB : method2...");
	}
	//메소드 오버로딩
	public void method3(int a) {
		System.out.println("BBB : method3...");
	}
}

class CCC extends BBB{
	@Override
	public void method1() {
		System.out.println("CCC : method1...");
	}
	@Override
	public void method2() {
		System.out.println("CCC : method2...");
	}
	
	//메소드 오버로딩
	public void method3(int a, int b) {
		System.out.println("CCC : method3...");
	}
}


public class MethodOverridingTest {
	public static void main(String[] args) {
		
		CCC c = new CCC();
		
		c.method1();
		c.method2();
		c.method3();
		c.method3(1);
		c.method3(1,3);
		
		
		Sedan sonata = new Sedan("소나타", "흰색", 0, 10000);
		sonata.speedUp(100);
		sonata.show();
		
		Truck bongo = new Truck("봉고", "남색", 0, 1000);
		bongo.speedUp(100);
		bongo.show();
		
		
		
	}
}
