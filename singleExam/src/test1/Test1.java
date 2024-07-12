package test1;

class Student{
	String gkrrhk;
	int gkrqjs;
	
}


public class Test1 {
	public static void main(String[] args) {
		Student st = new Student();
		
		st.gkrrhk = "컴퓨터공학";
		st.gkrqjs = 1;
		
		System.out.println(st.gkrrhk + "과 학년은"+st.gkrqjs + "학년 입니다.");
	}
}
