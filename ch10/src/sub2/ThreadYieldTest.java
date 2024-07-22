package sub2;

/*
 * 날짜 : 2024-07-22
 * 이름 : 조수빈
 * 내용 : 스테드 상태 실습하기
 */

class sub1Thread extends Thread {
	
	
	@Override
	public void run() {
		
		for(int i=0; i<1000; i++) {
			System.out.println(" sub1 Thread 실행..." + i);
			
			Thread.yield(); // 다른 스레드에게 실행을 양보함
		}
	}
	
}


//sub2의 우선순위가 높아짐.
class sub2Thread extends Thread {
	
	
	@Override
	public void run() {
		
		for(int i=0; i<1000; i++) {
			System.out.println(" sub2 Thread 실행..." + i);			
		}
	}
	
}



public class ThreadYieldTest {
	public static void main(String[] args) {
		
		sub1Thread sub1 = new sub1Thread();
		sub2Thread sub2 = new sub2Thread();
		
		
		sub1.start();
		sub2.start();
		
		
		
		
	}
}
