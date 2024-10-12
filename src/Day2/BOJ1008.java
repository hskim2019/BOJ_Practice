package Day2;

import java.util.Scanner;

public class BOJ1008 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double A = sc.nextInt();
        double B = sc.nextInt();
        
        // float double => 정밀도
        // float => 소수점 6~7자리 정도
        // double => 소수점 15~16자리 정도까지 표현이 가능
        // float 으로 제출 시 오답
        System.out.println(A/B);
    }
}
