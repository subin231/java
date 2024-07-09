package sub4;

/*
 * 날짜 : 2024-07-09 
 * 이름 : 조수빈
 * 내용 : 클래스 상속 실습하기
 */


public class InheritenceTest {
	public static void main(String[] args) {
		
		// 상속 개체 생성
		
		Sedan sonata = new Sedan("소나타","흰색",0,2000);
		sonata.speedUp(100);
		sonata.speedDown(40);
		sonata.show();
		
		
		Truck bongo = new Truck("봉고","남색",0,1000);
		bongo.speedUp(100);
		bongo.speedDown(20);
		bongo.show();
		
		
		//stockAccount 실습 (bank, acc, name, balancem, stock, amount, price)
		stockAccount kb = new stockAccount("kb증권", "101-11-1001", "김춘추", 10000, "삼성전자", 10, 50000);
		kb.deposit(1000000);
		kb.buy(20, 50000); //amount , price
		kb.sell(10, 50000);
		kb.show();
		
		
		Doctor dc = new Doctor("홍길동", 20, "방사선과");
		Engineer eg = new Engineer("김춘추", 20, "컴퓨터");
		dc.work();
		eg.work();
		
	}
}
