package sub2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class SocketServer {
	public static void main(String[] args) {
		BufferedReader in = null;
		PrintWriter out = null;
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("[server]");
		
		ServerSocket ss = null;
		
		try {
			ss = new ServerSocket();
			ss.bind(new InetSocketAddress("localhost",50001));
			
			System.out.println("연결 대기...");
			Socket socket = ss.accept();
			
			in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			out = new PrintWriter(socket.getOutputStream());
			System.out.println("연결 수립...");
			
			
//			// 데이터 수신(Client -> Server)
//			InputStream is = socket.getInputStream();
//			
//			byte[] bytes = new byte[100];
//			int readBytes = is.read(bytes);
//			
//			String message = new String(bytes, 0, readBytes, "UTF-8");
//			System.out.println(message);
//			
//			System.out.println("데이터 수신 완료...");
//			
//						
//			// 데이터 송신(Client <- Server)
//			OutputStream os = socket.getOutputStream();
//			
//			String sendMessage = "Hello Client!";			
//			byte[] messageBytes = sendMessage.getBytes();
//			
//			os.write(messageBytes);
//			os.flush();
//			
//			System.out.println("데이터 송신 완료...");

			
			
			while(true) {
				String inputMessage = in.readLine();	// 수신데이터 한줄씩 읽기	
				if ("quit".equalsIgnoreCase(inputMessage)) break;
				
				System.out.println("From Client: " + inputMessage);
				System.out.print("전송하기>>> ");
				
				String outputMessage = scanner.nextLine();
				out.println(outputMessage);
				out.flush();
				if ("quit".equalsIgnoreCase(outputMessage)) break;
			}
			
			
			
		} catch (IOException e) {
			e.printStackTrace();
		}finally {
			if(!ss.isClosed()) {
				try {
					ss.close();
				} catch (IOException e) {
					e.printStackTrace();
					System.out.println("소켓통신에러");
				}
			}
		}
		
		
		
		
		System.out.println("서버 종료");
	}
}
