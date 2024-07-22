package sub2;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;

/*
 * 날짜 : 2024-07-18
 * 이름 : 조수빈
 * 내용 : 버퍼 보조 스트림 실습하기
 */


public class BufferStreamTest {
	public static void main(String[] args) {
		
		String source = "C:\\Users\\lotte4\\Desktop\\single.zip";
		String target = "C:\\Users\\lotte4\\Desktop\\single2.zip";
		
		
		// 버퍼를 이용한 byte 배열 		
		byte[] buffer = new byte[1024]; // 1kb
		
		
		
		try {
			// 입력스트림 생성 및 파일 연결
			FileInputStream fis = new FileInputStream(source);
			FileOutputStream fos = new FileOutputStream(target);
			
			// 보조스트림
			/*BufferedInputStream bis = new BufferedInputStream(fis);
			BufferedOutputStream bos = new BufferedOutputStream(fos);*/
			
			
			while(true) {
				//파일 읽기
				int data = fis.read(buffer); //한번에 1kb로 읽음
				
				if(data == -1) {
					//더 이상 읽을 파일 내용이 없을 경우
					break;
				}
				
				//파일 쓰기
				fos.write(buffer, 0 ,data);

				
			}
			
			//buffer는 자원 해제하기 전 버퍼 비우기 활성화 시키는것이 좋음
			//bos.flush();
			
			
			// 스트림 객체 자원 해제(순서는 버퍼 먼저 후 스트림 해제)
			//bis.close();
			//bos.close();
			
			fis.close();
			fos.close();
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("프로그램 종료");
		
	}
}
