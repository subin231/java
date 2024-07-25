package sub2;

public class Person {
	
	private String id;
	private String name;
	private String hp;
	private int age;
	
	public Person(String id, String name, String hp, int age) {
		this.id = id;
		this.name = name;
		this.hp = hp;
		this.age = age;
	}
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getHp() {
		return hp;
	}
	public void setHp(String hp) {
		this.hp = hp;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
}
