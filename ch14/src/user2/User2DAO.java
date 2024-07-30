package user2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import user2.User2VO;
import user2.User2DAO;

public class User2DAO {

	//싱글톤
	private static User2DAO instance = new User2DAO();
	public static User2DAO getInstance() {
		return instance;
	}

	private User2DAO() {}
	
	private final static String HOST = "jdbc:mysql://127.0.0.1:3306/studydb";
	private final static String USER = "root";
	private final static String PASS = "1234";
	
	
	//CRUD 메서드
	public User2VO insertUser(User2VO vo) {
		String sql = "insert into `user2` values (?,?,?,?,?)";
		try {
			Connection conn = DriverManager.getConnection(HOST, USER, PASS);
			PreparedStatement pstm = conn.prepareStatement(sql);
			
			pstm.setString	(1, vo.getUid());
			pstm.setString	(2, vo.getName());
			pstm.setString	(3, vo.getBirth());
			pstm.setString	(4, vo.getHp());
			pstm.setString	(5, vo.getAddr());
			
			pstm.executeUpdate();
			
		} catch (SQLException e) {

			e.printStackTrace();
		}
		return vo;
	}
	
	public User2VO selectUser(String uid) {
		String sql = "select * from `user2` where `uid` = ?";
		User2VO user = null;
		try {
			Connection conn = DriverManager.getConnection(HOST, USER, PASS);
			PreparedStatement psmt = conn.prepareStatement(sql);
			psmt.setString(1, uid);
			
			ResultSet rs = psmt.executeQuery();
			
			// 조회결과가 1 또는 0이기 때문에 while 대신 if문으로 next()
			if(rs.next()) {
				user = new User2VO();
				user.setUid(rs.getString(1));
				user.setName(rs.getString(2));
				user.setBirth(rs.getString(3));
				user.setHp(rs.getString(4));
				user.setAddr(rs.getString(5));
			}
			rs.close();
			psmt.close();
			conn.close();
			
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return user;
	}
	public List<User2VO> selectUsers() {
		Connection conn;
		List<User2VO> users = new ArrayList<>();
		String sql = "select * from `user2`";
		try {
			conn = DriverManager.getConnection(HOST, USER, PASS);
			PreparedStatement psmt = conn.prepareStatement(sql);
			ResultSet rs = psmt.executeQuery(sql);
			
			while(rs.next()) {
				User2VO vo = new User2VO();
				vo.setUid(rs.getString(1));
				vo.setName(rs.getString(2));
				vo.setBirth(rs.getString(3));
				vo.setHp(rs.getString(4));
				vo.setAddr(rs.getString(5));
				users.add(vo);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return users;
	}
	public int updateUser(User2VO vo) {
		String sql = "update `user2` set `name` = '?',`birth` ='?',`hp` ='?',`addr` ='?'where `uid` = '?' ";
		int result = 0;
		
		try {
			Connection conn = DriverManager.getConnection(HOST, USER, PASS);
			PreparedStatement psmt = conn.prepareStatement(sql);
			
			psmt.setString	(1, vo.getName());
			psmt.setString	(2, vo.getBirth());
			psmt.setString	(3, vo.getHp());
			psmt.setString	(4, vo.getAddr());
			psmt.setString	(5, vo.getUid());
			
			result = psmt.executeUpdate();			
			
			psmt.close();
			conn.close();
		}catch (Exception e){
			e.getMessage();
		}
		return result;
	}
	public int deleteUser(String uid) {
		String sql = "delete from `user2` where `uid` = '?' ";
		int result = 0;
		
		try {
			Connection conn = DriverManager.getConnection(HOST, USER, PASS);
			PreparedStatement psmt = conn.prepareStatement(sql);
					
			psmt.setString	(1, uid);
			
			result = psmt.executeUpdate();			
			
			psmt.close();
			conn.close();
		}catch (Exception e){
			e.getMessage();
		}
		return result;
	}
	
	

}
