package sub2;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;

/*
 * 날짜 : 2024-07-18
 * 이름 : 조수빈
 * 내용 : 파일 메서드를 이용한 파일 복사 실습하기
 */


public class FileTransferTest {
	public static void main(String[] args) {
		//원본
		String source = "C:\\Users\\lotte4\\Desktop\\single.zip";
		
		//복사 대상 및 name설정
		String target = "C:\\Users\\lotte4\\Desktop\\single2.zip";
		
		
		try {
			// 입력스트림 생성 및 파일 연결
			FileInputStream fis = new FileInputStream(source);
			FileOutputStream fos = new FileOutputStream(target);
			
			//file 복사
			fis.transferTo(fos);
			
			// 객체 해제
			fis.close();
			fos.close();
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("프로그램 종료");
		
	}
}
