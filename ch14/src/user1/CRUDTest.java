package user1;

import java.util.List;
import java.util.Scanner;

/*
 * 날짜 : 2024-07-30
 * 이름 : 조수빈
 * 내용 : 자바 CRUD 실습하기
 */


public class CRUDTest {
	
	
	public static void main(String[] args) {
		

		System.out.println("-----------------------------");
		System.out.println("회원 관리 매니저 v1.0");
		System.out.println("-----------------------------");
		
		Scanner scan = new Scanner(System.in);
		
		while(true) {
			System.out.println("종료:0, 입력:1, 조회:2, 검색:3, 수정:4, 삭제:5");
			System.out.print("선택 : ");

			
			int answer = scan.nextInt();
			
			if(answer == 0) {
				break;
			}else if(answer == 1) {
				
				System.out.print("아이디 입력");
				String uid = scan.next();
				System.out.print("이름 입력");
				String name = scan.next();
				System.out.print("생년월일 입력");
				String birth = scan.next();
				System.out.print("휴대폰 입력");
				String hp = scan.next();
				System.out.print("나이 입력");
				int age = scan.nextInt();
				
				User1VO vo = new User1VO(uid, name, birth, hp, age);
				
				UserDAO dao = UserDAO.getInstance();
				dao.insertUser(vo);
				
				System.out.println("입력 완료");
				
				//2번 조회
			}else if(answer == 2) {
							
				UserDAO dao = UserDAO.getInstance();
				List<User1VO> users = dao.selectUsers();
				
				for(User1VO user : users) {
					System.out.println(user);
				}
				
				
			}else if(answer == 3) {
				
				System.out.print("검색 아이디 : ");
				String searchUid = scan.next();
				
				UserDAO dao = UserDAO.getInstance();
				User1VO user = dao.selectUser(searchUid);
				
				System.out.println(user);
				
				
				
			}else if(answer == 4) {
				
				User1VO user = new User1VO();
				System.out.print("수정 할 회원 아이디 입력 : ");
				user.setUid(scan.next());
				System.out.print("이름 입력");
				user.setName(scan.next());
				System.out.print("생년월일 입력");
				user.setBirth(scan.next());
				System.out.print("휴대폰 입력");
				user.setHp(scan.next());
				System.out.print("나이 입력");
				user.setAge(scan.nextInt());
				
				
				
				
				int result = UserDAO.getInstance().updateUser(user);
				
				if(result > 0) {
					System.out.println("수정완료");
				}else {
					System.out.println("수정 할 회원 아이디가 없습니다.");
				}
				
				System.out.println("수정 완료");
				
			}else if(answer == 5) {
				
				User1VO user = new User1VO();
				System.out.print("삭제 회원 아이디 입력 : ");
				user.setUid(scan.next());
	
				
				int result = UserDAO.getInstance().deleteUser(user.getUid());
				
				if(result > 0) {
					System.out.println("삭제 완료");
				}else {
					System.out.println("삭제 할 회원 아이디가 없습니다.");
				}
			}//end if
		}//end while
		scan.close();
		System.out.println("프로그램 종료");
	}
}
