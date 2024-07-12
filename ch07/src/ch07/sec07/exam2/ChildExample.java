package ch07.sec07.exam2;


public class ChildExample {
	public static void main(String[] args) {
		Child ch = new Child();
		
		Parent pr = ch;
		
		pr.method1();
		pr.method2();
		
	}
}
