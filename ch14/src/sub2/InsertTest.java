package sub2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

/*
 * 날짜 : 2024-07-29
 * 이름 : 조수빈
 * 내용 : insert 실습
 */

public class InsertTest {
	
	public static void main(String[] args) {
		
		
		String Host = "jdbc:mysql://127.0.0.1:3306/studydb";
		String user = "root";
		String pass = "1234";
		
		try {
			// 1단계 - 데이터베이스 접속
			Connection conn = DriverManager.getConnection(Host,user,pass);
			
			// 2단계 - sql실행 객체 statement 생성
			Statement stmt = conn.createStatement();
			
			// 3단계 - sql 실행
			String sql = "insert into `user1` VALUES('J101','김유신','1990-01-21','010-1234-1001','23')";
			stmt.executeUpdate(sql);
			
			// 4단계 - Resultset 결과처리(Select일 경우)
			// 5단계 - 접속 종료
			stmt.close();
			conn.close();
			
		} catch (SQLException e) {
			System.out.println("실패");
			e.printStackTrace();
		} 
		System.out.println("Insert 완료");
	}
}
