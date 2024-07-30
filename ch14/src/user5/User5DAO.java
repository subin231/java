package user5;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import user5.User5VO;
import user5.User5DAO;

public class User5DAO {

	//싱글톤
	private static User5DAO instance = new User5DAO();
	public static User5DAO getInstance() {
		return instance;
	}

	private User5DAO() {	}
	
	private final static String HOST = "jdbc:mysql://127.0.0.1:3306/studydb";
	private final static String USER = "root";
	private final static String PASS = "1234";
	
	
	//CRUD 메서드
	public void insertUser(User5VO vo) {
		
		try {
			Connection conn = DriverManager.getConnection(HOST, USER, PASS);
			
			String sql = "insert into `user5` values (?,?,?,?,?)";
			PreparedStatement psmt = conn.prepareStatement(sql);
			
			psmt.setInt		(1, vo.getSeq());
			psmt.setString	(2, vo.getName());
			psmt.setString	(3, vo.getGender());
			psmt.setInt		(4, vo.getAge());
			psmt.setString	(5, vo.getAddr());
			
			psmt.executeUpdate();			
			
			psmt.close();
			conn.close();
			
		} catch (Exception e) {
			
		}
		
		
	}
	public User5VO selectUser(String uid) {
		String sql = "select * from `user5` where `seq`=?";
		User5VO user = null; 
		
		try {
			
			Connection conn = DriverManager.getConnection(HOST, USER, PASS);
			PreparedStatement psmt = conn.prepareStatement(sql);
			psmt.setString(1, uid);
			
			ResultSet rs = psmt.executeQuery();
			
			// 조회결과가 1 또는 0이기 때문에 while 대신 if문으로 next()
			if(rs.next()) {
				user = new User5VO();
				user.setSeq(rs.getInt(1));
				user.setName(rs.getString(2));
				user.setGender(rs.getString(3));
				user.setAge(rs.getInt(4));
				user.setAddr(rs.getString(5));
			}
			rs.close();
			psmt.close();
			conn.close();
		}catch (Exception e) {
			e.printStackTrace();
		}
		
		return user;
	}
	
	
	public List<User5VO> selectUsers() {
		String sql = "select * from `user5`";
		List<User5VO> users = new ArrayList<>();
		
		try {
			Connection conn = DriverManager.getConnection(HOST, USER, PASS);
			Statement stmt = conn.createStatement();
			ResultSet rs = stmt.executeQuery(sql);
			
			while(rs.next()) {
				User5VO vo = new User5VO();
				vo.setSeq(rs.getInt(1));
				vo.setName(rs.getString(2));
				vo.setGender(rs.getString(3));
				vo.setAge(rs.getInt(4));
				vo.setAddr(rs.getString(5));
				
				users.add(vo);
			}
			
			rs.close();
			stmt.close();
			conn.close();
			
		}catch (Exception e) {
			e.printStackTrace();
		}
		
		return users;
	}
	
	
	public int updateUser(User5VO vo) {
		
		String sql = "update `user5` set `name` = '?',`gender` ='?',`age` ='?',`addr` ='?'where `seq` = '?' ";
		int result = 0;
		
		try {
			Connection conn = DriverManager.getConnection(HOST, USER, PASS);
			PreparedStatement psmt = conn.prepareStatement(sql);
			
			psmt.setString	(1, vo.getName());
			psmt.setString	(2, vo.getGender());
			psmt.setInt		(3, vo.getAge());
			psmt.setString	(4, vo.getAddr());
			psmt.setInt		(5, vo.getSeq());
			
			result = psmt.executeUpdate();			
			
			psmt.close();
			conn.close();
			
		} catch (Exception e) {
			
		}
		return result;
		
	}
	public int deleteUser(int seq) {
		String sql = "delete from `user5` where `seq` = ? ";
		int result = 0;
		
		try {
			Connection conn = DriverManager.getConnection(HOST, USER, PASS);
			PreparedStatement psmt = conn.prepareStatement(sql);
			
			psmt.setInt(1, seq);
			
			result = psmt.executeUpdate();			
			
			psmt.close();
			conn.close();
			
		} catch (Exception e) {
			
		}
		return result;
		
	}

}
