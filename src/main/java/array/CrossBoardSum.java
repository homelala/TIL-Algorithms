package array;

import java.util.Scanner;

// 9. 격자판 합 구하기
public class CrossBoardSum {
    public int solution(int count, int[][] arr) {
        // 내 풀이
        int answer = 0;
        int temp2 = 0;
        for (int i = 0; i < count; i++) {
            int temp = 0;
            int temp1 = 0;
            for (int j = 0; j < count ; j++) {
                temp += arr[i][j];
                temp1 += arr[j][i];
            }
            answer = Math.max(temp, answer);
            answer = Math.max(temp1, answer);
            temp2 += arr[i][i];
        }
        answer = Math.max(temp2, answer);

        return answer;
    }

    public static void main(String[] args) {
        CrossBoardSum T = new CrossBoardSum();
        Scanner sc = new Scanner(System.in);
        int len = sc.nextInt();
        int[][] arr = new int[len][len];
        for (int i =0;i<len;i++) {
            for (int j = 0; j < len; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        System.out.print(T.solution(len, arr));

    }
}
