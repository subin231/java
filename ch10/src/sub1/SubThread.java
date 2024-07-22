package sub1;



public class SubThread extends Thread {
	
	private String name;
	
	public SubThread (String name) {
		this.name = name;
	}
	
	
	
	
	@Override
	public void run() {
		
		for(int i=0; i<=10; i++) {
			System.out.println(name + ": Sub Thread 실행...");			
		}
		
		System.out.println(name + ": Sub Thread 종료...");
	}
	
	
	
	
}
