package sub4;

public class Account {
	
	
	private String bank;
	private String acc;
	private String name;
	protected int balance = 10000;	
	
	//초기화
	public Account(String bank, String acc, String name, int balance ) {
		this.bank = bank;
		this.acc = acc;
		this.name = name;
		this.balance = balance;
	}
	
	
	//set - get
	
	public void setBank(String bank) {
		this.bank = bank;
	}
	public String getBank() {
		return bank;
	}
	
	
	
	public void setName(String name) {
		this.name = name;
	}
	public String getName() {
		return name;
	}
	
	
	// 활용
	public void deposit(int a) {
		this.balance += a;
		
	}
	public void withdraw(int b) {
		this.balance -= b;
	}
	
	
	
	public void show() {
		System.out.println("은행명 : "+bank);
		System.out.println("계좌번호 : " + acc);
		System.out.println("입금주 : " +name);
		System.out.println("현재잔액 : "+balance);
	
		
		
	}
}
