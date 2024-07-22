package sub2;

public class WorkThread extends Thread {
	
	
	@Override
	public void run() {
		
		for(int i=0; i<=10; i++) {
			System.out.println(": Working Thread 실행...");			
		}
		
		System.out.println(": Working Thread 종료...");
	}
	
}
