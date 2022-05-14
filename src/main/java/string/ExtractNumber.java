package string;

import java.util.Scanner;

//9. 숫자만 추출
public class ExtractNumber {
    public int solution(String str) {


        // 내 풀이
//        String answer = "";
//        char[] x = str.toCharArray();
//        for (char temp : x) {
//            if (!Character.isAlphabetic(temp)) {
//                answer += temp;
//            }
//        }
//
//        return Integer.parseInt(answer);

        // 아스키 코드를 이용한 풀이
        int answer = 0;
        for (char temp : str.toCharArray()) {
            if (temp >= 48 && temp <= 57) {
                answer = answer * 10 + (temp - 48);
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        ExtractNumber T = new ExtractNumber();
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        System.out.println(T.solution(str));
    }
}
