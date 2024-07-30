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
			
			
			
		} catch (SQLException e) {

			e.printStackTrace();
		}
		
		
		return vo;
	}
	
	public void selectUser() {
		return;
	}
	public void selectUsers() {
		return;
	}
	public void updateUser() {
		return;
	}
	public void deleteUser() {
		return;
	}
	
	

}
