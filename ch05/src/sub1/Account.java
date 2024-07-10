package sub1;

public class Account {
	
	String bank;
	String acc;
	String name;
	int balance = 10000;	
	
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
