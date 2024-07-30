package sub4;
/*
 * 날짜 : 2024-07-30
 * 이름 : 조수빈
 * 내용 : 트랜젝션 실습하기
 */

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class TransactionTest {
	
	private final static String HOST = "jdbc:mysql://127.0.0.1:3306/bank";
	private final static String USER = "root";
	private final static String PASS = "1234";
	
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.print("에러를 발생 하시겠습니까?");
		
		int answer = scan.nextInt();
	
		Connection conn = null;
		
		try {
			conn = DriverManager.getConnection(HOST, USER, PASS);
			
			//transaction 시작 -> 커밋모드 false 로 변경 필요
			//자바는 자동으로 커밋모드 처리가 되어있음 그래서 동시 다발적 처리하기 위해 비활성화 후 마지막에 커밋을 처리해야함.
			conn.setAutoCommit(false);
			
			
			String sql1 = "update `bank_account` set `a_balance` = `a_balance` - 10000 where `a_no` = ?" ;
			String sql2 = "update `bank_account` set `a_balance` = `a_balance` + 10000 where `a_no` = ?" ;
			
			PreparedStatement psmt1 = conn.prepareStatement(sql1);
			psmt1.setString(1, "101-11-1001");
			
			PreparedStatement psmt2 = conn.prepareStatement(sql2);
			psmt2.setString(1, "101-11-1003");
			
			
			psmt1.executeUpdate();
			if(answer == 1) {
				throw new Exception("에러가 발생했습니다");
			}
			
			psmt2.executeUpdate();
			
			//트랜젝션 커밋 필요(작업 성공 처리)
			conn.commit();
		
			psmt1.close();
			psmt2.close();
			conn.close();
			
			
		} catch (SQLException e) {
			
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();

			try {
				//트랜젝션 실패처리 
				conn.rollback();
			} catch (SQLException e1) {
				e1.printStackTrace();
			}
			
		}
		System.out.println("트랜젝션 종료");
		
	}
}
