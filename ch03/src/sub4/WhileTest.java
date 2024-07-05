package sub4;

/*
 * 날짜 : 2024-07-01
 * 이름 : 조수빈
 * 제목 : ch03.sub4 while 반복문 실습
 */

public class WhileTest {
	public static void main(String[] args) {
		
		
		// 1~10까지 합
		int sum = 0;
		int k = 1;
		
		while( k <= 10)	{
			sum = sum + k;
			k++;
		}
		System.out.println("1부터 10까지 합 : " + sum);
		
		
		// do - while
		int total = 0;
		int j = 1;
		
		do {
			if(j%2==0) {
				total = total + j;
			}
			j++;
		}while(j<=10);
			
			System.out.println("1부터 10까지 짝수 합 : " + total);
			
			
		// break
		int num = 1;
		while(true) {
			
			if(num%5 == 0 && num%7 == 0) {
				break;
			}
			num++;
		}
		System.out.println("5와 7의 최소공배수 : " + num);
		
		
		// continue
		int a = 0;
		int i = 0;
		
		while(i<=10) {
			
			i++;
			
			if(i%2 != 0) {
				continue; // 반복문의 처음으로 이동한다.
			}
			a = a + i;
		}
		System.out.println("1~10까지 짝수 합: " + a);
		
	}	
}
