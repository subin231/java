package sub4;

public class ThreadA extends Thread{
	private WorkObject workobject;
	
	public ThreadA(WorkObject workobject) {
		setName("ThreadA");
		this.workobject = workobject;
	}
	
	@Override
	public void run() {
		for(int i=0; i<10; i++) {
			workobject.methodA();
		}
	}
	
}
