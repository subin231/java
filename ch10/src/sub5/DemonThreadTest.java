package sub5;


/*
 * 날짜 : 2024-07-22
 * 이름 : 조수빈
 * 내용 : 데몬 스레드 실습하기
 * 
 * 데몬스레드(DemonThread)
 * 		- 메인스레드를 보조하는 보조스레드
 * 		- 메인스레드가 종료되면 데몬스레드도 같이 종료
 */


class subThread extends Thread {
	
	private String name;
	
	public subThread (String name) {
		this.name = name;
	}
	
	@Override
	public void run() {
		
		for(;;) {
			System.out.println(name + ": Sub Thread 실행...");
			
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println(name + ": Sub Thread 종료...");	
		}
	}
	
}




public class DemonThreadTest {
	
	public static void main(String[] args) {
		
		subThread sub = new subThread("sub");
		sub.setDaemon(true); // 데몬스레드 실행 (스레드 보조)
		
		sub.start();
		
		for (int i = 0; i < 10; i++) {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println("main 스레드 실행 ...");
		}
		
		System.out.println("main 스레드 종료 ...");
	}
	
	
}
