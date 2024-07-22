package sub3;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

/*
 * 날짜 : 2024-07-18
 * 이름 : 조수빈
 * 내용 : 직렬화 실습하기
 */

public class SerializeTest {

	public static void main(String[] args) {
		
		//복사 대상 및 name설정
		String path = "C:\\Users\\lotte4\\Desktop\\apple.txt";
		
		
		Apple apple = new Apple("korea", 3000);
		
		try {
			FileOutputStream fos = new FileOutputStream(path);
			ObjectOutputStream oos = new ObjectOutputStream(fos);

			
			//복사
			oos.writeObject(apple);
			
			//객체 해제
			oos.close();
			fos.close();
			
			
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println("프로그램 종료");
		
		
	}
	
}
