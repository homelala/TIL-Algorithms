package string;

import java.util.Scanner;

public class UpperString {
    public String solution(String str) {
        String answer = "";
        for (char i : str.toCharArray()) {
//            if (Character.isUpperCase(i)) {
//                answer += Character.toLowerCase(i);
//            }else{
//                answer += Character.toUpperCase(i);
//            }
            if (i >= 65 && i <=90) {
                answer += (char)(i+32);
            }else{
                answer += (char)(i-32);
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        UpperString T = new UpperString();
        Scanner sc = new Scanner(System.in);
        String input = sc.next();

        System.out.println(T.solution(input));
    }
}
