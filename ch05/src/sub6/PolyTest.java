package sub6;
/*
 * 날짜 : 2024-07-10
 * 이름 : 조수빈
 * 내용 : 다형성 실습하기
 * 
 * 다형성(Polymophism) 
 * 		- 상속관계에서 부모클래스의 기능을 자식클래스에서 다양한 기능으로 정의하는 특성
 * 		- 객체(참조변수)의 타입선언을 부모클래스 타입으로 선언
 * 		- 다형성을 활용해서 효율적인 프로그래밍을 수행
 */


public class PolyTest {
	
	
	
	public static void main(String[] args) {
		
		
		// 다형성 적용된 객체 생성 -> 업 캐스팅 (animal로 통일성 적용한것)
		Animal a1 = new Tiger();
		Animal a2 = new Eagle();
		Animal a3 = new Shark();
		
		a1.move();
		a1.hunt();
		
		a2.move();
		a2.hunt();
		
		a3.move();
		a3.hunt();
		
		System.out.println("-----------------------------");
		
		// 다운 캐스팅
						//클래스 타입을 설정해줘야함
		Tiger tiger = (Tiger) a1;
		Eagle eagle = (Eagle) a2;
		Shark shark = (Shark) a3;
		
		tiger.move();
		tiger.hunt();
		
		eagle.move();
		eagle.hunt();
		
		shark.move();
		shark.hunt();
		
		
		
		// 객체 타입 비교연산
		// a1 = tiger
		if (a1 instanceof Tiger) {
			System.out.println("a1은 Tiger 입니다.");
		}
		if(a2 instanceof Eagle) {
			System.out.println("a2은 Eagle 입니다.");
		}
		if(a3 instanceof Shark){
			System.out.println("a3은 Shark 입니다");
		}
		
		
		// 다양성을 활용한 객체 배정
			// arr 앞에 같은타입 설정 필요 
		Animal arr[] = {tiger, eagle, shark};
		
		for(Animal animal : arr) {
			animal.move();
			animal.hunt();
		}
		
		
		/* 다양성 연습문제
		 * pet 클래스를 정의
		 * 
		 * pet 클래스 상속받는 dog cat 클래스 정의
		 * dog는 멍멍 , cat은 야옹 출력
		 * 
		 * 정적 메소드 printSound를 생성하여
		 * printSound에 dog, cat 호출
		 * 
		 */
		
		
		
		Pet dog = new Dog();
		Pet cat = new Cat();
		
		//dog.makesound();
		//cat.makesound();
		
		printSound(dog);
		printSound(cat);
	}
	
	
	public static void printSound(Pet pet) {
		pet.makesound();
	}

	
}

