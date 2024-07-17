package sub2;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;
/**
 * 날짜 : 2024-07-17
 * 이름 : 조수빈
 * 내용 : 스택 and 큐 실습하기
*/

public class StackQueueTest {
	public static void main(String[] args) {
		
		
		//Stack 5->1 가는 후입선출
		
		Stack<Integer> stack = new Stack<Integer>();
		
		stack.push(1);
		stack.push(2);
		stack.push(3);
		stack.push(4);
		stack.push(5);
		
		while(!stack.empty())
		{
			System.out.print(stack.pop() + ",");
		}
		System.out.println();
		
		
		//Queue 1->5 가는 선입선출
		Queue<Integer> queue = new LinkedList<Integer>();		
		
		queue.offer(1);
		queue.offer(2);
		queue.offer(3);
		queue.offer(4);
		queue.offer(5);
		
		while(!queue.isEmpty())
		{
			System.out.print(queue.poll() + ",");
		}
		
		
		
	}
}
