package sub1;


import java.awt.Button;
import java.awt.Container;
import java.awt.Dimension;

import javax.swing.JFrame;
import javax.swing.JLabel;

/*
 * 날짜 : 2024-07-25
 * 이름 : 조수빈
 * 내용 : 자바 GUI Swing 실습하기
 */

public class HelloSwingTest {
	
	public static void main(String[] args) {
	
		// 윈도우 생성
		JFrame frame = new JFrame("Hello Swing");
		frame.setPreferredSize(new Dimension(300, 500));
		frame.pack();
		frame.setVisible(true);
		
		
		//컨테이너 생성
		Container container = frame.getContentPane();
		
		//컴포넌트 배치
		JLabel label = new JLabel("Hello Swing!");
		container.add(label);
		
		Button btn = new Button("확인");
		btn.setBounds(10, 100, 100, 100);
		container.add(btn);
		
		if(btn.equals(1)) {
			frame.setVisible(false);
		}


		
		
		
	}
	
}
