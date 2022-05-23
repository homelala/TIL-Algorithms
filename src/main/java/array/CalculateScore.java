package array;

import java.util.ArrayList;
import java.util.Scanner;

// 7. 점수 계산
public class CalculateScore {
    public int solution(int count, int[] arr) {
        // 내 풀이
        int answer = 0;
        int score = 0;
        for (int t : arr) {
            if (t == 0) {
                score = 0;
                continue;
            }
            score++;
            answer += score;
        }
        return answer;
    }

    public static void main(String[] args) {
        CalculateScore T = new CalculateScore();
        Scanner sc = new Scanner(System.in);
        int count = sc.nextInt();
        int[] arr = new int[count];
        for (int i =0;i<count;i++) {
            arr[i] = sc.nextInt();
        }

        System.out.print(T.solution(count, arr));

    }
}
