package sub1;

import java.util.Timer;
import java.util.TimerTask;

/*
 * 날짜 : 2024-07-22
 * 이름 : 조수빈
 * 내용 : Thread 실습하기
 * 
 */




public class ThreadTest {
	public static void main(String[] args) {
		
/*		//Thread timer 테스트
		Timer t1 = new Timer();
		TimerTask m_task = new TimerTask() {
			
			@Override
			public void run() {
				System.out.println("테스트입니다.");
			}
		};
		
		t1.schedule(m_task, 1);
		*/
		
		
		System.out.println("--------------------------");
		
		
		
		SubThread sub1 = new SubThread("sub1");
		SubThread sub2 = new SubThread("sub2");
		
		sub1.start(); // 작업 스레드 처리할 메서드
		sub2.start();
		
		
		for (int i = 0; i<10; i++) {
			System.out.println("main Thread 실행...");
			
			try {
				Thread.sleep(1000);// thread 1초 대기
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
		}
		System.out.println("main Thread 종료...");
		
	}
}
