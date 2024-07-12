package ch07.sec02.exam01;

public class SmartPhoneExample extends Phone {
	
	public static void main(String[] args) {
		
		SmartPhone sp = new SmartPhone("갤럭시", "은색");
		
		System.out.println("모델" + sp.model);
		System.out.println("모델" + sp.color);
		
		System.out.println("와이파이상태"+sp.wifi);
		
	}
	
}
