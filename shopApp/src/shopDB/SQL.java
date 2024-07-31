package shopDB;

public class SQL {
//customer 부분
	public static final String INSERT_CUSTOMER  = "insert into `customer` set "
													+ "`custid`=?,"
													+ "`name`=?,"
													+ "`hp`=?,"
													+ "`addr`=?,"
													+ "`rdate`=NOW()";
													
	
	public static final String SELECT_CUSTOMER 	 = "select * from `customer` where `custid`=?";
	
	public static final String SELECT_CUSTOMERS  = "select * from `customer`";
	
	public static final String UPDATE_CUSTOMER 	 = "update `customer` set "
													+ "`name`=?"
													+ "`hp`=?"
													+ "`addr`=?"
													+ "where `custid` = ?";
	
	public static final String DELETE_CUSTOMER 	 = "delete from `customer` where `custid` = ?";

	//product 부분 (수업시간 상품등록은 생략)
	
	public final static String SELECT_PRODUCTS = "SELECT * FROM `Product`";
	public final static String SELECT_PRODUCT  = "SELECT * FROM `Product` WHERE `prodNo`=?";
	
	
	//order 부분
	public static final String SELECT_ORDER = "select * from `order` where `orderNo`=?";
	public static final String SELECT_ORDERS = "select * from `order`";
	public static final String SELECT_ORDERS_BY_RESULT = "select * from `order` where `orderid` = ?";
	public final static String INSERT_ORDER = "INSERT INTO `Order` SET "
											+ "`orderId`=?," 
											+ "`orderProduct`=?," 
											+ "`orderCount`=?," 
											+ "`orderDate`=NOW()";
	
	
	
	
	
	
}


