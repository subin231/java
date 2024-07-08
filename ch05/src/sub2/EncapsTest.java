package sub2;
/*
 * 날짜 : 2024-07-08
 * 이름 : 조수빈
 * 내용 : 캡슐화 실습하기
 */

public class EncapsTest {
	
	public static void main(String[] args) {
		
		// Car 객체 생성 및 초기화
		Car sonata = new Car("소나타", "흰색", 0);
		
		// 객체 활용
		
		sonata.speedUp(80);
		sonata.setColor("은색");
		sonata.speedDown(20);
		sonata.show();
		
		System.out.println("-------------------------");
		
		
		Car avante = new Car("아반떼", "검정색", 0);
		
		avante.speedUp(100);
		avante.speedDown(40);
		avante.show();
		
		
		
		System.out.println("----------------------------");
		// Account 객체 생성 및 초기화
		Account kb = new Account("국민은행", "101-21-1001", "김유신", 10000);
		
		
		kb.deposit(40000);
		kb.withdraw(30000);
		
			//Q1 김유진 개명하기
		kb.setName("김유진");
		kb.show();
		
		System.out.println("----------------------------");

		
		
		// Account 객체 생성 및 초기화
		Account wr = new Account("우리은행", "101-22-1001", "김춘추", 10000);
		
		// 객체 활용
		wr.deposit(20000);
		wr.withdraw(15000);
		
			//Q2우리은행 -> 유리은행
		wr.setBank("유리은행");
		wr.show();
		
		//구분자
		System.out.println("----------------------------");
		System.out.println("");
		
		
		
		
		// 문제 : 클래스 연습문제
		// 도서관 관리 시스템의 일부로 Book클래스를 생성하고 다음 요구사항 충족
		// 속성 : title(String)  : 책 제목
		// 	      author(String) : 저자 제목
		//        isbn(String) : ISBN 번호
		//        availableCopies(int) : 이용 가능한 복사본 수 
		
		
		Book java = new Book("이것이 자바다","신용권","121-11-1001",3);
		//Book sql = new Book("혼자 공부하는 SQL", "우재남", "121-10-1101", 2);
		
		boolean result = java.borrowBook();
		
		if(java.borrowBook()) {
			System.out.println("대출 성공");
		}else {
			System.out.println("대출 실패");
		}
		
		System.out.println("남은 도서수 : "  + java.getAvailableCopies());
		java.show();
		
		
		
	}
	
}
