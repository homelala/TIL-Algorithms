package array;

import java.util.Scanner;

// 8. 등수 구하기
public class GetRank {
    public int[] solution(int count, int[] arr) {
        // 내 풀이
        int[] answer = new int[count];
        for (int i = 0; i < count; i++) {
            int rank = 1;
            for (int j = 0; j < count; j++) {
                if (arr[i] < arr[j]) {
                    rank++;
                }
            }
            answer[i] = rank;
        }
        return answer;
    }

    public static void main(String[] args) {
        GetRank T = new GetRank();
        Scanner sc = new Scanner(System.in);
        int count = sc.nextInt();
        int[] arr = new int[count];
        for (int i =0;i<count;i++) {
            arr[i] = sc.nextInt();
        }

        for (int i : T.solution(count, arr)) {
            System.out.print(i + " ");
        }

    }
}
