package sub3;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

/*
 * 날짜 : 2024-07-18
 * 이름 : 조수빈
 * 내용 : 역 직렬화 실습하기
 */

public class DeserializeTest {

	public static void main(String[] args) {
		

		String path = "C:\\Users\\lotte4\\Desktop\\apple.txt";
		
		
		try {
			FileInputStream fis  = new FileInputStream(path);

			ObjectInputStream ois = new ObjectInputStream(fis);
			
			
			//객체 출력
			Apple apple = (Apple) ois.readObject();
			apple.show(apple);
			
			
			//객체 해제
			ois.close();
			fis.close();
			
			
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		System.out.println("프로그램 종료");
		
		
	}
	
}
