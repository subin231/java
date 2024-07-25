package sub3;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class ChatServer {
	public static void main(String[] args) {
		
		System.out.println("[Server]");
		
		ServerSocket serversocket = null;
		Socket socket = null;
		
		try {
			serversocket = new ServerSocket(9001);
			System.out.println("연결 대기 ...");
			socket = serversocket.accept();
			
			
			System.out.println("연결 성공");
			
			Thread t1 = new SendThread(socket);
			Thread t2 = new ReceiveThread(socket);
			
			
		} catch (Exception e) {
			e.getMessage();
		}
		
		
	}
}
