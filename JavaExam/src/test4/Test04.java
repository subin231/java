package test4;

public class Test04 {
	public static void main(String[] args) {
		
		String filename = "Helloworld.java";
		
		int idx = filename.indexOf(".");
		
		String title = filename.substring(0, idx);
		String ext = filename.substring(idx+1);
		
		System.out.println("파일명 : " + title);
		System.out.println("파일명 : " + ext);
		
		String strScores = "60, 72, 82, 86, 92";
		String[] scores = strScores.split(",");
		
		
		int total = 0;
			for(String score : scores) {
				total += Integer.parseInt(score.trim());
			}
				
	    System.out.println("strScores 총점 : " + total);
	}
}
