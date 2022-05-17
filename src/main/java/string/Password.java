package string;

import java.util.*;

public class Password {
    public String solution(int count, String str) {
        String answer = "";
        for(int i = 0; i <count; i++){
            String temp = str.substring(0,7)
                    .replace("#","1")
                    .replace("*","0");
            int i1 = Integer.parseInt(temp, 2);
            answer += (char)i1;
            str = str.substring(7);
        }

        return answer;
    }

    public static void main(String[] args) {
        Password T = new Password();
        Scanner sc = new Scanner(System.in);
        int count = sc.nextInt();
        String input1 = sc.next();

        System.out.println(T.solution(count, input1));
    }
}
