package ch07.sec07.exam3;


public class ChildExample {
	public static void main(String[] args) {
		Parent parent = new Child();
		
		parent.field = "data1";
		
		parent.method1();
		parent.method2();
		
		Child ch = new Child();
		
		ch.field2 = "data2";
		ch.method3();
		
		
	}
}
