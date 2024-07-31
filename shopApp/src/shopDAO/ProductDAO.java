package shopDAO;

import java.util.ArrayList;
import java.util.List;

import shopDB.DBHelper;
import shopDB.SQL;
import shopVO.CustomerVO;
import shopVO.ProductVO;

public class ProductDAO extends DBHelper {
	
	private static ProductDAO instance = new ProductDAO();

	public static ProductDAO getInstance() {
		return instance;
	}
	
	private ProductDAO() {}
	

	public int insertProduct(ProductVO vo) {

		return 0;
	
	}
	public ProductVO selectProduct(int prodNo) {
		ProductVO vo = null;
		try {
			conn = getConnection();
			psmt = conn.prepareStatement(SQL.SELECT_PRODUCT);
			psmt.setInt(1, prodNo);
			rs = psmt.executeQuery();
			
			if(rs.next()) {
				vo = new ProductVO();
				vo.setProdno(rs.getInt(1));
				vo.setProdname(rs.getString(2));
				vo.setStock(rs.getInt(3));
				vo.setPrice(rs.getInt(4));
				vo.setCompany(rs.getString(5));
			}
			closeAll();;
			
		} catch (Exception e) {

		}
		return vo;
	}
	public List<ProductVO> selectProducts() {
		List<ProductVO> products = new ArrayList<>();
		
		try {
			conn = getConnection();
			stmt = conn.createStatement();
			rs = stmt.executeQuery(SQL.SELECT_PRODUCTS);
			
			while(rs.next()) {
				
				ProductVO vo = new ProductVO();
				vo.setProdno(rs.getInt("prodNo"));
				vo.setProdname(rs.getString("prodName"));
				vo.setStock(rs.getInt("stock"));
				vo.setPrice(rs.getInt("price"));
				vo.setCompany(rs.getString("company"));
				
				products.add(vo);
			}
			
			closeAll();
		}catch (Exception e) {
			e.printStackTrace();
		}
		
		return products;
	}
	public void updateProduct() {
		return;
	}
	public void deleteProduct() {
		return;
	}
	
	
}
