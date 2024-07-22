package sub2;

class SubThread extends Thread {
	
	private String name;
	
	public SubThread (String name) {
		this.name = name;
	}
	
	
	@Override
	public void run() {
		
		int i = 1;
			try {
				for(;;) {
					System.out.println(name + ": Sub Thread 실행..." + i);
					i++;
				
				Thread.sleep(1000);// 스래드 1초 대기
				}
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
	}
}


public class ThreadInterrupTest {
	public static void main(String[] args) {
		
		SubThread sub = new SubThread("작업");
		
		sub.start();
		
		try {
			Thread.sleep(1000 * 10);
		} catch (Exception e) {
			e.printStackTrace();
		}
		sub.interrupt(); // interruptedException 발생시켜 작업 스레드 종료시킴
		
		System.out.println("main Thread 종료");
		
		
	}
}
