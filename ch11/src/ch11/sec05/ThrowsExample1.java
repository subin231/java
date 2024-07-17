package ch11.sec05;

public class ThrowsExample1 {
	public static void main(String[] args) {
		
		try {
			findClass();
		} catch (Exception e) {
			System.out.println("예외 처리 : " + e.toString());
		}
		
		
	}

	private static void findClass() throws ClassNotFoundException {
		Class.forName("java.lang.String2");
		
	}
}
