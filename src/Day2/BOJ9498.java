package Day2;

import java.util.Scanner;

public class BOJ9498 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int score = sc.nextInt();
        String grade = "F";
        if(score >= 90) {
            grade = "A";
        }
        else if(score >= 80) {
            grade = "B";
        } else if(score >= 60 && score <= 69) {
            grade = "C";
        }

        System.out.println(grade);
    }
}
