package string;

import java.util.Scanner;

public class FindString {

    public int solution(String str, char ch) {
        int count = 0;
        String uppStr = str.toUpperCase();
        char uppCh = Character.toUpperCase(ch);
        for (char i : uppStr.toCharArray()) {
            if (i == uppCh) {
                count += 1;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        FindString T = new FindString();
        Scanner sc = new Scanner(System.in);
        String input1 = sc.next();
        char input2 = sc.next().charAt(0);

        System.out.println(T.solution(input1, input2));
    }
}
