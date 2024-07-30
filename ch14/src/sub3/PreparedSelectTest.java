package sub3;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import sub2.User1VO;

/*
 * 날짜 : 2024-07-29
 * 이름 : 조수빈
 * 내용 : select 실습
 */

public class PreparedSelectTest {
	public static void main(String[] args) {
		String Host = "jdbc:mysql://127.0.0.1:3306/studydb";
		String user = "root";
		String pass = "1234";
		
		
		List<User2VO> user2s = new ArrayList<>();
		
		//결과 처리 리스트 생성
		
		
		try {
			//1단계 - 데이터베이스 접속
			Connection conn = DriverManager.getConnection(Host,user,pass);
			//2단계 - sql 실행 객체 생성
			
			String sql = "select * from `user2`";
			PreparedStatement psmt = conn.prepareStatement(sql);
						
			//3단계 sql 실행
			ResultSet rs = psmt.executeQuery();
			
			
			//4단계 ResultSet 결과처리
			while(rs.next()) {
				String uid = rs.getString(1);
				String name = rs.getString(2);
				String birth = rs.getString(3);
				String addr = rs.getString(4);
				
				
				User2VO vo = new User2VO();
				
				vo.setUid(rs.getString(1));
				vo.setName(rs.getString(2));
				vo.setBirth(rs.getString(3));
				vo.setAddr(rs.getString(4));
				
				user2s.add(vo);
				
			}
			
			//5단계 접속종료
			rs.close();
			psmt.close();
			conn.close();
			
			
		} catch (Exception e) {
		}
		for(User2VO vo : user2s) {
			System.out.println(vo);
		}
		
		System.out.println("출력 완료");
	}
}
