package sub1;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;

/*
 * 날짜 : 2024-07-18
 * 이름 : 조수빈
 * 내용 : 파일 입출력 스트림 실습하기
 */

public class FileIOTest {
	public static void main(String[] args) throws IOException {

		String source = "C:\\Users\\lotte4\\Desktop\\sample.txt";
		String target = "C:\\Users\\lotte4\\Desktop\\sample2.txt";
		
		
		
		try {
			// 입력스트림 생성 및 파일 연결
			FileInputStream fis = new FileInputStream(source);
			FileOutputStream fos = new FileOutputStream(target);
			
			while(true) {
				//파일 읽기
				int data = fis.read();
				
				
				
				if(data == -1) {
					//더 이상 읽을 파일 내용이 없을 경우
					break;
				}
				char ch = (char) data;
				//파일 읽은 내용 그대로 출력
				System.out.print(ch);
				
				//파일 쓰기
				fos.write(data);
				
				
				
			}
			
			// 스트림 객체 자원 해제
			fis.close();
			fos.close();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("프로그램 종료");
	}
}
