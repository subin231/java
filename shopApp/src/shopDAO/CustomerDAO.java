package shopDAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import shopDB.DBHelper;
import shopDB.SQL;
import shopVO.CustomerVO;

public class CustomerDAO extends DBHelper {
	
	private static CustomerDAO instance = new CustomerDAO();

	public static CustomerDAO getInstance() {
		return instance;
	}

	private CustomerDAO() {}
	
	
	// 기본 CRUD 메서드
	public int insertCustomer(CustomerVO vo) {
		
		int count = 0;
		
		try {
			conn = getConnection();
			psmt = conn.prepareStatement(SQL.INSERT_CUSTOMER);
			psmt.setString(1, vo.getCustid());
			psmt.setString(2, vo.getName());
			psmt.setString(3, vo.getHp());
			psmt.setString(4, vo.getAddr());
			count = psmt.executeUpdate();
			closeAll();;
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return count;
	}
	
	public CustomerVO selectCustomer(String custid) {
		
		CustomerVO vo = null;
		try {
			conn = getConnection();
			psmt = conn.prepareStatement(SQL.SELECT_CUSTOMER);
			psmt.setString(1, custid);
			rs = psmt.executeQuery();
			
			if(rs.next()) {
				vo = new CustomerVO();
				vo.setCustid(rs.getString(1));
				vo.setName(rs.getString(2));
				vo.setHp(rs.getString(3));
				vo.setAddr(rs.getString(4));
				vo.setRdate(rs.getString(5));
			}
			closeAll();;
			
		} catch (Exception e) {

		}
		return vo;
	}
	
	public List<CustomerVO> selectCustomers() {
		List<CustomerVO> users = new ArrayList<>();
		
		try {
			conn = getConnection();
			psmt = conn.prepareStatement(SQL.SELECT_CUSTOMERS);
			rs = psmt.executeQuery();
			
			while(rs.next()) {
				CustomerVO vo = new CustomerVO();
				vo.setCustid(rs.getString(1));
				vo.setName(rs.getString(2));
				vo.setHp(rs.getString(3));
				vo.setAddr(rs.getString(4));
				vo.setRdate(rs.getString(5));
				 
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
	
	public int updateCustomer(CustomerVO vo) {
		return 0;
	}
	
	public int deleteCustomer(CustomerVO vo) {
		return 0;
	}
	
}
