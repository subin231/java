package test3;

class Car{
	private String brand;
	private String name;
	private int price;
	
	public Car(String brand, String name, int price) {
		this.brand = brand;
		this.name = name;
		this.price = price;
	}
	public void dirve() {
		System.out.println(name + "운행 중 ....");
	}
	public void info() {
		System.out.println("브랜드" + brand);
		System.out.println("차량명" + name);
		System.out.println("가격" + price);
		System.out.println("  ");
	}
}
public class Test03 {
		
	public static void main(String[] args) {
		Car sonatCar = null;
		Car bmwCar = null;
				
		Car sonata 	 = 	new Car("현대","소나타",3000);
		Car bmw		 = 	new Car("BMW","520d",3000);
	
		sonata.dirve();
		sonata.info();
		
		bmw.dirve();
		bmw.info();
	}
}
