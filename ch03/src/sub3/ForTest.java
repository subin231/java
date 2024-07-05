package sub3;

/*
 * 날짜 : 2024-07-01
 * 이름 : 조수빈
 * 제목 : ch03. For반복문 실습
 */

public class ForTest {
	public static void main(String[] args) {
		
		//for
		for(int i = 1; i<=10; i++) {
			System.out.println("i : "+ i);
		}

		
		//1부터 10까지 합
		int sum = 0;
		for(int i = 0; i<=10; i++) {
			sum += i;
		}
		System.out.println("1부터 10까지 합 : " + sum);
		
		
		//1부터 10까지 짝수 합
		int total = 0;
		for(int i = 0; i<=10; i++) {
			// 2,4,6,8,10 의 합을 구해야 하므로 %2를 하여 0이 나오는 것으로만 계산해야함.
			// 조건에 == 는 2의 배수 != 3의 배수 됨
			if(i%2 == 0) {
				total += i;	
			}
		}
		System.out.println("1부터 10까지 짝수 합 : " + total);
		
		
		
		//for 중첩
		for(int a = 1; a<=3; a++) {
			System.out.println("a : " + a);	
			for(int b = 1; b<=5; b++) {
				System.out.println("b : " + b);
				for(int c = 1; c<=7; c++) {
					System.out.println("c : " + c);
				}
			}
		}
		
		
		//구구단
		for(int x=1; x<=9; x++) {
			System.out.println("-------"+x+"단"+"-------");
			for(int y=1; y<=9; y++) {
				int z = x * y;
				System.out.println(x +" x "+ y + "=" + z);
			}
		}
		
		
		//별 삼각형
		for(int start=10; start>=0; start--) {
			for(int end=1; end<=start; end++) {
				System.out.print("★");
			}
			System.out.println();
		}
		
	}
	
}
