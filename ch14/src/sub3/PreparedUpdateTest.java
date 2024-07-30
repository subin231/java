package sub3;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

/*
 * 날짜 : 2024-07-29
 * 이름 : 조수빈
 * 내용 : PreparedStatement 실습
 */

public class PreparedUpdateTest {
	public static void main(String[] args) {
		
		String host = "jdbc:mysql://127.0.0.1:3306/studydb";
		String user = "root";
		String pass = "1234";
		
		try {
			//1단계 - db접속
			Connection conn = DriverManager.getConnection(host,user,pass);
			
			
			//2단계 - sql 실행 객체(preparedstatement)
			String sql = "UPDATE `user2` SET `name` = ?, `addr` = ? WHERE `uid` = ?";					
			PreparedStatement psmt = conn.prepareStatement(sql);
			psmt.setString(1, "김철수");
			psmt.setString(2, "부산광역시");
			psmt.setString(3, "J101");
			
			
			//3단계 - sql 실행
			psmt.executeUpdate();
			
			System.out.println("데이터처리 완료");
			//4단계 - Resultset 결과처리
			//5단계 - db종료
			psmt.close();
			conn.close();
			
			
		} catch (Exception e) {
			e.getMessage();
		}
		
	}
}
