package test3;

import java.util.Locale.Category;

class Product{
	protected String category;
	protected int price;
	
	public Product(String category, int price) {
		this.category = category;
		this.price = price;
	}
	public void info() {}
}

class Television extends Product{
	
	public Television(String catagory, int price) {
		super(catagory, price);
	}
	
	@Override
	public void info() {
		System.out.println("분류 : " + category);
		System.out.println("가격 : " + price);
	}
}

class Computer extends Product{
	public Computer(String catagory, int price) {
		super(catagory, price);
	}
	
	public void info() {
		System.out.println("분류 " + category);
		System.out.println("가격 " + price);
	}
}

public class Test08 {
	public static void main(String[] args) {
		Product p1 = new Television("가전", 100);
		Product p2 = new Computer("컴퓨터", 150);

		p1.info();
		p2.info();
		
		
	}
}
