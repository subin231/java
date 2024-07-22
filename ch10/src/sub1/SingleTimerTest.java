package sub1;

import java.sql.Time;
import java.util.Timer;
import java.util.TimerTask;

public class SingleTimerTest {

	
	public static void main(String[] args) {
		
		Timer t1 = new Timer();
		TimerTask TT = new TimerTask() {
			
			@Override
			public void run() {
				int count = 0;
				for(int i=0; i<5; i++) {
					if(count <= 5) {
						System.out.println(count + "test");
						count++;
					}
					else {
						t1.cancel();
					}
				}
			}
		};
		t1.schedule(TT, 100);
		
		System.out.println("종료");
		
	}
	
	
}
