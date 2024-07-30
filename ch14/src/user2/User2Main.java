package user2;

import java.util.List;
import java.util.Scanner;

import user2.User2VO;
import user2.User2DAO;

public class User2Main {

	
	
	
	public static void main(String[] args) {
		System.out.println("-----------------------------");
		System.out.println("회원 관리 매니저 v2.0");
		System.out.println("-----------------------------");
		
		Scanner scan = new Scanner(System.in);
				
		
		
		while(true) {
			System.out.println("종료:0, 입력:1, 조회:2, 검색:3, 수정:4, 삭제:5");
			System.out.print("선택 : ");
			int a = scan.nextInt();
			if(a == 0) {
				break;
			}else if(a == 1) {
				System.out.print("아이디 입력");
				String uid = scan.next();
				System.out.print("이름 입력");
				String name = scan.next();
				System.out.print("생년월일 입력");
				String birth = scan.next();
				System.out.print("휴대폰 입력");
				String hp = scan.next();
				System.out.print("나이 입력");
				String addr = scan.next();
				
				User2VO vo = new User2VO(uid, name, birth, hp, addr);
				User2DAO dao = User2DAO.getInstance();
				
				dao.insertUser(vo);
				System.out.println("성공완료");
				
			}else if(a == 2) {
				User2DAO dao = User2DAO.getInstance();
				List<User2VO> users = dao.selectUsers();
				
				for(User2VO user : users) {
					System.out.println(user);
				}
				
			}else if(a == 3) {
				System.out.print("검색 아이디 : ");
				String searchUid = scan.next();
				
				User2DAO dao = User2DAO.getInstance();
				User2VO user = dao.selectUser(searchUid);
				
				System.out.println(user);
				
			}else if(a == 4) {
				User2VO user = new User2VO();
				System.out.print("수정 할 회원 아이디 입력 : ");
				user.setUid(scan.next());
				System.out.print("이름 입력");
				user.setName(scan.next());
				System.out.print("생년월일 입력");
				user.setBirth(scan.next());
				System.out.print("휴대폰 입력");
				user.setHp(scan.next());
				System.out.print("주소 입력");
				user.setAddr(scan.next());
				
				int result = User2DAO.getInstance().updateUser(user);
				
				if(result > 0) {
					System.out.println("수정완료");
				}else {
					System.out.println("수정 할 회원 아이디가 없습니다.");
				}
				
				System.out.println("수정 완료");
			}else if(a == 5) {
				User2VO user = new User2VO();
				System.out.print("삭제 할 회원 아이디 입력 : ");
				user.setUid(scan.next());
			
				int result = User2DAO.getInstance().deleteUser(user.getUid());
				
				if(result > 0) {
					System.out.println("삭제완료");
				}else {
					System.out.println("삭제 할 회원 아이디가 없습니다.");
				}
			}
			
		}//while 끝
		
	}
}
