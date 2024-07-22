package sub4;

public class ThreadB extends Thread{
	private WorkObject workobject;
	
	public ThreadB(WorkObject workobject) {
		setName("ThreadB");
		this.workobject = workobject;
	}
	
	@Override
	public void run() {
		for(int i=0; i<10; i++) {
			workobject.methodB();
		}
	}
	
}
