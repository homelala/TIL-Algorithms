package string;

import java.util.Scanner;

// 10. 가장 짧은 문자거리
public class MostShortestStringLength {
    public int[] solution(String str, char t) {
        int[] answer = new int[str.length()];
        int len = 1000;

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == t) {
                len = 0;
            }else{
                len++;
            }
            answer[i] = len;
        }
        len = 1000;
        for (int i =str.length()-1; i >=0; i--) {
            if (str.charAt(i) != t) {
                len++;
                answer[i] = Math.min(answer[i], len);
            }else{
                len = 0;
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        MostShortestStringLength T = new MostShortestStringLength();
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        char t = sc.next().charAt(0);
        for (int x : T.solution(str, t)) {
            System.out.print(x + " ");
        }
    }
}
