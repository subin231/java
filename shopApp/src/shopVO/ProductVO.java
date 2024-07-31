package shopVO;

public class ProductVO {
	private int prodNo;
	private String prodName;
	private int stock;
	private int price;
	private String company;
	
	public ProductVO() {
		super();
	}

	public ProductVO(int prodno, String prodname, int stock, int price, String company) {
		super();
		this.prodNo = prodno;
		this.prodName = prodname;
		this.stock = stock;
		this.price = price;
		this.company = company;
	}

	
	public int getProdno() {
		return prodNo;
	}

	public void setProdno(int prodno) {
		this.prodNo = prodno;
	}

	public String getProdname() {
		return prodName;
	}

	public void setProdname(String prodname) {
		this.prodName = prodname;
	}

	public int getStock() {
		return stock;
	}

	public void setStock(int stock) {
		this.stock = stock;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}

	@Override
	public String toString() {
		return "ProductVO [prodno=" + prodNo + ", prodname=" + prodName + ", stock=" + stock + ", price=" + price
				+ ", company=" + company + "]";
	}
	
	
	
	
}
