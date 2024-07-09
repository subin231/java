package sub3;

// 클래스 정의

public class Car {
	
	// 속성은 무조건 private 선언 (클래스의 변수 : 멤버변수)
	private String name;
	private String color;
	private int speed;
	
	
	//클래스 변수 선언(정적변수)
	public static int count;
	
	//private 이후 생성자(method) 생성 그러나 반환타입이 없음 
	// 생성자 : 캡슐화된 클래스 속성을 초기화하는 메서드
	// 멤버변수에 속성 대입
	public Car(String name, String color, int speed) {
		this.name = name;
		this.color = color;
		this.speed = speed;
		count++;
		//호출될 때 count를 추가함
		
	}
	
	
	//정적 메소드
	public int getTotalCount() {
		return count;
	}
	
	
	
	
	
	/*get - set 은 셋트
	setter 정의 : 캡슐화된 속성에 대한 추가적인 수정을 위한 메서드
	사용이유 : 직접적으로 변경 불가능한 속성을 처리하기위함.
	*/
	public void setColor(String color) {
		this.color = color;
	}
	
	//getter 정의 :
	public String getColor() {
		return color;
	}
	
	// 기능(멤버 메서드)
	public void speedUp(int speed) {
		this.speed += speed; //this -> 클래스를 치칭 
	}
	
	public void speedDown(int speed) {
		this.speed -= speed;
	}
	
	public void show() {
		System.out.println("차량명 : "+ this.name);
		System.out.println("차량색 : "+ this.color);
		System.out.println("현재속도 : "+ this.speed);
	}
	
}