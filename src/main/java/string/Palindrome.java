package string;

import java.util.Scanner;

public class Palindrome {
    public String solution(String str) {
        // 내 풀이
        str = str.toLowerCase();
        str = str.replaceAll("[^a-z]", "");
        String temp = new StringBuilder(str).reverse().toString();
        if (!temp.equals(str))
            return "NO";
        return "YES";
    }

    public static void main(String[] args) {
        Palindrome T = new Palindrome();
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        System.out.println(T.solution(str));
    }
}
