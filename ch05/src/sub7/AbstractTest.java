package sub7;

/*
 * 날짜 : 2024-07-10
 * 이름 : 조수빈
 * 내용 : 추상 클래스 학습하기
 */



public class AbstractTest {
	
	public static void main(String[] args) {
		
		// 추상클래스는 객체생성 안됨
		//Animal animal = new Animal();
		Animal ti = new Tiger();
		Animal sh = new Shark();
		Animal eg = new Eagle();
		
		ti.move();
		ti.hunt();
		
		sh.move();
		sh.hunt();
		
		eg.move();
		eg.hunt();
	}
}
