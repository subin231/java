package sub1;

/*
 * 날짜 : 2024-07-02
 * 이름 : 조수빈
 * 제목 : 자바 배열 실습하기
 */

public class ArrayTest {
	public static void main(String[] args) {
		
		// 배열
		int[] arr1 = {1, 2, 3, 4, 5};
		char[] arr2 = {'A','B','C'};
		String[] arr3 = {"서울","대전","대구","부산","광주"};
						// 각각의 데이터를 원소라고 부름
		System.out.println("arr1[0] 1번 원소 : "+arr1[0]);
		System.out.println("arr1[1] 2번 원소 : "+arr1[1]);
		System.out.println("arr1[2] 3번 원소 : "+arr1[2]);
		
		System.out.println("arr2[0] 1번 원소 : "+arr2[0]);
		System.out.println("arr2[2] 3번 원소 : "+arr2[2]);
		
		System.out.println("arr3[0] 1번 원소 : "+arr3[0]);
		System.out.println("arr3[3] 4번 원소 : "+arr3[3]);
		System.out.println("arr3[4] 5번 원소 : "+arr3[4]);

		
		// 배열 길이 - 배열 원소 갯수
		System.out.println("arr1 배열 길이 : "+ arr1.length);
		System.out.println("arr1 배열 길이 : "+ arr2.length);
		System.out.println("arr1 배열 길이 : "+ arr3.length);
		
		
		
		// 배열 반복문
		for(int i=0; i<arr1.length; i++) {
			System.out.print(arr1[i] + " ");	
		}
		
		System.out.println("");
		
		for(char ch : arr2) {
			System.out.print(ch + " , ");
		}
		// ★반복 변수를 한가지 기입 후 거기에 배열을 넣어서 반복 출력하게함.
		
		
		System.out.println("");
		
		
		for(String str : arr3) {
			System.out.print(str + " \n " );
		}
		
		
		// 1차원 배열
		int[] scores = {80, 60, 78, 62, 92};  // ★위 score 에 s를 붙이는것이 관례임 (복수형이라는 네이밍)
		int total = 0;
		
		for(int score : scores) {
			total += score;
		}
		
		System.out.println("scores의 합 : "+ total);
		
		// 2차원 배열 - 행렬(matrix)
		int[][] arr2d = {{1, 2, 3, 4},
				      	 {5, 6, 7, 8},
				      	 {9, 10, 11, 12}};
		
		for(int a=0; a<3; a++) {
			
			for(int b=0; b<4; b++) {
				
				System.out.println("arr2d [" +a+"]" + "["+ b+ "]"+ arr2d[a][b]);
				
			}
		}
		
		
		// 3차원 배열
		int[][][] arr3d = {{{ 1,  2,  3},
							{ 4,  5,  6},
							{ 7,  8,  9}},
						   {{10, 11, 12},
							{13, 14, 15}, 
							{16, 17, 18}}, 
						   {{19, 20, 21},
							{22, 23, 24}, 
							{25, 26, 27}}};
		
		for(int a=0; a<3; a++) {
			
			for(int b=0; b<3; b++) {
				
				for(int c=0; c<3; c++) {
					
					System.out.printf("arr3d[%d][%d][%d]: %d\n",a,b,c, arr3d[a][b][c]);
							 //["+a+"]"+"["+b+"]"+"["+c+"]"
				}
			}
		}
	}
}
