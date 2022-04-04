package string;

import java.util.Scanner;

public class ReverseString {
    public String solution(String str) {
        String answer = "";
        for (int i = str.length()-1; i >= 0; i--) {
            answer += str.charAt(i);
        }
        return answer;
    }

    public static void main(String[] args) {
        ReverseString T = new ReverseString();
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        for (int i = 0; i < num; i++) {
            String input1 = sc.next();
            System.out.println(T.solution(input1));
        }
    }
}
