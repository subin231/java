package sub3;



public class CountThread extends Thread {

	private Count count;
	
	public CountThread(Count count) {
		this.count = count;
	}
	

	@Override
	public void run() {
		
		try {
			for(int i=0; i<100; i++) {
				count.setNum(i);
			}
		} catch (NullPointerException e) {
			e.printStackTrace();
		}
		
	}
}
