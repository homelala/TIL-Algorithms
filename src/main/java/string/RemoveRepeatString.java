package string;

import java.util.Scanner;

// 6. 중복 문자 제거
public class RemoveRepeatString {
    public String solution(String str) {
        String answer = "";
//        // 내 풀이
//        char [] x = str.toCharArray();
//        for(char tmp: x){
//            if(!answer.contains(String.valueOf(tmp))){
//                answer += tmp;
//            }
//        }

        for(int i =0;i<str.length();i++){
            // indexOf -> 처음 발견된 문자의 위치를 반환
            if(i == str.indexOf(str.charAt(i))){
                answer += str.charAt(i);
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        RemoveRepeatString T = new RemoveRepeatString();
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        System.out.println(T.solution(str));
    }
}
