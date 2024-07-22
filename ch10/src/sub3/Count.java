package sub3;

class Count {
	
	private int num;
	
	
	public int getNum() {
		return num;
	}
	
	public synchronized void setNum(int a) {
		num++;
	}
	
	
}
