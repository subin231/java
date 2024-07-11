package sub8;

/*
 * 
 * 날짜 : 2024-07-11
 * 
 * 이름 : 조수빈
 * 
 * 내용 : 인터페이스 학습하기
 * 
 * - interface : 표준화된 클래스이며, 설계에 사용되는 구조체이고 
 * - 오직 추상메서드만 사용이 가능하다.
 * - 인터페이스를 활용해서 다형성을 구현하고 객체간 결합도를 완화
 * - 다중상속 효과
 * 
 */
class Computer{
	public void boot() {
		System.out.println("부팅...");
	}
}

interface Internet{
	public void access(); 
}

class Tv extends Computer implements Internet {
	public void show() {
		System.out.println("TV 시청...");
	}

	@Override
	public void access() {
		System.out.println("인터넷 접속 ...");
	}
	
	
}





public class InterfaceTest {
	public static void main(String[] args) {
		
		// 인터페이스 실습1 - 표준화된 클래스 설계
		//lg부분
		RemoteControl lg = new RemoteLG();
		lg.show();
		
		
		//삼성부분
		RemoteControl sam = new RemoteSamsung();
		sam.show();
		
		
		System.out.println("------------------------");
		
		
		// 인터페이스 실습2 - 다형성 예제 (보통 이것으로 개발 및 정리함.)
		Bulb bulb = new Bulb();
		
		// 소켓으로 다형성 가능
		Socket socket = new Cable(bulb);
		
		socket.switchOn();
		socket.switchOff();
		
		
		
		System.out.println("------------------------");
		/* 인터페이스 실습3 - 다중 상속 효과 예제
		 * 자바는 부모 - 자식 1:1로 정리하나 interface 로 정의 시 상속과 정의를 따로 둘 수 있음. 
		 */
		Tv tv = new Tv();
		tv.boot();
		tv.access();
		tv.show();
		
		
	}
}
