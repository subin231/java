package sub4;

public class Person {
	
	protected String name;
	protected int age;
	
	
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	public void work() {
		System.out.println("person is working");
	}
	
	public void introduce() {
		System.out.print("제이름은["+name+"]이고 나이는 ["+age+"]세, ");
	}
}
