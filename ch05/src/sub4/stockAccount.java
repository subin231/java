package sub4;

public class stockAccount extends Account {
	
	private String stock;
	private int amount;
	private int price;
	
	public stockAccount(String bank,String acc,String name, int balance,String stock,int amount,int price) {
		super(name, acc, name, balance); //부모클래스 생성자 상속
		
		this.stock = stock; // 초기화
		this.amount = amount;
		this.price = price;
	}
	
	//amount, price
	public void buy(int amount, int price) {
		this.amount +=amount;
		this.balance += amount * price;
	}
	public void sell(int x, int y) {
		this.amount -=x;
		this.balance -=x*y;
	}
	public void show() {
		super.show();
		System.out.println("주식종목 : " + stock);
		System.out.println("주식수량 : " + amount);
		System.out.println("현재가격 : " + price);
	}

	
}
