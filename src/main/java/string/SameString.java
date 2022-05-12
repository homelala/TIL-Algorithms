package string;

import java.util.Scanner;


// 7. 회문 문자열
public class SameString {
    public String solution(String str) {
//        // 내 풀이
//        String temp = str.toLowerCase();
//        char[] x = temp.toCharArray();
//        int left = 0;
//        int right = temp.length() - 1;
//        while (left < right) {
//            if (x[left] != x[right]) {
//                return "NO";
//            }
//            left++;
//            right--;
//        }

//        // 길이의 반만 돌면 된다.
//        str = str.toLowerCase();
//        int len = str.length();
//        for (int i = 0; i < len / 2; i++) {
//            if (str.charAt(i) != str.charAt(len - i - 1)) {
//                return "No";
//            }
//        }

        // StringBuilder 사용
        // equalsIgnoreCase -> 대소문자 무시
        String tmp = new StringBuilder(str).reverse().toString();
        if (str.equalsIgnoreCase(tmp)) {
            return "NO";
        }
        return "YES";
    }

    public static void main(String[] args) {
        SameString T = new SameString();
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        System.out.println(T.solution(str));
    }
}
