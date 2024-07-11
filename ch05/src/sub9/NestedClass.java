package sub9;

class Outer {
	private int x;
	
	public Outer(int x) {
		this.x = x;
	}
	
	public void show() {
		System.out.println("outer x : " + x);
	}
	
	class Inner {
		private int x;
		
		public Inner(int x) {
			this.x = x;
		}
		
		public void show() {
			System.out.println("Inner x : " + x);
		}
		
	}
}

interface Person{
	public void hello(String a); 
}




public class NestedClass {
	public static void main(String[] args) {
		
		//외부 객체 생성
		Outer out = new Outer(1);
		out.show();
	
		//내부 객체 생성
		Outer.Inner in = out.new Inner(2);
		in.show();
		
		//익명 객체 생성(interface) : 인터페이스를 클래스를 구현하지 않고 new 생성한 객체임
		Person p = new Person() {
			
			@Override
			public void hello(String a) {
				System.out.println("Person Hello" +" "+ a);
			}
		};
		p.hello("하기싫다");
		
		
	}
}
