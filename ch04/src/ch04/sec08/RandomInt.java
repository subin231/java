package ch04.sec08;

import java.util.Random;

public class RandomInt {
	public static void main(String[] args) {
		Random rd = new Random();

	        for(int i=0;i<6;i++) {
	            System.out.print((rd.nextInt(45)+1)+",");
		}
	}
}

