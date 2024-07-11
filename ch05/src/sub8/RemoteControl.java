package sub8;
/*
 * interface : 표준화된 클래스이며, 설계에 사용되는 구조체이고 
 * 오직 추상메서드만 사용이 가능하다.
 */
public interface RemoteControl {
	
	public abstract void powerOn();
	public abstract void powerOff();
	
	public void chUp();  //abstract 커맨드 생략 가능
	public void chDown();
	
	public void soundUp();
	public void soundDown();

	public void show();
}
