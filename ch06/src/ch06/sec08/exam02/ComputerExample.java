package ch06.sec08.exam02;

public class ComputerExample {
	public static void main(String[] args) {
		Computer com = new Computer();
		
		int result = com.sum(1, 2, 3);
		System.out.println("result : "+ result);
		
		int result1 = com.sum(1,2,3,4,5);
		System.out.println("result : "+ result1);
		
		int[] values = {1,2,3,4,5};
		int result2 = com.sum(values);
		System.out.println("result : "+ result2);
		
		int result3 = com.sum(new int[] {1,2,3,4,5});
		System.out.println("result : "+ result3);
	}
}
