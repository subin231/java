package test4;

import java.util.ArrayList;
import java.util.Random;

public class Test06 {
    public static void main(String[] args) {
        printList(createList());
    }

    static void printList(ArrayList<Integer> scoreList) {
        int total = 0;
        int size = scoreList.size();
        
        for (int i = 0; i < size; i++) {
            int score = scoreList.get(i);
            
            total += score;
            
            if (i == size - 1) {
                System.out.print(score + " = ");
            } else {
                System.out.print(score + " + ");
            }
        }
        System.out.println(total);
    }

    static ArrayList<Integer> createList() {
        ArrayList<Integer> scoreList = new ArrayList<>();
        Random rand = new Random();
        
        for (int i = 0; i < 10; i++) {
            int num = rand.nextInt(41) + 60;
            scoreList.add(num);
        }
        
        return scoreList;
    }
}