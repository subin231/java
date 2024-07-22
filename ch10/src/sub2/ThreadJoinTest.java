package sub2;

/*
 * 날짜 : 2024-07-22
 * 이름 : 조수빈
 * 내용 : 스레드 상태 실습하기
 */


public class ThreadJoinTest {
	
	public static void main(String[] args) {
		
		WorkThread work = new WorkThread();
		
		work.start();
		
		
		try {
			work.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		
		System.out.println("main Thread 종료.....");
		
		
		
	}
	
}
