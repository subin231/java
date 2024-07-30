package user5;

import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class User5Main {
	public static void main(String[] args) {
		System.out.println("-----------------------------");
		System.out.println("회원 관리 매니저 v5.0");
		System.out.println("-----------------------------");
		
		Scanner scan = new Scanner(System.in);
		
		while(true) {
			System.out.println("종료:0, 입력:1, 조회:2, 검색:3, 수정:4, 삭제:5");
			System.out.print("선택 : ");
			
			int answer = scan.nextInt();
			
			if(answer == 0) {
				System.out.println("종료합니다");
				
				//입력
			}else if(answer == 1) {
				System.out.print("순번 입력");
				int seq = scan.nextInt();
				System.out.print("이름 입력");
				String name = scan.next();
				System.out.print("성별 입력");
				String gender = scan.next();
				System.out.print("나이 입력");
				int age = scan.nextInt();
				System.out.print("주소 입력");
				String addr = scan.next();
				
				User5VO vo = new User5VO(seq, name, gender, age, addr);
				
				User5DAO dao = User5DAO.getInstance();
				
				dao.insertUser(vo);
				System.out.println("insert 완료");
				
				//조회
			}else if(answer == 2) {
				User5DAO dao = User5DAO.getInstance();
				List<User5VO> users = dao.selectUsers();
				
				for(User5VO user : users) {
					System.out.println(user);
				}
				
				
				//검색
			}else if(answer == 3) {
				System.out.println("순번 입력");
				String search = scan.next();
				
				User5DAO dao = User5DAO.getInstance();
				User5VO user = dao.selectUser(search);
				
				System.out.println(user);
				
				//수정
			}else if(answer == 4) {
				User5VO user = new User5VO();
				System.out.print("순번 입력");
				int seq = scan.nextInt();
				System.out.print("이름 입력");
				String name = scan.next();
				System.out.print("성별 입력");
				String gender = scan.next();
				System.out.print("나이 입력");
				int age = scan.nextInt();
				System.out.print("주소 입력");
				String addr = scan.next();
				
				int result = User5DAO.getInstance().updateUser(user);
				
				System.out.println(user);

				if(result > 0) {
					System.out.println("수정완료");
				}else {
					System.out.println("수정 할 회원 아이디가 없습니다.");
				}
				
				
				
				//삭제
				//int로 받아올 시 0값을 가져오기때문에 set(seq)로 설정 필요함.
			}else if(answer == 5) {
				User5VO user = new User5VO();
				System.out.print("순번 입력 : ");
				int seq = scan.nextInt();
				user.setSeq(seq);
				
				int result = User5DAO.getInstance().deleteUser(user.getSeq());
				
				System.out.println(result);
				
				System.out.println(user);

				if(result > 0) {
					System.out.println("삭제완료");
				}else {
					System.out.println("삭제 할 회원 아이디가 없습니다.");
				}
				
			}else {
				break;
			}
			
		}
		System.out.println("완료");
		return;
	}
}
