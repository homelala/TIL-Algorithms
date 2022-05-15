package string;

import java.util.Scanner;

// 11. 문자열 압축 문제
public class CompressString {
    public String solution(String str) {
//        // 내 풀이
          String answer = "";
//        int count = 1;
//        for (int i = 0; i < str.length(); i++) {
//            if (i == str.length() - 1) {
//                if (str.charAt(i) == str.charAt(i - 1)) {
//                    answer += (str.charAt(i) + String.valueOf(count));
//                }else{
//                    answer += str.charAt(i);
//                }
//            }else{
//                if (str.charAt(i) == str.charAt(i+1)) {
//                    count++;
//                }else{
//                    if (count > 1) {
//                        answer += (str.charAt(i) + String.valueOf(count));
//                    }else{
//                        answer += str.charAt(i);
//                    }
//                    count = 1;
//                }
//            }
//
//        }

        // 문자열 끝에 indexOutOfRange를 위해 빈문자하나를 추가하는 법
        int count = 1;
        str += " ";
        for (int i = 0; i < str.length()-1; i++) {
            if(str.charAt(i) == str.charAt(i+1)){
                count ++;
            }else{
                answer += str.charAt(i);
                if(count > 1){
                    answer += String.valueOf(count);
                }
                count = 1;
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        CompressString T = new CompressString();
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        System.out.println(T.solution(str));
    }
}
