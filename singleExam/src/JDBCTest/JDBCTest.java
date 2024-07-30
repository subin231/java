package JDBCTest;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import JDBCTest.User2VO; 

public class JDBCTest {
	public static void main(String[] args) {
		
		String host = "jdbc:mysql://127.0.0.1:3306/studydb";
		String user = "root";
		String pass = "1234";
		
		Scanner scan = new Scanner(System.in);
		System.out.println("번호를 입력하시오");
		int a = scan.nextInt();
		
		List<User2VO> list = new ArrayList<>();
		
		System.out.println(a);
		//insert
		if(a == 1) {
			try {
				Connection conn = DriverManager.getConnection(host, user, pass);
				
				Statement stmt = conn.createStatement();
				
				String sql = "insert into `user2` values('J101','홍길동','1950-02-15','010-1234-5678','부산광역시') ";
				
				stmt.executeUpdate(sql);
				
				System.out.println("데이터 처리 완료");
				stmt.close();
				conn.close();
				
				
			} catch (SQLException e) {
				e.printStackTrace();
				System.out.println("데이터 처리 실패");
				
			}
			//update
		}else if(a == 2) {
			try {
				Connection conn = DriverManager.getConnection(host, user, pass);
				
				Statement stmt = conn.createStatement();
				
				String sql = "update `user2` set `name` = '연개소문' where `uid` = 'J101' ";
				
				stmt.executeUpdate(sql);
				
				System.out.println("데이터 처리 완료");
				stmt.close();
				conn.close();
				
				
			} catch (SQLException e) {
				e.printStackTrace();
				System.out.println("데이터 처리 실패");
				
			}
			//delete
		}else if(a == 3) {
			try {
				Connection conn = DriverManager.getConnection(host, user, pass);
				
				Statement stmt = conn.createStatement();
				
				String sql = "delete from `user2` where `uid` = 'j101' ";
				
				stmt.executeUpdate(sql);
				
				System.out.println("데이터 처리 완료");
				stmt.close();
				conn.close();
				
				
			} catch (SQLException e) {
				e.printStackTrace();
				System.out.println("데이터 처리 실패");
				
			}
		}
		//select 
		else if(a == 4) {
			try {
				Connection conn = DriverManager.getConnection(host, user, pass);
				
				
				
				String sql = "select * from user2 ";
				PreparedStatement psmt = conn.prepareStatement(sql);

				ResultSet rs = psmt.executeQuery();
				
				while(rs.next()) {
					rs.getString(1);
					rs.getString(2);
					rs.getString(3);
					rs.getString(4);
					rs.getString(5);
					
					User2VO vo = new User2VO();
					
					vo.setUid(rs.getString(1));
					vo.setName(rs.getString(2));
					vo.setBirth(rs.getString(3));
					vo.setHp(rs.getString(4));
					vo.setAddr(rs.getString(5));
					
					list.add(vo);
					System.out.println("user2 : "+vo);
				}
				
				
				System.out.println("데이터 처리 완료");
				psmt.close();
				conn.close();
				
				
			} catch (SQLException e) {
				e.printStackTrace();
				System.out.println("데이터 처리 실패");
				
			}
		}
		else {
			System.out.println("숫자를 입력하세요");
		}
	}
}
