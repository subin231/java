package sub1;

/*
 * 날짜 : 2024-07-08
 * 이름 : 조수빈
 * 내용 : 클래스와 객체 실습하기
 */


public class ClassTest {
	
	public static void main(String[] args) {
		
		//객체 생성
		Car sonata = new Car();		//참조타입(클래스 참조)

		//객체 초기화
		sonata.name = "sonata";
		sonata.color = "흰색";
		sonata.speed = 0;
		
		//객체 활용 (상호작용)
		
		sonata.speedUp(100);
		sonata.speedDown(10);
		sonata.show();
		
		System.out.println("----------------------------");
		
		
		Car avante = new Car();
		avante.name  = "아반떼";
		avante.color = "흰색";
		avante.speed = 0;
		
		avante.speedUp(100);
		avante.speedDown(50);
		avante.show();
		
		
		System.out.println("----------------------------");
		// Account 객체 생성
		Account kb = new Account();
		
		kb.bank = "국민은행";
		kb.acc = "101-21-1001";
		kb.name = "김유신";
		kb.balance = 10000;
		
		kb.deposit(40000);
		kb.withdraw(30000);
		kb.show();
		System.out.println("----------------------------");
		System.out.println("");
		
		
		
		
		/*
		 * 클래스 : Account
		 * 객체명 : wc(우리은행)
		 * 초기화 : 우리은행, 101-22-1001, 김춘추, 10000
		 * 입금액 : 20000
		 * 
		 * <출력>
		 * 은행명 : 우리은행
		 * 계좌번호 : 101-22-1001
		 * 입금주 : 김춘추
		 * 현재잔액 : 15000
		 */
		
		// 객체생성
		Account wc = new Account();
		
		// 객체 초기화
		wc.bank = "우리은행";
		wc.acc = "101-22-1001";
		wc.name = "김춘추";
		wc.balance = 10000;
		
		//객체 활용
		wc.deposit(20000);
		wc.withdraw(15000);
		wc.show();
		
		
		
		
		
	}
	
}
