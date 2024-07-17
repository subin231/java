package sub1;


// Alt + Shift + s 버튼으로 선택하면 됨

public class Apple {
	private String country;
	private int price;
	
	
	//생성자 생성
	public Apple(String country, int price) {
		this.country = country;
		this.price = price;
	}
	
	//객체 정보 출력 메소드
	@Override
	public String toString() {
		return "Apple [country=" + country + ", price=" + price + "]";
	}

	public void show() {
		System.out.println("원산지 : " + country);
		System.out.println("원산지 : " + price);
	}
}
