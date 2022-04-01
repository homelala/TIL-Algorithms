package string;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StringInWord {
    public String solution(String str) {
        String answer = "";
        int m = Integer.MIN_VALUE, pos;
        String[] list = str.split(" ");
//        for (String s : list) {
//            if (s.length() > answer.length()) {
//                answer = s;
//            }
//        }
        while ((pos = str.indexOf(' '))!= -1) {
            String tmp = str.substring(0, pos);
            int len = tmp.length();
            if (len > m) {
                m = len;
                answer = tmp;
            }
            str = str.substring(pos + 1);
        }
        // 마지막 단어 처리
        if(str.length() > m){
            answer += str;
        }
        return answer;
    }
    public static void main(String[] args) {
        StringInWord T = new StringInWord();
        Scanner sc = new Scanner(System.in);
        String input1 = sc.nextLine();
        System.out.println(T.solution(input1));
    }
}
