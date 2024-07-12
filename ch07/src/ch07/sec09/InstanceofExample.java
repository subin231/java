package ch07.sec09;

public class InstanceofExample {
	public static void personInfo(Person person) {
		System.out.println("name : "+person.name);
		person.walk();
		
		if(person instanceof Student student) {
			System.out.println("student NO : "+ student.studentNo);
		}
		
	}
	public static void main(String[] args) {
		Person p1 = new Person("홍길동");
		
		personInfo(p1);
		
		System.out.println();
		
		Person p2 = new Student("고길동",10);
		personInfo(p2);
		
		
	}
}
