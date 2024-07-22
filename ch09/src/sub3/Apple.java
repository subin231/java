package sub3;

import java.io.Serializable;



public class Apple implements Serializable {
	/**
	 *  객체로 변경되어서 객체 ID 지정해주기
	 */
	private static final long serialVersionUID = 1L;
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
	
	public void show(Apple apple) {
		System.out.println("원산지 : " + country);
		System.out.println("가격 : " + price);
	}
	
}
