package sub2;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.util.Scanner;

/*
 * 이름 : 조수빈
 * 일자 : 2024-07-24
 * 내용 : 소켓 통신 실습하기
 */



public class SocketClient {
	public static void main(String[] args) {
		
		System.out.println("[Client]");
		
		
		BufferedReader in = null;
		PrintWriter out = null;
		
		Socket sc = null;
		Scanner scanner = new Scanner(System.in);
		
		
		try {
			sc = new Socket();
			
			System.out.println("연결 요청...");
			sc.connect(new InetSocketAddress("localhost", 50001));
			
			in = new BufferedReader(new InputStreamReader(sc.getInputStream()));
			out = new PrintWriter(sc.getOutputStream());
			
			System.out.println("연결 성공...");
			
//			//데이터 송신 (client -> server)
//			OutputStream os = sc.getOutputStream();
//			
//			String message = "Hello world";
//			byte[] messageBytes = message.getBytes();
//			
//			os.write(messageBytes);
//			os.flush();
//			System.out.println("데이터 송신 완료");
//			
//			//데이터 수신 (client <- server)
//			
//			
//			InputStream is = sc.getInputStream();
//			
//			byte[] bytes = new byte[100];
//			int readBytes = is.read(bytes);
//			
//			String receiveMessage = new String(bytes, 0, readBytes, "UTF-8");
//			System.out.println(receiveMessage);
//			
//			System.out.println("데이터 수신 완료...");
			
			
			while(true) {
				System.out.println("메세지 전송하기");
				String outputMessage = scanner.nextLine();
				out.println(outputMessage);
				out.flush();
				
				if("quit".equalsIgnoreCase(outputMessage)) break;
				
				
				String inputMessage = in.readLine();
				System.out.println("From Server :" + inputMessage);
				
				if("quit".equalsIgnoreCase(inputMessage)) break;
			}
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println(e.getMessage());
		}finally {
			if(!sc.isClosed()) {
				try {
					sc.close();
				} catch (Exception e) {
					e.printStackTrace();
					System.out.println("소켓통신 에러");
				}
			}
		}
		
		
		
	}
}
